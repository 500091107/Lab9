import java.util.Scanner;

interface hero {
    void function(int x, int y);

}

class value {
    int x, y;
    Scanner sc = new Scanner(System.in);

    void numbers() {
        System.out.println("enter 1st didit");
        int A = sc.nextInt();
        this.x = A;
        System.out.println("enter 2nd digit");
        int B = sc.nextInt();
        this.y = B;
    }
}