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
    private Feed feed;

    public Animal() {}

    public Animal(String name, double weight, Feed feed) {
        this.name = name;
        this.weight = weight;
        this.feed = feed;
    }

    public double getWeight() {
        return this.weight;
    }

    public Feed getFeed() {
        return this.feed;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format("Namn: %-12sVikt: %-10.0fFoder: %s", this.name, this.weight, this.feed.toString().toLowerCase());
    }
}
