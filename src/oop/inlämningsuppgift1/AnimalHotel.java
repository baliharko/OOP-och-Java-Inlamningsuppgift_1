package oop.inlämningsuppgift1;

import java.util.LinkedList;
import java.util.List;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:58
 */

public class AnimalHotel {
    private static List<IPetGuest> allAnimals = new LinkedList<>();

    private static void fillPetGuestlist() {
        allAnimals.add(new Dog("Sixten", 5));
        allAnimals.add(new Dog("Dogge", 10));
        allAnimals.add(new Cat("Venus", 5));
        allAnimals.add(new Cat("Ove", 3));
        allAnimals.add(new Snake("Hypno", 1));
    }

    public AnimalHotel() {
        fillPetGuestlist();
    }

    public static void printGuests() {
        allAnimals.forEach(System.out::println);
    }
}
