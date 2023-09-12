import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = ageScanner.nextInt();
        int dateableAge = age / 2 + 7;
        System.out.println(age + "-year olds should date somebody who is at least " + dateableAge + " years old");
        System.out.println("Thanks to Jim Cohoon at The University of Virginia");

    }
}
