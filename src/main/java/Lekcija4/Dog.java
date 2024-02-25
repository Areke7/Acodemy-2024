package Lekcija4;

public class Dog {
        String name;
        int age;
        double weight;
        String breed;



        Dog(String name, int age, double weight, String breed){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.breed = breed;
        }

        public void makeSound(){
            System.out.println("VAU VAU");
        }

        public void printDog(){
            System.out.println("Suna vards ir: " + name);
            System.out.println("Suna vecums ir: " + age);
            System.out.println("Suna svars ir " + weight);
            System.out.println("Suna skirne ir " + breed);
        }

}
