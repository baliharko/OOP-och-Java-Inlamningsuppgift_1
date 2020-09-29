package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:29
 */

public class Snake extends Animal {

    private Feed feed;

    public Snake(String name, double weight) {
        super(name, weight);
        this.feed = Feed.ORMPELLETS;
    }

    public Feed getFeed() {
        return this.feed;
    }
}
