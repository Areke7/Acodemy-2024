package lekcija3;

public class Cikli {
    public static void main(String[]args) {

        int i = 0;

        while(i < 5){
            System.out.println("Print i: " + i);
            printNameSurname();
            i = i+ 1;
            // var rakstit arī i++

            //while(i < 5)
            System.out.println("Print text...");
            //vajag nelielu izteiksmi, lai liktu mainīties, citādi būs mūžīgais print text
        }

        int a = 0;
        while(a<10){
            System.out.println ("A vertiba ir = " + a);
            a++;
        }
        for (int j = 0; j <= 10; j++) {
            System.out.println ("Cikls izpildas " + j + " reizi");

        }
    }

    static void printNameSurname(){
        System.out.print ("##############");
        System.out.print ("Alisa");
        System.out.print ("Reke");
        System.out.print ("##############");

    }
}
