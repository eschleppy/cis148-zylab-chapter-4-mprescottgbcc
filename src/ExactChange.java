import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPennies = input.nextInt();

        int numDollars = numPennies / 100;
        numPennies %= 100;
        int numQuarters =  numPennies / 25;
        numPennies %= 25;
        int numDimes =  numPennies / 10;
        numPennies %= 10;
        int numNickels =  numPennies / 5;
        numPennies %= 5;

        if(numDollars == 1){
            System.out.println("1 Dollar");
        }
        else if (numDollars != 0){
            System.out.println(numDollars + " Dollars");
        }
        if(numQuarters == 1){
            System.out.println("1 Quarter");
        }
        else if (numQuarters != 0){
            System.out.println(numQuarters + " Quarters");
        }
        if(numDimes == 1){
            System.out.println("1 Dime");
        }
        else if (numDimes != 0){
            System.out.println(numDimes + " Dimes");
        }
        if(numNickels == 1){
            System.out.println("1 Nickel");
        }
        else if (numNickels != 0){
            System.out.println(numNickels + " Nickels");
        }
        if(numPennies == 0){
            System.out.println("No change");
        }
        else if (numPennies == 1){
            System.out.println(numPennies + " Penny");
        }
        else{
            System.out.println(numPennies + " Pennies");
        }
    }
}

