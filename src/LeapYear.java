import java.util.Scanner;

public class LeapYear {
    private static int year;

    public static void main(String[] args) {
        year = new Scanner(System.in).nextInt();
        if(year % 4 == 0){
            System.out.println(year + " - leap year");
        }
        else if(year % 400 == 0){
            System.out.println(year + " - leap year");
        }
        else{
            System.out.println(year + " - not a leap year");
        }
    }
}

