package com.diamond.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerSetup {
	static Logger diamondLog = LogManager.getLogger(LoggerSetup.class);
	public static void main(String[] args) {
		System.out.println("\n Hello World \n");
		diamondLog.trace("this is to trace log message");
		diamondLog.error("This is to check error message");
		diamondLog.fatal("This is to check fatal message ");
		diamondLog.debug("This is to check debug message");
		diamondLog.info("This is to check log info message");
	}
}
