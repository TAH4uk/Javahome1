
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        long sumN = 0;
                
        for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
        }
        
    System.out.println("Сумма первых n натуральных чисел: " + sumN);
    System.out.println("Факториал n: " + getFactorial(n));           
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
           result = result * i;
        }
        return result;
        
    }

}