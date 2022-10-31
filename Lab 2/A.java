class A {
    public A(int x) {
        System.out.println("A's constructor called");
        System.out.println("x = " + x);
    }

    int a = 30;
}

class Object {
    public static void main(String[] args) {
        A obj = new A(95);
        System.out.println("obj.a = " + obj.a);
    }
}