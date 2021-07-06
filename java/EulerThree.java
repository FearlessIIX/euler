public class EulerThree {

    public static boolean isPrime(long num) {
        if (num == 2L) return true;
        double sqrt = Math.sqrt(num);
        for (long x = 2L; x <= sqrt; x++)
            if (num % x == 0L) return false;
        return num > 1L;
    }

    public static void main(String[] args) {
        //cycles through all numbers from 3 to the square root of target
        long target = 600851475143L;
        long factor = 0;
        for (long y = 2L; y <= Math.sqrt(target); y++) {
            if (isPrime(y)) {
                if (target % y == 0) {
                    factor = y;
                }
            }
        }
        System.out.println(factor);
    }
}