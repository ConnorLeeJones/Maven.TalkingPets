package io.zipcoder.polymorphism.Pets;

public class Cat extends Pet {

    public Cat() {
        this.name = "";
        this.animal =  "Cat";
    }

    public Cat(String name, String animal) {
        super(name, animal);
    }

    @Override
    public String speak() {
        return "meeeooooww...";
    }
}
