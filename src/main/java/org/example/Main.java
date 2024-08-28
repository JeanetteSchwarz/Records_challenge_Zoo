package org.example;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        Owner jeanette = new Owner("Jeanette", 40, "Wallaby Way, Sydney");
        Owner linus = new Owner("Linus", 3, "Stockholm, Sweden");

        Species tiger = new Species("Tiger", 5);
        Species seeloewe = new Species("Seelöwe", 3);
        Species strauss = new Species("Strauß", 2);
        Species orangutan = new Species("Ornag-Utan", 2);

        Animal otto = new Animal(1, "Otto", tiger, 3, jeanette );
       Animal robert = new Animal(2, "Robert", seeloewe, 4, linus);
       Animal brigitte = new Animal(3, "Brigitte", strauss, 4, jeanette);
       Animal gabi = new Animal(4, "Gabi", orangutan, 7, linus);
        Animal anton = new Animal(5, "Anton", orangutan, 8, linus);
        Animal sabine = new Animal(6, "Sabine", strauss, 5, jeanette);

        /*List<Animal> zoo = new ArrayList<>();

        zoo.add(otto);
        zoo.add(robert);
        zoo.add(brigitte);
        zoo.add(gabi);
        zoo.add(anton);
        zoo.add(sabine); */

        //System.out.println(zoo);

        //Test toString
        System.out.println("Print Otto: ");
        System.out.println(otto);
        System.out.println("Print Gabi: ");
        System.out.println(gabi);

        //create new Zoo with all animals
        Zoo zoo = new Zoo(new ArrayList<>(List.of(otto, robert, brigitte, gabi, anton, sabine)));

        //print whole zoo
        System.out.println("All animals in our zoo: ");
        System.out.println(zoo.animals());

        //calculate food for zoo
        System.out.println("We need " + zoo.calculateTotalFood() + " kilograms of food per day.");
    }
}