$Host.UI.RawUI.WindowTitle="mypowershell";
#Write-Host "Num Args:" $args.Length;

$strCompare = get-content $args[1];
$arrCompare = $strCompare.Split(",");
$startCount = 0;
do{
	$totalCount = (get-content $args[0]).count;
	#Write-Host "Start Length: "$startCount;
	#Write-Host "Total Length: "$totalCount;
	$diff = $totalCount-$startCount;
	if($diff)
	{
		(Get-Content $args[0]) | Select-Object -last $diff > C:\temp.txt;
		foreach ($str in $arrCompare)
		{		  
		  $lineNo = (Select-String C:\temp.txt -pattern $str)."LineNumber";
		  
		  if($lineNo.length)
		  {
			  foreach ($line in $lineNo)
			  {
				$lineP = Get-Content C:\temp.txt | Select -Index ($line - 1);
				$line += $startCount;					
				Write-Host "Line Number: "$line" Line: "$lineP;
			  }
		  }  
		}	
		Remove-Item C:\temp.txt;
		$startCount = $totalCount;
	}
	Write-Host "********************";
	start-sleep -s $args[2];
}while(1);


