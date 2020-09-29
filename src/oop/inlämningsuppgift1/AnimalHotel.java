package oop.inlämningsuppgift1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:58
 */

public class AnimalHotel {
    private static List<IPetGuest> allAnimals = fillPetGuestlist();

    private static List<IPetGuest> fillPetGuestlist() {
        List<IPetGuest> addAnimals = new ArrayList<>();

        addAnimals.add(new Dog("Sixten", 5));
        addAnimals.add(new Dog("Dogge", 10));
        addAnimals.add(new Cat("Venus", 5));
        addAnimals.add(new Cat("Ove", 3));
        addAnimals.add(new Snake("Hypno", 1));

        return addAnimals;
    }

    public static void printGuests() {
        allAnimals.forEach(System.out::println);
    }

    public static void showPetInfo(String name) {
        if (name == null)
            return;
        for (IPetGuest pet : allAnimals) {
            if (name.equals(pet.getName().toLowerCase())) {
                System.out.println(pet.getName() + " " + Math.round(pet.getPortionGrams()) + "g " + pet.getFeed());
            }
        }
    }
}
