package io.zipcoder.polymorphism.Pets;

public class Pet implements Comparable<Pet> {
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

    @Override
    public int compareTo(Pet o) {
        int nameCompare = (this.getName()).compareTo(o.getName());
        if (nameCompare != 0){
            return nameCompare;
        }
        return (this.getAnimal()).compareTo(o.getAnimal());
    }

}


