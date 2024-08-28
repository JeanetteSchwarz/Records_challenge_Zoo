package org.example;

import java.util.ArrayList;

public record Zoo(ArrayList<Animal> animals) {

    public long calculateTotalFood(){
        //helper variable to hold sum
        long totalFood = 0;

        //iterates through all animals and adds each animal's food need to helper
        for(Animal a: animals()){
            totalFood += a.species().foodRequirementPerDay();
        }
        return totalFood;
    }

}
