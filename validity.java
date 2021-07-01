/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
public class validity {
    public boolean validateName(String Name) {
      Name = Name.toLowerCase();
      char[] charArray = Name.toCharArray();
      for (int i = 0; i < charArray.length; i++) {
         char ch = charArray[i];
         if (!(ch >= 'a' && ch <= 'z')) {
            return false;
         }
      }
      return true;
   }
   public boolean validatePassword(String password) {
       int PASSWORD_LENGTH = 8;
       if (password.length() < PASSWORD_LENGTH){
           return false;
       }
       int charCount = 0;
       int numCount = 0;
       for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (is_Numeric(ch)) {
                numCount++;
            }
            else if (is_Letter(ch)) {
                charCount++;
            }
            else {
                return false;
            }
        }
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }


    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
    
    public static boolean validateNumber(String contactNumber)
    {
        for (int i = 0; i <= contactNumber.length(); i++) {
            if (contactNumber.charAt(i) >= '0' && contactNumber.charAt(i) <= '9') {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    

    public static boolean validateEmail(String email){

      String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      return email.matches(regex);
    }
    
}
