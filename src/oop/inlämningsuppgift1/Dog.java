package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:29
 */

public class Dog extends Animal {

    public Dog(String name, double weight) {
        super(name, weight, Feed.HUNDFODER);
    }

    @Override
    public double getPortionGrams() {
        return this.getWeight() * 1000 / 100;
    }
}
