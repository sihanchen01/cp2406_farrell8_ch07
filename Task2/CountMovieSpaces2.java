import java.util.Scanner;

public class CountMovieSpaces2 {
    public static void main(String[] args) {
        System.out.println("Your favourite movie quote:");
        Scanner userInput = new Scanner(System.in);
        String quote = userInput.nextLine();
        int numSpaces = 0;
        for (int i=0;i<quote.length();i++){
            if(quote.charAt(i) == ' '){
                numSpaces ++;
            }
        }
        System.out.println("The quote has " + numSpaces + " spaces.");
    }
}
