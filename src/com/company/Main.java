package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Assuming we had a car brand, called Bardy.
        //Create an object of this class, and make it extend another class called Car
        //class Car feature: noOfTires, color
        // create another class called Person.
        //features: name, age, likebardy(boolelan), hasBardy, bardiesOwned(ArrayList)

        //In the main method create a list that will contain a number of people
        // and if a person likes bardy and does not have bardy then give them a Bardy.

        Scanner sc = new Scanner(System.in);
        List<Person> bardiesOwned = new ArrayList<>();

        System.out.println("Enter how many peoples you want to enter: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter persons name: ");
            String name = sc.next();
            System.out.println("Enter persons age: ");
            int age = sc.nextInt();
            System.out.println("Enter 'true' if person likes a bardy and 'false' if doesn't: ");
            boolean like = sc.nextBoolean();
            System.out.println("Enter 'true' if person has a bardy and 'false' if hasn't:");
            boolean has = sc.nextBoolean();

            bardiesOwned.add(new Person(name, age, like, has));
        }
        Person haveBardies = hasBardies(bardiesOwned);
        System.out.println("Owners that has bardies now is: " + haveBardies.getName());
    }

        public  static Person hasBardies(List<Person> bardiesOwned) {
            //Define a max variable to hold the maximum value
            //assign the first element of the list to the max variable
            //in order to compare it with subsequent values and ensure that the max
            //value from the object in question(array, list, etc) is actually obtained.
            Person haveBardy = bardiesOwned.get(0); //This is the first student in the list
            for (Person owners : bardiesOwned){
                if(haveBardy.hasBardy() {
                    haveBardy = owners;
            }
            return haveBardy;
        }

}
