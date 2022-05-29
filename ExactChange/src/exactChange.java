import java.util.Scanner;

public class exactChange {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int TCIP;
        int numPennies;
        int numNickels;
        int numDimes;
        int numQuarters;
        int numDollars;
        int pennyVal = 1;
        int nickelVal = 5;
        int dimeVal = 10;
        int quarterVal = 25;
        int dollarVal = 100;
        int remainder;

        TCIP = scnr.nextInt();
        if(TCIP == 0){
            System.out.println("No change");
        }
        else{
            if(TCIP >= dollarVal) {
                numDollars = TCIP / dollarVal;
                if (numDollars == 1) {
                    System.out.println(numDollars + " Dollar");
                } else {
                    System.out.println(numDollars + " Dollars");
                }
            }
            remainder = TCIP % dollarVal;
            if(remainder >= quarterVal) {
                // calculate number of Quarters
                numQuarters = remainder / quarterVal;
                if (numQuarters == 1) {
                    System.out.println(numQuarters + " Quarter");
                } else {
                    System.out.println(numQuarters + " Quarters");
                }
            }
            remainder %= quarterVal;
            // calculate number of Dimes
            if(remainder >= dimeVal){
                numDimes = remainder / dimeVal;
                if(numDimes == 1){
                    System.out.println(numDimes + " Dime");
                }
                else{
                    System.out.println(numDimes + " Dimes");
                }
            }
            remainder %= dimeVal;
            // calculate number of Nickles
            if(remainder >= nickelVal){
                numNickels = remainder / nickelVal;
                System.out.println(numNickels + " Nickel");
            }
            remainder %= nickelVal;
            // calculate number of Pennies
            if(remainder >= pennyVal){
                numPennies = remainder / pennyVal;
                if(numPennies == 1){
                    System.out.println(numPennies + " Penny");
                }
                else{
                    System.out.println(numPennies + " Pennies");
                }
            }
        }
    }
}
