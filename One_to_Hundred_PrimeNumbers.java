public class One_to_Hundred_PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int numbers = 2; numbers <= 100; numbers++) {
            if (isPrime(number)) {
                System.out.print(numbers + " ");
            }
        }
    }

    // Simplified method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
