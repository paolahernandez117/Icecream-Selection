import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the flavor of icecream you would like: ");
        System.out.println("\n\tMenu ");
        System.out.println("\n1) Vanilla ");
        System.out.println("\n2) Strawberry ");
        System.out.println("\n3) Chocolate ");
        System.out.println("\n4) Mint ");
        System.out.println("\n5) Coffee ");
        System.out.println("\n6) Caramel ");
        System.out.println("\n7) Oreo ");
        System.out.println("\n8) Birthday Cake");
        System.out.println("\n9) Pistachio ");
        System.out.println("\n10) Pineapple Mango ");
        System.out.println("\n----------------------");
        System.out.println();
        int numberOfFlavors = keyboard.nextInt();

        switch(numberOfFlavors) {
            case 1:
                System.out.println("Nice Selection. Vanilla coming right up!");
                break;
            case 2:
                System.out.println("What a yummy selection, Strawberry coming right up!");
                break;
            case 3:
                System.out.println("Mhmm good choice, Chocolate coming right up!");
                break;
            case 4:
                System.out.println("Alright! Mint coming right up!");
                break;
            case 5:
                System.out.println("Delicious, Coffee coming right up!");
                break;
            case 6:
                System.out.println("What a delicious choice, Caramel coming right up!");
                break;
            case 7:
                System.out.println("Mhmm good choice, Oreo coming right up!");
                break;
            case 8:
                System.out.println("Alright!, Birthday Cake coming right up!");
                break;
            case 9:
                System.out.println("What a yummy selection, Pistachio coming right up!");
                break;
            case 10:
                System.out.println("Mhmm good choice, Pineapple Mango coming right up!");
                break;
            default:
            System.out.println("That's not one of the options");
            break;
        }
    }
}

