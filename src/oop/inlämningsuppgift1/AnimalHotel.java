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
    private static List<IPetGuest> allAnimals = new ArrayList<>();

    public static void addToHotel(IPetGuest newGuest) {
        allAnimals.add(newGuest);
    }
}
