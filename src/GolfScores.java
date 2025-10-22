import java.util.Scanner;

public class GolfScores {

    public String golfScore(int strokes, int par) {
        return ""; //FIX THIS WHEN READY!
    }
   
   static void main(String[] args) {
      GolfScores score = new GolfScores();
      Scanner scnr = new Scanner(System.in);
      int par;
      int strokes;
      String name;
      
      par = scnr.nextInt();
      strokes = scnr.nextInt();
      
      name = score.golfScore(par, strokes);
      
      System.out.println(name);
   }
}
