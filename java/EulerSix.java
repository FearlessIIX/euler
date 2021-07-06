public class EulerSix {
    public static void main(String[] args) {
        int sum = 0; int square_sum = 0;
        for (int x = 1; x < 101; x++) {
            sum += x;
            square_sum += x * x;
        }
        sum *= sum;
        System.out.print(sum - square_sum);
    }
}