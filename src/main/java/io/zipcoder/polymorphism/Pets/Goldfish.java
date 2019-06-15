package io.zipcoder.polymorphism.Pets;

public class Goldfish extends Pet {

    public Goldfish() {
        this.name = "";
        this.animal =  "Goldfish";
    }

    public Goldfish(String name, String animal) {
        super(name, animal);

    }

    @Override
    public String speak() {
        return "blub blub.";
    }


}
