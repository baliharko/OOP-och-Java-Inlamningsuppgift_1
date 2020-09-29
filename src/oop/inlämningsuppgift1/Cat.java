package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:29
 */

public class Cat extends Animal implements IFurAnimal {

    public Cat(String name, double weight) {
        super(name, weight);
    }

    @Override
    public double calculatePortion() {
        return this.getWeight() * 1000 / 150;
    }
}
