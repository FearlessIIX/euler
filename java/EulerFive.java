public class EulerFive {
    public static void main(String[] args) {
        int x = 1; boolean flag = false;
        while (true) {
            for (int div = 1; div < 21; div++) {
                if (!(x % div == 0)) flag = true;
            }
            if (flag) flag = false;
            else break;
            x++;
        }
        System.out.println(x);
    }
}