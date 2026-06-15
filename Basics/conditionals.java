import java.util.Scanner;2

public class conditionals {
    public static void main(String[] args) {
        int age = 10;

        if (age < 18) {
            System.out.println("You are under age");
        } else{
            System.out.println("You are an adult");
        }


        //if-else if ladder
        int marks = 85;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        //nested if - else
        int number = 15;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("The number is positive and even");
            } else {
                System.out.println("The number is positive and odd");
            }
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        //ternary operator
        int a = 5;
        String values = (a%2 == 0)? "Even" : "Odd";
        System.out.println(values);

        int weight =10;

       int ans = (weight>18) ? 22 : 18;
        System.out.println(ans);


        //switch case
        System.out.println("Enter a number between 1 and 7 to get the corresponding day of the week: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}