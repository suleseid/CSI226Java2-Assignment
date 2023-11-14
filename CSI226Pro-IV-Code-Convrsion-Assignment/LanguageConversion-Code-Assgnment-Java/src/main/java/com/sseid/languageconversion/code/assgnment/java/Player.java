/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sseid.languageconversion.code.assgnment.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
class Player {
    private String name;
    private int number;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
public class Player
{ 
    public static void player(string Sccanner, String [] args)
    {
                ArrayList<Player> players = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
    }
    
    private static void initializePlayers() {
        players.add(new Player("Alice", 10));
        players.add(new Player("Bob", 7));
        players.add(new Player("Charlie", 3));
        players.add(new Player("David", 8));
        players.add(new Player("Eve", 5));
    }
    
    private static void showMenu() 
    {
        while (true) 
        {
            System.out.println("Menu:");
            System.out.println("1. Display all players");
            System.out.println("2. Display player names");
            System.out.println("3. Display players with odd numbers");
            System.out.println("4. Display players with names that start with a letter");
            System.out.println("5. Add Player");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) 
            {
                case 1:
                    displayAllPlayers();
                    break;
                case 2:
                    displayPlayerNames();
                    break;
                case 3:
                    displayPlayersWithOddNumbers();
                    break;
                case 4:
                    displayPlayersWithLetter();
                    break;
                case 5:
                    addPlayer();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    private static void displayAllPlayers() {
        for (Player player : players) {
            System.out.println(player.getName() + " - " + player.getNumber());
        }
    }
    
    private static void displayPlayerNames() 
    {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    
    private static void displayPlayersWithOddNumbers() 
    {
        for (Player player : players) 
        {
            if (player.getNumber() % 2 != 0)
            {
                System.out.println(player.getName() + " - " + player.getNumber());
            }
        }
    }

    private static void displayPlayersWithLetter()
    {
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        letter = Character.toLowerCase(letter);

        for (Player player : players) 
        {
            if (Character.toLowerCase(player.getName().charAt(0)) == letter) 
            {
                System.out.println(player.getName());
            }
        }
    }

    private static void addPlayer() 
    {
        System.out.print("Enter player's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter player's number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); 
        players.add(new Player(name, number));
        System.out.println("Player added successfully.");
    }
}