import java.util.Scanner;

public class Factorial {
    static long factorial(long number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number need caculator :");
        long number = sc.nextLong();
        long factori = factorial(number);
        System.out.println(String.format("The factorial is :" + factori));
    }
}
