package com.michael.github;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class newClass {
    private static final Logger logger = LogManager.getLogger(newClass.class.getName());

    private final int var;

    public newClass(int var) {
        logger.info("In newClass Constructor");
        this.var = var;
    }

    public void printVar() {
        logger.info("In printVar method of newClass");
        System.out.println(var);
    }

    public void printVarPlusOne() {
        logger.info("in printVarPlusOne method of newClass");
        System.out.println(var+1);
    }
}
