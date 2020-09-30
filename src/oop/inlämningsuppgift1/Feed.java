package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 11:19
 */

// Enum för de olika sortens djurmat och typ
public enum Feed {
    KATTFODER("Katt"), HUNDFODER("Hund"), ORMPELLETS("Orm");

    public final String type; // Tillhörande vid utskrift

    Feed(String type) {
        this.type = type;
    }
}
