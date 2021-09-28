import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("which program do you want to run");
        String choice = sc.nextLine();
        if (choice == "1") {
            System.out.println("input the number you want to check");
            int guess = sc.nextInt();
            if ((guess % 2) == 0) {
                System.out.println("your number is even");
            } else {
                System.out.println("your number is odd");
            }
        } else {
            System.out.println("enter your two numbers");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            System.out.println("your first number divided by your second number is " + (number1 / number2));
            System.out.println("the remainder from the division is " + (number1 % number2));
        }
    }
}

