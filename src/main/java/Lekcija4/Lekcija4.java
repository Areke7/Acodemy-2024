package Lekcija4;

import java.lang.module.FindException;
import java.util.ArrayList;

public class Lekcija4 {
    public static void main(String[] args) {
      String[] cars = {"BMW","AUDI","VW"}  ;
      for (String car : cars){
          System.out.println(car);
      }

        ArrayList<String> cars2 = new ArrayList<>();

      cars2.add("Mercedes");
      System.out.println(cars2.get(0));

      System.out.println("Vai saraksts satur Mercedesu? " + cars2.contains("Mercedes"));
    //System.out.println(cars2.get(0));


    }
}
