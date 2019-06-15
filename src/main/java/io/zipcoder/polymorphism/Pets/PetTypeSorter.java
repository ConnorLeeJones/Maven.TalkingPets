package io.zipcoder.polymorphism.Pets;

import java.util.Comparator;

public class PetTypeSorter implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        int typeCompare = o1.getAnimal().compareTo(o2.getAnimal());
        if (typeCompare != 0){
            return typeCompare;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
