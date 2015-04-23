package com.test.util;

import org.apache.log4j.Logger;

public class LogGen {
	private static Logger logger = Logger.getLogger(LogGen.class);
	
	public void checkLogger()
	{
		logger.info("Logger reached checkLogger");
	}
}
