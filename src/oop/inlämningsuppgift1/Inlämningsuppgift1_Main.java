package oop.inlämningsuppgift1;

import java.util.Scanner;

/**
 * Inlamningsuppgift_1 <br>
 * baliharko <br>
 * 2020-09-29 <br>
 * 10:36
 */

public class Inlämningsuppgift1_Main {
    public static void main(String[] args) {

//        AnimalHotel.showPetInfo("dogge");
//        AnimalHotel.showPetInfo("hypno");
//        AnimalHotel.showPetInfo("venus");

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Ange djurets namn: ");
            String input = scanner.nextLine().toLowerCase();
            String s = AnimalHotel.showPetInfo(input);
            if (s == null)
                System.out.println("Inget djur med detta namn registrerat.");
            else
                System.out.println(s);

            System.out.println("\nVill du kolla upp en annan gäst? j/n");
            String prompt = scanner.nextLine().toLowerCase();

            if (prompt.equals("n"))
                break;
        }
    }
}
