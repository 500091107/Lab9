interface Abc {
    public void sum(int x, int y);
}

class Class_1 {
    private int s = 10;
    protected int a = 300;
    public int b = 444;
    int c = 50;
}

public class Class_2 extends Class_1 implements Abc {
    public void sum(int x, int y) {
        System.out.println("The sum of numbers is :" + (a + b));
    }

    public static void main(String[] args) {
        Class_2 c2 = new Class_2();
        System.out.println("This is my protected variable :" + c2.a);
        System.out.println("This is my public  variable :" + c2.b);
        System.out.println("This is my Default  variable :" + c2.c);
        c2.sum(c2.a, c2.b);
    }
}
