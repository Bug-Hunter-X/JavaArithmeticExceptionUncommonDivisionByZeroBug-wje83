public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = x / y; // This line will cause an ArithmeticException
        System.out.println(z);
    }
}