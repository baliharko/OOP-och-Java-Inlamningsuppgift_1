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
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Ange djurets namn:");
            String input = scanner.nextLine().toLowerCase();

            String s = AnimalHotel.showPetInfo(input);
            s = s == null ? "Inget djur med detta namn registrerat." : s;
            System.out.println(s);

            System.out.println("\nVill du kolla upp en annan gäst? j/n");
            String prompt = scanner.nextLine().toLowerCase();

<<<<<<< HEAD
        AnimalHotel.printGuests();
        
=======
            if (prompt.equals("n"))
                break;
        }
>>>>>>> 654d999d940d1e0cf4dd0851a243ef1450b2e8e4
    }
}
