/** <p>REQUIRES import of @method isPrime</p>
 *
 * <p>@method isPrime located in EulerThree.java</p>
 */

public class EulerTen {
    public static void main(String[] args) {
        //finds sum of all prime numbers below 2,000,000
        long sum = 0L;
        for (int x = 0; x < 2_000_000; x++) {
            if (Euler.Three.isPrime(x)) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}