package Lekcija5;

import com.github.javafaker.Faker;

public class RandomDate {
    public static void main(String[] args){

        Faker randomdatiGenirators = new Faker();
        System.out.println(randomdatiGenirators.address().fullAddress());
        System.out.println(randomdatiGenirators.friends().quote());


    }
}
