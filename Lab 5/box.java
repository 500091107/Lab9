class box {

    private int l, b;

    box(int x, int y) {

        l = x;

        b = y;

    }

    int area() {

        return (l * b);

    }

}

class metal_box extends box {

    int h;

    metal_box(int x, int y, int z) {

        super(x, y);

        h = z;

    }

    int volume1() {

        return (area() * h);

    }

}

class card_box extends box {

    int heig;

    card_box(int x, int y, int p) {

        super(x, y);

        heig = p;

    }

    int volume2() {

        return (area() * heig);

    }

}

class Demo {

    public static void main(String args[]) {

        S_main s = new S_main();
        s.name("Arun");
        s.division(5);
        s.modules(15);
        s.disp();
    }

}