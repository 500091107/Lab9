public class sumOfIntegers {
    int Sum() {
        int sum = 0;
        for (int i = 45; i < 250; i = i + 5) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        sumOfIntegers s = new sumOfIntegers();
        int result = s.Sum();
        System.out.println("The sum of integers between 40 to 250 that divisibleby 5 is :" + result);
    }

}
