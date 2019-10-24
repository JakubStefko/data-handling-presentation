import java.util.Date;

public class Main {


    private static int TEST_NUMBER = 100;
    private static int TEST_CASE = 10000;

    public static void main(String[] args) {

        measureTimeDuration('i');
        measureTimeDuration('r');
    }

    static int factorialRecursive(int number) {
        if (number == 1) { return 1; }
        else { return number * factorialRecursive(number - 1); }
    }

    static int factorialIterative(int number) {
        int i, result = 1;
        for (i = 2; i < number; i++) {
            result *= i;
        }
        return result;
    }

    static void measureTimeDuration(char algorithm) {

        Date start, stop;
        int i;

        if (algorithm == 'i') {
            start = new Date();
            for (i = 0; i < TEST_NUMBER; i++) { factorialIterative(TEST_CASE); }
            stop = new Date();
            System.out.println("Iterative time duration: " + Math.abs(stop.getTime() - start.getTime()) + "ms");

        } else if (algorithm == 'r') {
            start = new Date();
            for (i = 0; i < TEST_NUMBER; i++) { factorialRecursive(TEST_CASE); }
            stop = new Date();
            System.out.println("Recursive time duration: " + Math.abs(stop.getTime() - start.getTime()) + "ms");

        } else {
            System.out.println("Error");
        }
    }



}