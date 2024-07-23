import java.util.Scanner;
public class DivideMethod {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println ("Enter the second number: ");
        int num2 = sc.nextInt();

        divide (num1, num2);
    }
    public static void divide (int a, int b) {
        if (b != 0) {
            double result = (double) a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}
