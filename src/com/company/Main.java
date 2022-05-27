package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the car showroom");
        ShowRoom showRoom = new ShowRoom();
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        do {
            System.out.println("Please choose an activity: ");
            System.out.println("""
                    1. Add car
                    2. View All Cars
                    3. View Single car
                    4. Remove Car
                    """);

            userInput = scanner.nextLine();

            switch (userInput) {
                case "quit" :
                    System.out.println("Exiting Application.");
                    break;
                case "1" :
                    showRoom.addCar();
                    break;
                case "2" :
                    showRoom.viewAllCars();
                    break;
                case "3" :
                    showRoom.viewCar();
                    break;
                case "4" :
                    showRoom.removeCar();
                    break;
            }
        } while (!userInput.equalsIgnoreCase("quit"));

        Audi audi = new Audi();
        audi.getName();

        System.out.println(audi);
    }
}
