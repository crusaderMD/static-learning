package org.example;

import org.example.config.Config;
import org.example.entities.User;
import org.example.util.Util;

public class App {
    public static void main(String[] args) {
        System.out.println(Config.SYSTEM_NAME);
        Util.printLine();

        try {
            User user1 = new User(Util.toUppercase("Luiz"));
            User user2 = new User(Util.toUppercase("Roberto"));
            User user3 = new User(Util.toUppercase("Junior"));
            User user4 = new User(Util.toUppercase("Neto"));
            User user5 = new User(Util.toUppercase("Samuel"));
//            User user6 = new User(Util.toUppercase("Lacerda"));

            user1.showInfo();
            user2.showInfo();
            user3.showInfo();
            user4.showInfo();
            user5.showInfo();
//            user6.showInfo();
        }
        catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        Util.printLine();

        User.showTotalUsers();
    }
}