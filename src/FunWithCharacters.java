public class FunWithCharacters {

   static void main(String[] args) {

      FunWithCharacters labObject = new FunWithCharacters();
      String word = "happy birthday"; // Set string
      int index = 2; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));

      index = 5; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));

      word = "happy birthday 2 you";
      index = 15; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));

      word = "happy birthday!";
      index = 14; // Set specified index to 2
      System.out.println(labObject.checkCharacter(word, index));
   }
   
   public String checkCharacter(String word, int index) {
      // Get the actual character at the requested index.
      char c = word.charAt(index);

      // Use methods from the Character class to discover which type of character it is.
      if (Character.isLetter(c)) {
         return "Character '" + c + "' is a letter";
      } else if (Character.isWhitespace(c)) {
         return "Character '" + c + "' is a white space";
      } else if (Character.isDigit(c)) {
         return "Character '" + c + "' is a digit";
      } else {
         return "Character '" + c + "' is unknown";
      }
   }
}
