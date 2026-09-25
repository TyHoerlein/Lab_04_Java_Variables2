//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int intOperandA = 1;
    int intOperandB = 5;
    int intSum;
    int intProduct;
    int intDifference;
    int intQuotient;
    int intModulo;

            double doubleOprandA = 3.50;
    double doubleOprandB = 2.50;
    double doubleSum = 5.50;
            double doubleProduct = 6.55;
            double doubleDifference = 7.33;
            double doubleQuotient = 8.50;
            double doubleModulo = 10.20;

            intSum = intOperandA + intOperandB;
            System.out.println ("The sum using ints of "  + intOperandA + "+"  + intOperandB + "is" + intSum );
            intProduct = intSum - intOperandA;
            System.out.println ("The difference using ints of " + intSum + "-" + intOperandA + "is" + intProduct );
            intDifference = intOperandA * intOperandB;
            System.out.println ( "the product using ints of " + intOperandA + "*" + intOperandB + "is" + intDifference );
            intQuotient = intSum / intOperandA;
            System.out.println ( "the quotient using ints of " +  intSum + "/" + intOperandA + "is" + intQuotient );
            intModulo = intSum % intOperandA;
            System.out.println ( "the modulo using ints of " + intSum + "%" +intOperandA + "is" + intModulo );

            doubleSum = doubleOprandA + doubleOprandB;
            System.out.println ("the sum using doubles of " + doubleOprandA + "is" + doubleOprandB + "is" + doubleSum );
            doubleQuotient = doubleSum / doubleOprandA;
            System.out.println (" the quotient using doubles of " + doubleSum + "/" + doubleOprandA + "is" + doubleQuotient );
            doubleProduct = doubleOprandA * doubleOprandB;
            System.out.println (" the product using doubles of " + doubleOprandA + "*" + doubleOprandB + "is" + doubleProduct );
            doubleDifference = doubleOprandA - doubleOprandB;
            System.out.println (" the difference using doubles of " + doubleOprandA + "-" + doubleOprandB + "is" + doubleDifference );
            doubleModulo = doubleOprandA % doubleOprandB;
            System.out.println (" the modulo using doubles of " + doubleOprandA + "%" + doubleOprandB + "is" + doubleModulo );

            double myLunchCost = 12.50;
            System.out.println ( "The cost of myLunch is " + myLunchCost );
            int numberOfKids = 0;
            System.out.println ( "The number of kids is " + numberOfKids );
            boolean isRaining = true;
            System.out.println ( "The raining is " + isRaining );
            double gasPrice = 3.25;
            System.out.println ( "The gas price is " + gasPrice );
            int favoriteNumber = 5;
            System.out.println ( "The favorite number is " + favoriteNumber );
            double shoeSize = 10.5;
            System.out.println ( "The shoe size is " + shoeSize );
            int birthMonth = 8;
            System.out.println ( "The birth month is " + birthMonth );
            String fullName = "Ty Hoerlein";
            System.out.println ( "The full name is " + fullName );

}
