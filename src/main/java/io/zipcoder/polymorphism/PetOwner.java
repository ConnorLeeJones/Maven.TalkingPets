package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Pet;

import java.util.ArrayList;

public class PetOwner {
    private String name;
    private ArrayList<Pet> petList;


    public PetOwner(String name, ArrayList<Pet> petList) {
        this.name = name;
        this.petList = petList;
    }

    public ArrayList<Pet> getPetList() {
        return petList;
    }

    public void setPetList(ArrayList<Pet> petList) {
        this.petList = petList;
    }

    public void addPet(Pet pet){
        petList.add(pet);
    }


    public void printPetList() {
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
