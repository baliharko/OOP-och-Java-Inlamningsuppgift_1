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

    private static String showPetInfo(String name) {
        if (name == null)
            return null;
        for (IPetGuest pet : allAnimals) {
            if (name.equals(pet.getName().toLowerCase())) {
                return pet.getFeed().type + "en " +
                        pet.getName() + " ska få " +
                        Math.round(pet.getPortionGrams()) + "g " +
                        pet.getFeed().toString().toLowerCase() + ".";
            }
        }
        return null;
    }

    public static String getGuest(String name) {
        String s = AnimalHotel.showPetInfo(name);
        s = s == null ? "" : s;

        if (s.isBlank())
            System.out.print("Inget djur med detta namn registrerat.");

        return s;
    }
}
