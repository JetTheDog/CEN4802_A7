package com.mycompany.app;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {
        static ArrayList<String> toDoItems = new ArrayList<String>();
        static Scanner getUserInput = new Scanner(System.in);

        public static void main(String[] args) {
            // Default To Do Items
            toDoItems.add("Get groceries");
            toDoItems.add("Wash the car");

            System.out.println("Welcome to the To-Do-List");
            System.out.println("Enter 'A' to add an item to the list, 'D' to delete an item from the list, 'V' to view the list, and 'E' to exit.");

            while (true) {
                System.out.println("Enter a command: ");
                String userCommand = getUserInput.nextLine();
                if (Objects.equals(userCommand, "A") || Objects.equals(userCommand, "a")) {
                    addItem();

                } else if (Objects.equals(userCommand, "D") || Objects.equals(userCommand, "d")) {
                    deleteItem();

                } else if (Objects.equals(userCommand, "V") || Objects.equals(userCommand, "v")) {
                    viewItem();

                } else if (Objects.equals(userCommand, "E") || Objects.equals(userCommand, "e")) {
                    System.out.println("Goodbye");
                    return;

                } else {
                    System.out.println("Not a valid command");
                }

                System.out.println("----------------------------------");
            }
        }

        public static void addItem(){
            System.out.println("Enter an item to add to the To-Do-List: ");
            String aItem = getUserInput.nextLine();
            toDoItems.add(aItem);
        }

        public static void deleteItem(){
            System.out.println("Enter an item to delete from the To-Do-List: ");
            String dItem = getUserInput.nextLine();
            if (toDoItems.contains(dItem)) {
                toDoItems.remove(dItem);
            } else {
                System.out.println("Item does not exist");
            }
        }

        public static void viewItem(){
            System.out.println("Items To-Do: ");
            for (String item : toDoItems)
                System.out.println("- " + item);
        }

        public static int getLength() {
            return toDoItems.toArray().length;
        }

}