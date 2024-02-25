package lekcija3;

public class Metodes {
    public static void main(String[] args) {
        printInfoAboutDog();
        aprekinatTaisnsturaLaukumu(3,5);

        int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(6,7);
        System.out.println("laukumns ir: " + aprekinataisLaukums);

        //printInfoAboutDogDivi();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ievadi malu a: ");
//        int vienaMala = scanner.nextInt();
//        System.out.println("Ievadi malu b: ");
//        int otraMala = scanner.nextInt();
//
        //int aprekinataisLaukums = aprekinatTaisnsturaLaukumu(vienaMala, otraMala);
        System.out.println("laukumns ir: " + aprekinataisLaukums);
    }
    static int aprekinatTaisnsturaLaukumu(int a, int b){
        int laukums = a*b;
        return laukums;
    }
    static void printInfoAboutDog(){
        String vards = "Reksis";
        int vecums = 7;
        double svars = 10.5;
        System.out.println("My dogs name is : " + vards);
        System.out.println("My dog is: " + vecums + " years old.");
        System.out.println("My dogs weight is: " + svars);
        //System.out.println ()'s'k'ersv'itra un n ir tuksa rinda
    }

    static void printInfoAboutDogDivi(String name, int age, double weight ){
        System.out.println("Mans suna vards ir: " + name);
        System.out.println("Mans suna vecums ir: " + age);
        System.out.println("Mans suna svars ir: " + weight);
        System.out.println("\n");

    }

    static double aprekinatRinkaLaukumu(int radiuss) {
        return 3.14 * (radiuss * radiuss);
    }
}
