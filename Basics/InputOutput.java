import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int firstnum = sc.nextInt();

        System.out.println("Enter second number: ");
        int secondnum = sc.nextInt();

        int sum = firstnum + secondnum;

        System.out.println("The sum of " + firstnum + " and " + secondnum + " is: " + sum);

        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter the value of flag (true/false): ");
        boolean flag = sc.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Flag: " + flag);

        sc.close(); // Close scanner
    }
}