import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeNegative(10));
        System.out.println(makeNegative(9));
    }
    public static int makeNegative(final int x) {
        return x <= 0 ? x : x * (-1);
    }

    public static int makeNegative2(final int x) {
        return -abs(x);
    }
}
