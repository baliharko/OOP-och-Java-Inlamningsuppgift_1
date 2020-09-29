package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 11:07
 */

// Interface för alla djuren
public interface IPetGuest {

    default double getPortionGrams() {
        return 20;
    }

    Feed getFeed();

    String getName();
}
