package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Goldfish;
import io.zipcoder.polymorphism.Pets.Pet;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class PetTest {

    @Test
    public void compareTest() {

        ArrayList<Pet> petList = new ArrayList<>();
        Pet dog = new Dog("zeta", "dog");
        Pet cat = new Cat("able", "cat");
        Pet fish = new Goldfish("mike", "goldfish");
        Pet cat2 = new Cat("bravo", "cat");

        petList.add(dog);
        petList.add(cat);
        petList.add(fish);
        petList.add(cat2);

        Collections.sort(petList);

        ArrayList actual = petList;
        ArrayList expected = new ArrayList();
        expected.add(cat);
        expected.add(cat2);
        expected.add(fish);
        expected.add(dog);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void compareTest2() {

        ArrayList<Pet> petList = new ArrayList<>();
        Pet dog = new Dog("able", "dog");
        Pet cat = new Cat("able", "cat");
        Pet fish = new Goldfish("tina", "goldfish");
        Pet cat2 = new Cat("charlie", "cat");

        petList.add(dog);
        petList.add(cat);
        petList.add(fish);
        petList.add(cat2);

        Collections.sort(petList);

        ArrayList actual = petList;
        ArrayList expected = new ArrayList();
        expected.add(cat);
        expected.add(dog);
        expected.add(cat2);
        expected.add(fish);

        Assert.assertEquals(actual, expected);
    }
}
