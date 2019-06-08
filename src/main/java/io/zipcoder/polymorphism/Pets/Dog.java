package io.zipcoder.polymorphism.Pets;

public class Dog extends Pet {

    public Dog() {
        this.name = "";
        this.animal =  "Dog";
    }

    public Dog(String name, String animal) {
        super(name, animal);
    }

    @Override
    public String speak() {
        return "arf! arf!";
    }
}
