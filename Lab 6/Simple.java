public class Simple {
    int si(int p, int r, int t) {
        return (p * r * t) / 100;

    }

    public static void main(String[] args) {
        double b;
        Simple obj = new Simple();
        b = obj.si(10, 1, 2);
        System.out.print(b);

    }
}
