package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pets.Cat;
import io.zipcoder.polymorphism.Pets.Dog;
import io.zipcoder.polymorphism.Pets.Goldfish;
import io.zipcoder.polymorphism.Pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {
    private Cat cat;
    private Dog dog;
    private Goldfish goldfish;

    @Before
    public void SetUp() {
        cat = new Cat("spot", "cat");
        dog = new Dog("fido", "dog");
        goldfish = new Goldfish("steven", "goldfish");
        ArrayList<Pet> userPetList = new ArrayList<>();
        PetOwner user = new PetOwner("henry", userPetList);
    }

    @Test
    public void testCatName() {
        String expected = "spot";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatName2(){
        Cat cat2 = new Cat("lumpy", "cat");
        String expected = "lumpy";
        String actual = cat2.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatName3(){
        Cat cat3 = new Cat("MJ", "cat");
        String expected = "MJ";
        String actual = cat3.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogName() {
        String expected = "fido";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogName2(){
        Dog dog2 = new Dog("god", "dog");
        String expected = "god";
        String actual = dog2.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDogName3(){
        Dog dog3 = new Dog("spock", "dog");
        String expected = "spock";
        String actual = dog3.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGoldfishName(){
        Goldfish goldfish = new Goldfish("steven", "goldfish");
        String expected = "steven";
        String actual = goldfish.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGoldFishName2(){
        Goldfish goldFish2 = new Goldfish("shithead", "goldfish");
        String expected = "shithead";
        String actual = goldFish2.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGoldFishName3(){
        Goldfish goldfish3 = new Goldfish("dumbfish", "goldfish");
        String expected = "dumbfish";
        String actual = goldfish3.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAnimalTest(){
        cat.setAnimal("Cat");
        String expected = "Cat";
        String actual = cat.getAnimal();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAnimalTest2(){
        dog.setAnimal("Dog");
        String expected = "Dog";
        String actual = dog.getAnimal();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setAnimalTest3(){
        goldfish.setAnimal("Goldfish");
        String expected = "Goldfish";
        String actual = goldfish.getAnimal();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAnimalTest(){
        String expected = "cat";
        String actual = cat.getAnimal();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAnimalTest2(){
        String expected = "dog";
        String actual = dog.getAnimal();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAnimalTest3(){
        String expected = "goldfish";
        String actual = goldfish.getAnimal();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        cat.setName("that darn cat");
        String expected = "that darn cat";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest2(){
        dog.setName("S.O.B.");
        String expected = "S.O.B.";
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest3(){
        goldfish.setName("moby dick");
        String expected = "moby dick";
        String actual = goldfish.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String expected = "arf! arf!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest2(){
        String expected = "meeeooooww...";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest3(){
        String expected = "blub blub.";
        String actual = goldfish.speak();

        Assert.assertEquals(expected, actual);
    }
}
