package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
public class SpringLoggingHelper {
    
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
   
    public void helpMethod(){
        logger.debug("This is a debug message from helper in MicroService-01");
        logger.info("This is an info message  from helper in MicroService-01");
        logger.warn("This is a warn message  from helper in MicroService-01");
        logger.error("This is an error message from helper in MicroService-01");
 
    }
}