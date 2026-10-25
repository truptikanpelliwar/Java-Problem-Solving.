public class Precedence {
    public static void main(String[] args) {
        int a =  2 * 4 + 6 / 7; // 8 + 0 = 8
        int b = 10 + 6 / 3 * 2; // 10 + 2 * 2 = 10 + 4 = 14
        int c = 20 - 4 * 3 % 5; // 20 - 12 % 5 = 20 - 2 = 18
        int d = 100 / 10 / 5; // 10 / 5 = 2
        int e = 7 + 3 * 2 - 8 / 4; // 7 + 6 - 2 = 13 - 2 = 11
        int f = 15 % 4 * 2 + 1; // 3 * 2 + 1 = 6 + 1 = 7
        int g = (10 + 2) * 3 / 4; // 12 * 3 / 4 = 36 / 4 = 9

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}
