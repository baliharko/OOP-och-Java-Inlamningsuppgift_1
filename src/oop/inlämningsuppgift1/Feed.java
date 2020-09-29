package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 11:19
 */

// Enum av de olika sortens djurmat
public enum Feed {
    KATTFODER("Katt"), HUNDFODER("Hund"), ORMPELLETS("Orm");

    public final String type;

    Feed(String type) {
        this.type = type;
    }
}
