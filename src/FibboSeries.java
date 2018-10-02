public class FibboSeries {

    static int a = 0;
    static int b = 1;
    static int c = 0;

    public static void main(String[] args) {
        division(49, 0);

    }

    /**
     * Division using recursive subtraction
     * @param dividend
     * @param quotient
     */

    public static void division(int dividend, int quotient) {
        int divisor= 7;

        dividend -= divisor;
        if (dividend == 0) {
            ++quotient;
            System.out.println(quotient);
        } else {

            division(dividend, quotient + 1);

        }
    }
}
