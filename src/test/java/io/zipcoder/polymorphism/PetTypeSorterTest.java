package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.*;
import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Collections;

public class PetTypeSorterTest {

    @Test
    public void compareToTest() {
        PetTypeSorter pts = new PetTypeSorter();
        ArrayList<Pet> petList = new ArrayList<>();
        Pet dog = new Dog("zeta", "dog");
        Pet cat = new Cat("bravo", "cat");
        Pet fish = new Goldfish("mike", "goldfish");
        Pet cat2 = new Cat("alpha", "cat");

        petList.add(dog);
        petList.add(cat);
        petList.add(fish);
        petList.add(cat2);

        Collections.sort(petList, pts);

        ArrayList actual = petList;
        ArrayList expected = new ArrayList();
        expected.add(cat2);
        expected.add(cat);
        expected.add(dog);
        expected.add(fish);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void compareToTest2() {
        PetTypeSorter pts = new PetTypeSorter();
        ArrayList<Pet> petList = new ArrayList<>();
        Pet dog = new Dog("able", "dog");
        Pet cat = new Cat("able", "cat");
        Pet fish = new Goldfish("tina", "goldfish");
        Pet cat2 = new Cat("charlie", "cat");

        petList.add(dog);
        petList.add(cat);
        petList.add(fish);
        petList.add(cat2);

        Collections.sort(petList, pts);

        ArrayList actual = petList;
        ArrayList expected = new ArrayList();
        expected.add(cat);
        expected.add(cat2);
        expected.add(dog);
        expected.add(fish);

        Assert.assertEquals(actual, expected);
    }


}
