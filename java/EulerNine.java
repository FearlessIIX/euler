public class EulerNine {
    public static void main(String[] args) {
        //loops for three numbers 1-999
        //first checks if they fit the pythagorean number theorem
        //then checks if those three numbers add to 1000
        outer:
        for (int one = 1; one < 1000; one++) {
            for (int two = 1; two < 1000; two++) {
                for (int three = 1; three < 1000; three++) {
                    if (one < two && two < three)  {
                        if ((one * one) + (two * two) == (three * three)) {
                            if (one + two + three == 1000) {
                                System.out.print(one * two * three);
                                break outer;
                            }
                        }
                    }
                }
            }
        }
    }
}