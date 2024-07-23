import java.util.Scanner;
public class AverageMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter three numbers to get the average: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double avg = average(a, b, c);
        System.out.println("The average of "+a+", "+b+", "+c+" is: " + avg);
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static double average(int num1, int num2, int num3) {
        int totalSum = sum(num1, num2, num3);
        return totalSum / 3.0;
    }
}