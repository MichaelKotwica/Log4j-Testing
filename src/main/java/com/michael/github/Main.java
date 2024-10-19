package com.michael.github;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {

        System.out.println("Hello world!");
        logger.info("info");
        logger.error("Error");
        logger.debug("debug");
        logger.fatal("fatal");

    }
}