/**
 *****************************************************************************************************
 * By writing your name in the space provided below, you are honouring the CIS academic honesty pledge
 * “I have neither given nor received unauthorized aid on this piece of work.”
 * NAME: Helen D.
 *****************************************************************************************************
 */

public class Main {

    public static void main(String[] args) {
        int sumTwo = add(3, 8);
        System.out.println(sumTwo);

        int sumFour = add(3, 8, 4, 9);
        System.out.println(sumFour); // Expected output: 24

        String morningGreet = morningGreeting("Toby Fox");
        System.out.println(morningGreet); // Expected output: 早上好, Toby Fox!

        String afternoonGreet = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreet); // Expected output: 下午好, Mac Miller!

        String tripled = triple("oohbaby");
        System.out.println(tripled);

        double halfValue1 = half(8);
        System.out.println(halfValue1);
        double halfValue2 = half(17);
        System.out.println(halfValue2);

        int roundedPositive1 = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPositive1);
        int roundedPositive2 = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundedPositive2);

        int roundedNegative1 = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegative1);
        int roundedNegative2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundedNegative2);
    }

    // 1. add
    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // 2. add
    public static int add(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return add(firstNumber, secondNumber) + add(thirdNumber, fourthNumber);
    }

    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    //5. triple
    public static String triple(String value) {
        return value + value + value;
    }

    //6. half
    public static double half(int value) {
        return value / 2.0;
    }

    //7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) Math.round(value);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double value) {
        if(value%1>-0.5){
            return (int) Math.ceil(value);
        }
        else{
            return (int) Math.floor(value);
        }
        //return (int) -Math.round(-value);
    }
}
