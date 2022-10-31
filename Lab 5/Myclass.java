interface A {
    void meth1();

    void meth2();
}

class MyClass implements A {
    public void meth1() {
        System.out.println("Implement meth1()");
    }

    public void meth2() {
        System.out.println("Implement meth2()");
    }
}

class F_class {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
    }
}