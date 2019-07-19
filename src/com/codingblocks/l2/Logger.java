package com.codingblocks.l2;

public class Logger {
    private Logger(){

    }

    private static Logger instance;

    public static Logger getInstance() {

        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }
}
