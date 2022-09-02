public class Main {
    public static void main(String[] args) {
        System.out.println(makeNegative(10));
    }
    public static int makeNegative(final int x) {
        return x <= 0 ? x : x * (-1);
    }
}
