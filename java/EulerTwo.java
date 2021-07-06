public class EulerTwo {
    public static void main(String[] args) {
        //sum of even fibonacci numbers below 4 million
        int first = 1; int second = 1; int third = 0; int sum = 0;

        while (third < 4000000) {
            third = first + second;
            first = second; second = third;
            if (third % 2 == 0) {
                sum += third;
            }
        }
        System.out.print(sum);
    }
}