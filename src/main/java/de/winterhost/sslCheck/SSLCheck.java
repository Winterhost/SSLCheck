package de.winterhost.sslCheck;

import java.util.Scanner;

/**
 * Class created by Kaseax on 2023
 */
public class SSLCheck {

    public static void main(String[] args) {
        String domain;

        if (args.length == 1) {
            domain = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the domain you want to check: ");
            domain = scanner.nextLine();
            scanner.close();
        }

        if (domain.isEmpty()) {
            System.out.println("No domain entered!");
            System.exit(1);
        }

        System.out.println("Starting SSL check for " + domain + "...");


    }
}
