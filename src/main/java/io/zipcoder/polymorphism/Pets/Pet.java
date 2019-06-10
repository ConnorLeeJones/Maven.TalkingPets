package io.zipcoder.polymorphism.Pets;
import java.util.Comparator;

public abstract class Pet implements Comparable<Pet> {
    String name;
    String animal;


    public Pet() {
        this.name = "";
        this.animal = "";
    }

    public Pet(String name, String animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String speak() {
        return "I am pet :)";
    }


    public class nameCompare implements Comparator<Pet>{

        @Override
        public int compare(Pet o1, Pet o2) {
            int nameCompare = o2.name.compareTo(o1.name);
            int typeCompare = o2.animal.compareTo(o1.animal);

            if (nameCompare == 0) {
                return typeCompare;
            } else {
                return nameCompare;
            }
        }
    }

    public class typeCompare implements Comparator<Pet>{

        @Override
        public int compare(Pet o1, Pet o2) {
            int nameCompare = o2.name.compareTo(o1.name);
            int typeCompare = o2.animal.compareTo(o1.animal);

            if (typeCompare == 0) {
                return nameCompare;
            } else {
                return typeCompare;
            }
        }
    }
}



/*
Comparator.comparing(Pet::getType).thenComparing(Pet::getName)

 */