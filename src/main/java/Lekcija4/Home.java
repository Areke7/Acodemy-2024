package Lekcija4;

import java.util.ArrayList;

public class Home {
    Double platiba;
    int stavi;
    int loguskaits;
    String ielasNosaukums;
    int majasNumurs;
    int tirgusVertiba;
    int istabuSkaits;
    ArrayList<String> apdaresMateriali;

    public void printAdress(){
        System.out.println(ielasNosaukums + " " + majasNumurs);
    }

}
