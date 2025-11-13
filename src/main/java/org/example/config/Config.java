package org.example.config;

public class Config {
    public static final String SYSTEM_NAME = "Users System";
    public static final int USERS_LIMIT = 5;

    static {
        System.out.println("Loading system configuration...");
    }
}
