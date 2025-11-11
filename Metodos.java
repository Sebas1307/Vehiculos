public class Metodos {
   
   public boolean isDigit(String numbers) {
      for (char number : numbers.toCharArray()) {
         boolean isDigit = Character.isDigit(number);
         if (!isDigit) {
            // System.out.println("Hubo un error. Asegurate de solo digitar numeros.");
            return false;
         }
      }
      return true;
   }

   public boolean isLetter(String letters) {
      for (char letter : letters.toCharArray()) {
         boolean isLetter = Character.isLetter(letter);
         if (!isLetter) {
            // System.out.println("Hubo un error. Asegurate de solo digitar letras.");
            return false;
         }
      }
      return true;
   }

   private int VALID_PHONE_LENGTH = 10;
   
   public boolean isPhoneNumber(String phone) {
      boolean isDigit = isDigit(phone);
      int phoneLength = phone.length();
      boolean isLengthValid = phoneLength == VALID_PHONE_LENGTH;

      if(isDigit && isLengthValid) {
         return true;
      } else {
         return false;
      }
   }
}
