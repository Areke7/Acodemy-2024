package lekcija2;

import java.util.Scanner;

public class velesanasPiemers {
    public static void main(String[] args) {
        System.out.println("Sakums");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu vecumu...");
        int vecums = scanner.nextInt();

        if (vecums >= 18) {
            System.out.println("Drikst balsot");
            if (vecums > 20)
                System.out.println("Jāveic veselības pārbaude");
        }

        System.out.println("Beigas");
    }
}
