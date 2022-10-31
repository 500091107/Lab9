interface area {
    static final float pi = 3.142f;

    float compute(float x, float y);
}

class rectangle implements area {
    public float compute(float x, float y) {
        return (x * y);
    }
}

class circle implements area {
    public float compute(float x, float y) {
        return (pi * x * x);
    }
}

class Inter_class {
    public static void main(String args[]) {
        S_main s = new S_main();
        s.name("Arun");
        s.division(5);
        s.modules(15);
        s.disp();
        rectangle rect = new rectangle();
        circle cr = new circle();
        System.out.println("Area of the rectangle= " + rect.compute(140, 31));
        System.out.println("Area of the circle= " + cr.compute(15, 17));
    }
}
