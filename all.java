import java.util.Vector;
public class Euler {

    public void one() {
        //sum of all multiples of 3 and 5 below 1000
        int sum = 0;
        for (int x = 1; x < 1000; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                sum += x;
            }
        }
        System.out.print(sum);
    }

    public void two() {
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

    /**<p>@class Three contains @method isPrime</p>
     */
    class Three {
        public void three() {
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
        public static boolean isPrime(long num) {
            if (num == 2L) return true;
            double sqrt = Math.sqrt(num);
            for (long x = 2L; x <= sqrt; x++)
                if (num % x == 0L) return false;
            return num > 1L;
        }
    }

    public void four() {
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

    public void five() {
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

    public void six() {
        int sum = 0; int square_sum = 0;
        for (int x = 1; x < 101; x++) {
            sum += x;
            square_sum += x * x;
        }
        sum *= sum;
        System.out.print(sum - square_sum);
    }

    public void seven() {
        int stored = 0; int count = 0; int num = 2;
        while (count < 10_001) {
            if (Three.isPrime(num)) {
                stored = num;
                count++;
            }
            num++;
        }
        System.out.println(stored);
    }

    public void eight() {

        class Tok {
            private int index;
            private char content;
            private String type = "m";
            public Tok(char content, int index) {
                this.content = content;
                this.index = index;

                // if tile is on the top
                if (this.index < 50) {
                    if (this.index == 0) this.type = "tl";
                    else if (this.index == 49) this.type = "tr";
                    else this.type = "t";
                }
                // if tile is on the left
                else if (this.index % 50 == 0) {
                    if (this.index == 950) this.type = "bl";
                    else this.type = "l";
                }
                // if the tile is on the right
                else if ((this.index + 1) % 50 == 0) {
                    if (this.index == 999) this.type = "br";
                    else this.type = "r";
                }
                // if the tile is on the bottom
                else if ((this.index > 950) && (this.index < 1000)) {
                    this.type = "b";
                }
            }
            public int asInt() {
                int ret; String temp = Character.toString(this.content);
                ret = Integer.parseInt(temp);
                return ret;
            }
            public int getSide(String side, Vector<Tok> Vec) {
                int width = 50;
                switch (side) {
                    case "t" -> {
                        //checks the tile above the current tile
                        Vec.get(this.index - width).appendType("#");
                    }
                    case "tr" -> {
                        //checks the tile above right of the current tile
                    }
                    case "r" -> {
                        //checks the tile to the right of the current tile
                    }
                    case "br" -> {
                        //checks the tile below right of the current tile
                    }
                    case "b" -> {
                        //checks the tile below the current tile
                    }
                    case "bl" -> {
                        //checks the tile below left of the current tile
                    }
                    case "l" -> {
                        //checks the tile to the left of the current tile
                    }
                    case "tl" -> {
                        //checks the tile above left of the current tile
                    }
                }
                return 5;
            }

            public int getIndex() {return this.index;}

            public String toString() {return this.type;}

            public String getType() {return this.type;}

            public void appendType(String change) {this.type = change;}
        }

        class Tokenizer {
            private Vector<Tok> Vec = new Vector<>();
            public Tokenizer(String grid) {
                for (int x = 0; x < grid.length(); x++) {
                    Tok token = new Tok(grid.charAt(x), x);
                    this.Vec.add(token);
                }
            }
            public Vector<Tok> returnVec() {
                return this.Vec;
            }
        }

        //number width: 50; height: 20
        String number = "73167176531330624919225119674426574742355349194934" +
                        "96983520312774506326239578318016984801869478851843" +
                        "85861560789112949495459501737958331952853208805511" +
                        "12540698747158523863050715693290963295227443043557" +
                        "66896648950445244523161731856403098711121722383113" +
                        "62229893423380308135336276614282806444486645238749" +
                        "30358907296290491560440772390713810515859307960866" +
                        "70172427121883998797908792274921901699720888093776" +
                        "65727333001053367881220235421809751254540594752243" +
                        "52584907711670556013604839586446706324415722155397" +
                        "53697817977846174064955149290862569321978468622482" +
                        "83972241375657056057490261407972968652414535100474" +
                        "82166370484403199890008895243450658541227588666881" +
                        "16427171479924442928230863465674813919123162824586" +
                        "17866458359124566529476545682848912883142607690042" +
                        "24219022671055626321111109370544217506941658960408" +
                        "07198403850962455444362981230987879927244284909188" +
                        "84580156166097919133875499200524063689912560717606" +
                        "05886116467109405077541002256983155200055935729725" +
                        "71636269561882670428252483600823257530420752963450";

        Tokenizer tokenizer = new Tokenizer(number);
        Vector<Tok> GRID = tokenizer.returnVec();

        for (int x = 0; x < 1000; x++) {
            if (x % 50 == 0) System.out.println(GRID.get(x + 1).getType());
            else System.out.print(GRID.get(x + 1).getType() + " ");
        }

        Tok current = GRID.get(56);
        current.getSide("t", GRID);

        for (int x = 0; x < 1000; x++) {
            if (x % 50 == 0) System.out.println(GRID.get(x + 1).getType());
            else System.out.print(GRID.get(x + 1).getType() + " ");
        }

        // loops through every item in Vec
        int start = 0; Vector<Tok> STACK = new Vector<>(); String ttype = GRID.get(0).type;
        while (true) {

            switch (ttype) {
                case "tl" -> {
                    // top left
                    //checks r, br, b
                }
                case "tr" -> {
                    // top right
                    //checks b, bl, l
                }
                case "t" -> {
                    // top
                    //checks r, br, b, bl, l
                }
                case "l" -> {
                    // left
                    //checks t, b, bl, l, tl
                }
                case "r" -> {
                    // right
                    //checks t, tr, r, br, b
                }
                case "br" -> {
                    // bottom right
                    //checks t, l, tl
                }
                case "bl" -> {
                    // bottom left
                    //checks t, tr, r
                }
                case "b" -> {
                    // bottom
                    //checks t, tr, r, l, tl
                }
                default -> {
                    // middle
                    //checks t, lr, r, br, b, bl, l, tl
                }
            }
            break;
        }
    }

    public void nine() {
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

    public void ten() {
        long sum = 0;
        for (int x = 0; x < 2_000_000; x++) {
            if (Three.isPrime(x)) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
