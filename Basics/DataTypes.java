public class DataTypes {
    public static void main(String[] args) {

        // Numeric data types - byte, short, int, long, float, double
        byte num1 = 127;

        System.out.println(num1); // 1 byte
        short num2 = 32767;
        System.out.println(num2); // 2 bytes

        //floating-point data types - float, double
        float num3 = 3.14f;
        System.out.println(num3); // 4 bytes
        double num4 = 3.14159;
        System.out.println(num4); // 8 bytes

        //other data types - char, boolean
        char letter = 'A';  
        System.out.println(letter); // 2 bytes  
        boolean isJavaFun = true;
        System.out.println(isJavaFun);
        boolean isPythonFun = false;
        System.out.println(isPythonFun); // 1 byte
        //explicit type casting
        long value1 = 123456789;
        int value2 = (int) value1; // Explicitly cast long to int
        System.out.println(value2);

        //long value3 = 123456789999999;
        //int value4 = (int) value3; // Explicitly cast long to int, may cause data loss
        //System.out.println(value4); 
        // Using 'L' to indicate a long literal
    }
}