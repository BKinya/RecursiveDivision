public class RecursiveDivision {

    static int a = 0;
    static int b = 1;
    static int c = 0;
    static int  quotient = 0;

    public static void main(String[] args) {

        System.out.println(division(49, 7));

    }

    /**
     * Division using recursive subtraction
     * @param dividend
     * @param divisor
     */

    public static int division(int dividend, int divisor) {


        dividend -= divisor;

        if (dividend == 0) {
            ++quotient; //quotient is one if result after subtracting is 0
            return quotient;
        } else {
            division(dividend, divisor);
            quotient = quotient + 1;

        }

        return  quotient;
    }
}
