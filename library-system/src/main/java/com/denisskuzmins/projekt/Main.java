package com.denisskuzmins.projekt;

import java.io.*;
import java.net.*;
import java.util.*;

public class Main {

    private static int nextId = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. Hämta böcker från server");
            System.out.println("2. Hämta tidningar från server");
            System.out.println("3. Lägg till bok");
            System.out.println("4. Lägg till tidning");
            System.out.println("5. Avsluta");
            System.out.print("Val: ");

            int choice = sc.nextInt();
            sc.nextLine();

            try {
                switch (choice) {


                    case 1:
                        System.out.println(fetch("http://localhost:3000/books"));
                        break;


                    case 2:
                        System.out.println(fetch("http://localhost:3000/magazines"));
                        break;


                    case 3:
                        System.out.print("Titel: ");
                        String title = sc.nextLine();

                        System.out.print("Author: ");
                        String author = sc.nextLine();

                        String bookJson = "{"
                                + "\"id\":" + nextId++ + ","
                                + "\"title\":\"" + title + "\","
                                + "\"author\":\"" + author + "\","
                                + "\"genre\":\"Crime\","
                                + "\"pages\":200,"
                                + "\"isAvailable\":true"
                                + "}";

                        post("http://localhost:3000/books", bookJson);
                        System.out.println("Bok sparad till server!");
                        break;


                    case 4:
                        System.out.print("Titel: ");
                        String mTitle = sc.nextLine();

                        String magJson = "{"
                                + "\"id\":" + nextId++ + ","
                                + "\"title\":\"" + mTitle + "\","
                                + "\"issueNumber\":1,"
                                + "\"category\":\"Tech\","
                                + "\"publicationYear\":2025,"
                                + "\"isAvailable\":true"
                                + "}";

                        post("http://localhost:3000/magazines", magJson);
                        System.out.println("Tidning sparad till server!");
                        break;

                    case 5:
                        return;
                }

            } catch (Exception e) {
                System.out.println("Fel: " + e.getMessage());
            }
        }
    }
}