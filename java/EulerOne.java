public class EulerOne {
    public static void main(String[] args) {
        //sum of all multiples of 3 and 5 below 1000
        int sum = 0;
        for (int x = 1; x < 1000; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
        }
        System.out.print(sum);
    }
}