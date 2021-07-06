public class EulerFour {

    public static void main(String[] args) {
        int largest = 0;
        for (int s = 1; s < 1000; s++) {
            String forwards;  int product;
            for (int f = 1; f < 1000; f++) {
                String backwards = "";
                product = s * f;
                forwards = Integer.toString(product);
                for (int x = forwards.length() - 1; x >= 0; x--) {
                    backwards += forwards.charAt(x);
                }
                if (forwards.equals(backwards)) {
                    if (product > largest) {
                        largest = product;
                    }
                }
            }
        }
        System.out.println(largest);
    }
}