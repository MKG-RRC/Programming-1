public class AverageInteger {
    public static void main(String[] args) {

        /*
         * Ensure that if the values of the items being used to calculate the average
         * can be modified with minimal
         * changes to your program code.
         * The values being averaged must be declared as integers.
         */

        // List of numbers //
        int firstNumber = 1;
        int secondNumber = 7;
        int thirdNumber = 9;
        int fourthNumber = 34;

        // Counter for the integer values, I used double instead of int so the decimal
        // of the calculated value is shown //
        double counter = 4.0;

        // Formula = Get the sum of all listed values and then Divide it on how many
        // values are there //

        int integerTotalSumOfValues = firstNumber + secondNumber + thirdNumber + fourthNumber;

        double calculatedValues = integerTotalSumOfValues / counter;

        // Print //

        System.out.println("The average of the values " + firstNumber + ", " + secondNumber + ", " + thirdNumber
                + " and " + fourthNumber + " is " + calculatedValues + ".");

        // expectd output : The average of the values 1, 7, 9 and 34 is 12.75.

    }
}
