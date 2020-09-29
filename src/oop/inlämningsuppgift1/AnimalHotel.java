package oop.inlämningsuppgift1;

import java.util.ArrayList;
import java.util.List;

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

    public static String showPetInfo(String name) {
        if (name == null)
            return null;
        for (IPetGuest pet : allAnimals) {
            if (name.equals(pet.getName().toLowerCase())) {
                return pet.getName() + " " + Math.round(pet.getPortionGrams()) + "g " + pet.getFeed();
            }
        }
        return null;
    }
}
