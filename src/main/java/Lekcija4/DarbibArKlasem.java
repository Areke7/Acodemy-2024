package Lekcija4;

import java.util.ArrayList;

public class DarbibArKlasem {
    public static void main(String[] args) {
        //Dog mansSuns = new Dog();

        //mansSuns.name = "Reksis";
        //mansSuns.age = 7;
        //mansSuns.weight = 10.5;
        //mansSuns.breed = "Buldogs";

        //mansSuns.makeSound();
        //mansSuns.printDog();

        Home manaMaja = new Home();
        manaMaja.majasNumurs = 1;
        manaMaja.ielasNosaukums = "Gravisu iela";
        manaMaja.printAdress();

        ArrayList<String> materiali = new ArrayList<>();
        materiali.add("Parkets");

        Automasina manaAutomasina = new Automasina();
        manaAutomasina.gads = 2022;
        manaAutomasina.marka = "Mercedes";
        manaAutomasina.krasa = "balta";

        Circle rinkis1 = new Circle();
        rinkis1.R = 5;
        System.out.println("Rinka laukums ir " + rinkis1.calculateArea());




    }
}
