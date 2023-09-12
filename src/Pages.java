import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {
        Scanner ageScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = ageScanner.nextInt();
        int shouldRead = 100 - age;
        System.out.println(age + "-year olds should read at least " + shouldRead + " pages before giving up on a book");
        System.out.println("Thanks to Jim Cohoon at The University of Virginia");

    }
}
