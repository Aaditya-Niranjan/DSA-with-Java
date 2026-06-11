public class Variables {
    public static void main(String[] args) {
        int age = 21;
        System.out.println(age);

        //Case Sensitive
        int Age = 22;
        int AGE = 23;
        System.out.println("Age:" + Age);
        System.out.println("AGE:" + AGE);
        //not use reserved keywords as variable names
        //int class = 10; // This will cause a compile-time error because "class
        int MAIN = 100;
        System.out.println("MAIN:" + MAIN);
        //variables not start with numbers
        //int 1number = 10; // This will cause a compile-time error because 
        //variables not contain spaces
        //no length limit for variable names, but it's good practice to keep them concise and meaningful
         //convention for variable names: camelCase
        int myVariable = 10;
        System.out.println("myVariable:" + myVariable);
    }
    
}
