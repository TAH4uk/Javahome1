// Вывести все простые числа от 1 до 1000

public class task2 {
    public static void main(String[] args) {
        int i;
        int n = 1000;
        boolean isPrime = true;
 
        String primeNumbersFound = "";
 
        for (i = 1; i <= n; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Простые числа от 1 до " + n + ":");
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
}
}