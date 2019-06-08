package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Goldfish;
import io.zipcoder.polymorphism.Pets.Pet;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    public static void main(String[] args) {

        ArrayList<Pet> petList = new ArrayList<>();
        Integer numberOfPets = null;

        while (numberOfPets == null) {
            System.out.println("How many pets do you have?");
            Scanner scanner = new Scanner(System.in);

            try {
                numberOfPets = scanner.nextInt();
                if (numberOfPets <= 0) {
                    System.out.println("...you don't have any pets?? Just pretend that you do and try again.\n");
                    numberOfPets = null;
                } else if (numberOfPets >= 50) {
                    System.out.println(numberOfPets + "?! That's an ungodly number of pets! Now contacting animal control...\n");
                    numberOfPets = null;
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not a valid number! Let's try this again...\n");
                continue;
            }
        }

        String petName;
        String petType;

        for (int i = 1; i <= numberOfPets; i++) {
            System.out.println("What is pet #" + i + "'s name?");
            Scanner scanner = new Scanner(System.in);
            petName = scanner.nextLine();

            System.out.println("What kind of animal is pet number " + i + "?");
            scanner = new Scanner(System.in);
            petType = scanner.nextLine();

            switch (petType.toLowerCase()) {
                case "dog":
                    Dog dog = new Dog(petName, petType);
                    petList.add(dog);
                    break;
                case "cat":
                    Cat cat = new Cat(petName, petType);
                    petList.add(cat);
                    break;
                case "goldfish":
                    Goldfish goldfish = new Goldfish(petName, petType);
                    petList.add(goldfish);
                    break;
                default:
                    System.out.println("Hmmm... I'm not familiar with that animal... Try again, please!\n");
                    i--;
                    break;
            }
        }

        Integer i = 1;
        for (Pet pet : petList) {
            System.out.println("Pet #" + i + ":");
            System.out.println("\tSpecies:   " + pet.getAnimal());
            System.out.println("\tName:      " + pet.getName());
            System.out.println("\t" + pet.getName() + " says, '" + pet.speak() + "'");
            i++;
        }
    }
}
