package org.example.entities;

import org.example.config.Config;

public class User {
    private static int nextId = 1;

    private int id;
    private String name;

    public User(String name) {
        if (nextId > Config.USERS_LIMIT) {
            throw new IllegalStateException("Max users limit reached! Users: " + (nextId - 1));
        }
        this.id = nextId++;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("ID: " + id + " | Name: " + name);
    }

    public static void showTotalUsers() {
        System.out.println("Created users total: " + (nextId - 1));
    }
}
