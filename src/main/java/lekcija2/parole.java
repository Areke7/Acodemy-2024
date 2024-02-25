package lekcija2;

import java.util.Scanner;

public class parole {
    public static void main(String[] args){
        String istaParole = "parole123";
        System.out.println("Enter your password...");
        Scanner scanner = new Scanner(System.in);
        String ievadiParole = scanner.nextLine();

        if (ievadiParole.equals(istaParole)){
            //te izpildas, ja ir pareiza
            System.out.println("Password accepted");
        } else{
            System.out.println("Password wrong!");
        }
    }

}
