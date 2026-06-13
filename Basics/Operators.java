public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));

        // Assignment Operators
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("c after += 5: " + c);

        float d = 10.5f;
        float e = 2.5f;
        System.out.println(d+e);

        //short hand operators
        int f = 15;     
        f -= 3; // f = f - 3
        System.out.println("f after -= 3: " + f);
        int g = 4;
        g *= 2; // g = g * 2    
        System.out.println("g after *= 2: " + g);
        int h = 20;
        h /= 4; // h = h / 4
        System.out.println("h after /= 4: " + h);

        //Unary Operators
        int activeuser = 5;

        int prefix = ++activeuser; // Increment before use, pehele increment hoga fir use hoga
        System.out.println("Prefix: " + prefix); // Output: 6
        int postfix = activeuser++; // Use before increment, pehele use hoga fir increment hoga
        System.out.println("Postfix: " + postfix); // Output: 6
        System.out.println("Active User after postfix: " + activeuser); // Output: 7

    }
}
