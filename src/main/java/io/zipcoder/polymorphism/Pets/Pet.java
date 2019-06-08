package io.zipcoder.polymorphism.Pets;

public abstract class Pet {
    String name;
    String animal;


    public Pet(){
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

    public String speak(){
        return "I am pet :)";
    }
}



/*
Comparator.comparing(Pet::getType).thenComparing(Pet::getName)

 */