interface test {
    int square();
}

class aritmetic implements test {
    int b;

    aritmetic(int x) {
        b = x;
    }

    public int square() {
        return (b * b);
    }

}

class ToTestInt {
    public int return_ans(int x) {
        aritmetic a = new aritmetic(x);
        return a.square();
    }
}

class main_class {
    public static void main(String[] args) {
        ToTestInt x = new ToTestInt();
        System.out.println("\nThe square of 64 is " + x.return_ans(64));
    }
}