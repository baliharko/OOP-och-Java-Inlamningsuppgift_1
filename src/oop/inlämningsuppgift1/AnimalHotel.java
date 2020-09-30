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

    private static List<IPetGuest> allAnimals = fillPetGuestlist(); // Alla djur

    private static List<IPetGuest> fillPetGuestlist() {
        List<IPetGuest> addAnimals = new ArrayList<>();

        addAnimals.add(new Dog("Sixten", 5));
        addAnimals.add(new Dog("Dogge", 10));
        addAnimals.add(new Cat("Venus", 5));
        addAnimals.add(new Cat("Ove", 3));
        addAnimals.add(new Snake("Hypno", 1));

        return addAnimals;
    }

    // Söker igenom allAnimals, används i getGuest().
    private static String getPetFromList(String name) {
        if (name == null)
            return null;
        for (IPetGuest pet : allAnimals) {
            if (name.equals(pet.getName().toLowerCase())) {
                return pet.getFeed().type + "en " +
                        pet.getName() + " ska få " +
                        Math.round(pet.getPortionGrams()) + "g " + // Polymorfism - getPortionGrams()
                        pet.getFeed().toString().toLowerCase() + ".";
            }
        }
        return null;
    }

    // Anropas från main, anropar getPetFromList()
    // String om man skulle vilja skriva ut någon annanstans eller behandla informationen på något sätt i framtiden
    public static String getGuest(String name) {
        String s = AnimalHotel.getPetFromList(name.toLowerCase());
        s = s == null ? "" : s; // returnerar tom sträng om null, så det blir lite tjusigt istället för null-utskrift

        if (s.isBlank())
            System.out.print("Inget djur med detta namn finns registrerat.");

        return s;
    }
}
