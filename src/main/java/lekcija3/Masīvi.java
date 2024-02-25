package lekcija3;

public class Masīvi {
    public static void main(String[] args) {
        String pietura = "Centrāla stacija";
        String pietura1 = "Marija iela";
        String pietura2 = "Lāčplēša iela";

        // var ielikt visu sarakstu vienā masīvā

        String[] pieturas = {"Centrāla stacija","Marijas iela", "Lāčplēsa iela"};
        System.out.println(pieturas[2]);

        for (int i = 0; i <= pieturas.length; i++) {
            System.out.println(pieturas[i]);
        for (String x : pieturas) {
            System.out.println("pietura " + x);
        }

        }
// for (i = 0; i< pieturas.lenght; i++)
// for each // for (String s : pieturas) // sistema pati saprot kur's 'string
        int[] majuNumuri = {1,3,5,7,9};

    }
}
