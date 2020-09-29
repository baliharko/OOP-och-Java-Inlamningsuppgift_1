package oop.inlämningsuppgift1;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:36
 */

public class Inlämningsuppgift1_Main {
    public static void main(String[] args) {

        IPetGuest p = new Dog("feedy", 8);
        IPetGuest q = new Cat("caaty", 2);
        IPetGuest r = new Snake("snaakey", 4);
        AnimalHotel.addToHotel(new Dog("Sixten", 5));
        AnimalHotel.addToHotel(p);
        AnimalHotel.addToHotel(q);

        System.out.println(p.getFeed() + " " + Math.round(p.getPortionGrams()));
        System.out.println(q.getFeed() + " " + Math.round(q.getPortionGrams()));
        System.out.println(r.getFeed() + " " + Math.round(r.getPortionGrams()));
    }
}
