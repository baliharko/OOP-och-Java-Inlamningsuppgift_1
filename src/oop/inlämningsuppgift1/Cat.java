package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:29
 */

public class Cat extends Animal {

    public Cat(String name, double weight) {
        super(name, weight, Feed.KATTFODER);
    }

    @Override
    public double getPortionGrams() {
        return this.getWeight() * 1000 / 150;
    }
}
