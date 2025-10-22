import java.util.Scanner;

public class LongestString {

   static void main(String[] args) {
      LongestString mainObject = new LongestString();
       Scanner scanner = new Scanner(System.in);

      String str1;
      String str2;
      String longest;

       str1 = scanner.next();
       str2 = scanner.next();

      longest = mainObject.findLongest(str1, str2);

      System.out.println(longest);
   }

   public String findLongest(String str1, String str2) {
       return (str1.length() > str2.length()) ? str1 : str2;
   }
}
