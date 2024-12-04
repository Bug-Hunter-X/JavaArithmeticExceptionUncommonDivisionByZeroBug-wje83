public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0;
        if (y != 0) {
            z = x / y; 
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        System.out.println(z);
    }
}