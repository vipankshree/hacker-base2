@ECHO OFF

SET var1=%1
SET var2=%2

powershell.exe -executionpolicy remotesigned -File C:\Users\Administrator\Desktop\run.ps1 %var1% %var2%
