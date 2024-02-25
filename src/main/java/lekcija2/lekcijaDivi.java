package lekcija2;

import java.util.Scanner;

public class lekcijaDivi {
    public static void main(String[] args){
//        System.out.println("Lekcija Nr.2");
//        System.out.println("Ievadi savu vārdu:  ");
//        //lietotajs ievades apstrade
//        Scanner skeneris = new Scanner(System.in);
//        String name = skeneris.nextLine();
//        System.out.println("Labdien, " + name + "!");
//        Scanner mansSkeneris = new Scanner(System.in);
//
//        System.out.println("Ievadi skaitli x...");
//        int x = mansSkeneris.nextInt();
//        System.out.println ("Skaitlis x veiksmigi saglabats. Tas ir: " + x);
//
//        System.out.println("Ievadi skaitli y...");
//        int y = mansSkeneris.nextInt();
//        System.out.println ("Skaitlis y veiksmigi saglabats. Tas ir: " + y);
//
//        System.out.println("x+y summa ir " + (x+y));

        int x = 5;
        int y = 3;
        int z = 3;

        System.out.println("X ir lielāks par Y " + (x>y));
        System.out.println("X ir lielāks par Y " + (x<y));
        System.out.println("Y ir vienads ar Z " + (y==z));
        System.out.println("Y ir vienads ar Z " + (y!=z));

        System.out.println("Y ir lielāks, vienads ar Z " + (y>=z));

        String name = "Alisa";
        String nameDivi = "Zane";
        System.out.println (name.equals("Alisa"));
        System.out.println (name.equals(nameDivi));
        System.out.println (!name.equals(nameDivi));

        int x1 = 5;
        System.out.println ((x1>=5) && (x1<7));
        // 'sir bus true tikai kad abas puses bus patiesas
        // izmantojot 'vai' - || , tad bus true






    }
}
