/** <p>REQUIRES import of @method isPrime</p>
 *
 * <p>@method isPrime located in EulerThree.java</p>
 */

public class EulerSeven {
    public static void main(String[] args) {
        //starting at zero, finds the 10,001st prime number
        int stored = 0; int count = 0; int num = 2;
        while (count < 10_001) {
            if (Euler.Three.isPrime(num)) {
                stored = num;
                count++;
            }
            num++;
        }
        System.out.println(stored);
    }
}