package com.test.client;

import com.test.thread.ClientThread;

public class MultiClient {

	/**
	 * @param args
	 */
	public static final int NO_OF_THREADS = 10;
	
	public static void main(String[] args) {
		ClientThread[] th = new ClientThread[NO_OF_THREADS];
		for(int i=0; i<NO_OF_THREADS; i++)
		{
			th[i] = new ClientThread();
			th[i].start();
		}
		
	}

}
