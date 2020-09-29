package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-28 <br>
 * 20:54
 */

public abstract class Animal implements IPetGuest{

    private String name;
    private double weight;

    public Animal() {}

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

}
