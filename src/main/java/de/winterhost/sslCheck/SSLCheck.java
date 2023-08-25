package de.winterhost.sslCheck;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
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

        if (!domain.startsWith("https://")) {
            domain = "https://" + domain;
        }

        System.out.println("Starting SSL check for " + domain + "...");

        try {
            URL url = new URL(domain);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.connect();

            X509Certificate[] certificates = (X509Certificate[]) connection.getServerCertificates();

            for (X509Certificate certificate : certificates) {
                System.out.println();
                System.out.println("Subject: " + certificate.getSubjectX500Principal());
                System.out.println("Issuer: " + certificate.getIssuerX500Principal());
                System.out.println("Serial Number: " + certificate.getSerialNumber());
                System.out.println("Algorithm: " + certificate.getSigAlgName());
                System.out.println("Expiration: " + certificate.getNotAfter());
                System.out.println();
            }

        } catch (MalformedURLException e) {
            System.out.println("The entered domain is not valid!");
            System.exit(1);
        } catch (IOException ignored) {}
    }
}
