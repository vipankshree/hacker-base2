package com.test.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ClientThread extends Thread{

	/**
	 * @param args
	 */
	
	public void run()
	{
		URL url;
		 
		try {
			// get URL content
			url = new URL("http://localhost:8080/LogGenerator/test?txtArea=this+is+nitish+sinha");
			URLConnection conn = url.openConnection(); 
			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
			         new InputStreamReader(conn.getInputStream()));
 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
