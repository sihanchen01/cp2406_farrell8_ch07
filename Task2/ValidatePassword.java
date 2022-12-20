import java.util.Scanner;

public class ValidatePassword {
    static int lowerChars = 2;
    static int upperChars = 2;
    static int digits = 2;
    static String password = "";

    public static void main(String[] args) {
        while(!passValidation()){
            System.out.println("Your password: " + password);
            System.out.printf("You need %s more lower letters, %s more upper letters, %s more digits.\n",
                    lowerChars, upperChars, digits);
            Scanner userInput = new Scanner(System.in);
            char newChar = userInput.next().charAt(0);
            checkNewInput(newChar);
            password = password + newChar;
        }
        System.out.println("Congrats, passed!");
    }

    public static void checkNewInput(char newChar){
        if (Character.isLowerCase(newChar)){
            lowerChars --;
        }
        else if (Character.isUpperCase(newChar)){
            upperChars --;
        }
        else if (Character.isDigit(newChar)){
            digits --;
        }
    }

    public static boolean passValidation(){
        return lowerChars <= 0 && upperChars <= 0 && digits <= 0;
    }
}
