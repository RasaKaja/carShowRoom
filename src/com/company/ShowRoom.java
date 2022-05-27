package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowRoom {
    // Array List: Alternative to arrays, makes it easier to work with arrays.
    private ArrayList<Car> cars = new ArrayList<Car>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    // add cars to the showroom
    // view all cars in the showroom;
    // view a single car in the showroom
    // remove car

    // adding a car to the showroom
    public void addCar() {

        // declare and initialize a new car
        Car car = new Car();

        // set the properties of the car
        System.out.println("Please input the car name: ");
        car.name = scanner.nextLine();

        System.out.println("Please input the car manufacturer: ");
        car.manufacturer = scanner.nextLine();

        System.out.println("Please input the car type: ");
        car.type = scanner.nextLine();

        System.out.println("Please input the car ID: ");
        car.setId(scanner.nextInt());

        // ArrayList.add is used to add Item to the ArrayList
        this.cars.add(car);
        System.out.println(car.name + " added successfully");
    }

    void viewAllCars(){
        System.out.println("All available cars: \n");
        for (Car car : cars){
            System.out.println("name: " + car.name + ", type: " + car.type);
        }
    }

    void viewCar(){
        //ArrayList: used to get the Item by the Index
        // try catch: helps handle exception[errors] in code
        try {
            System.out.println("Please input the index of the car you want to see:");
            int carIndex = intScanner.nextInt();

            Car car = this.cars.get(carIndex);
            System.out.println("Name: " + car.name + " Type: " + car.type);
        } catch (Exception ex) {
            System.out.println("Unable to find this car. Please try again.");
        }

    }

    void removeCar(){
        try {
            System.out.println("Please input index of the car you want to remove");
            int carIndex = intScanner.nextInt();
            cars.remove(carIndex);

            System.out.println("Removed successfully");
        } catch (Exception ex){
            System.out.println("Unable to remove specified car");
        }
    }

}
