import java.util.Scanner;

public class SquareOfNumber {
    Scanner sc = new Scanner(System.in);

    int[] input_array() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the " + (i + 1) + " Number");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        SquareOfNumber s = new SquareOfNumber();
        int sum = 0;
        int[] array = s.input_array();
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i] * array[i];
        }
        System.out.println("Sum of all number " + sum);
    }
}