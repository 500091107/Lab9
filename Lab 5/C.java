interface C {
    void division(int a);

    void modules(int b);
}

class S implements C {
    String name;
    int div, mod;

    public void division(int a) {
        div = a;
    }

    public void modules(int b) {
        mod = b;
    }

    void name(String n) {
        name = n;
    }

    void disp() {
        System.out.println("Name :" + name);
        System.out.println("Division :" + div);
        System.out.println("Modules :" + mod);
    }

public class Main {
    public static void main(String args[]) {
        S s = new S();
        s.name("Arun");
        s.division(5);
        s.modules(15);
        s.disp();
    }
}