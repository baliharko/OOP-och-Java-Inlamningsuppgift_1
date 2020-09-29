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
            System.out.println("Vilket djur ska få mat?");
            String input = scanner.nextLine().toLowerCase();

            if (input.isBlank()) {
                System.out.println("Vill du avsluta? [j/n]");
                if (scanner.nextLine().toLowerCase().equals("j"))
                    break;
                else
                    continue;
            }

            String guest = AnimalHotel.getGuest(input);
            System.out.println(guest);

            System.out.println("\nVill du kolla upp en annan gäst? [j/n]");
            String prompt = scanner.nextLine().toLowerCase();

            if (prompt.equals("n"))
                break;
        }
    }
}
