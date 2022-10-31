import java.util.*;

class Largest {
    void large(int n1, int n2, int n3) {
        if (n1 >= n2 && n1 >= n3)
            System.out.println("n1 is the largest " + n1);

        else if (n2 >= n3 && n2 >= n1)
            System.out.println("n2 is the laargest " + n2);

        else
            System.out.println("n3 is the largest " + n3);
    }
}

class De_class {
    public static void main(String args[]) {
        Largest obj = new Largest();
        obj.large(456, 234, 88);
    }
}
