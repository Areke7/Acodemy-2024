package lekcija2;

public class Switch {
    public static void main(String[] args) {
        int day = 3;
        switch (day){
            case 1:
                System.out.println("Pirmdiena");
                break;
            case 2:
                System.out.println("Otrdiena");
                break;
            case 3:
                System.out.println("Trešdiena");
                break;
            case 4:
                System.out.println("Cetutdiena");
                break;
            case 5:
                System.out.println("piektdiena");
                break;
            case 6:
                System.out.println("Brīvdiena");
                break;
            default:
                System.out.println("Neeksistē");
        }

    }
}
