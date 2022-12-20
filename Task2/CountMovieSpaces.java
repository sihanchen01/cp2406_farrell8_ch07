public class CountMovieSpaces {
    public static void main(String[] args) {
        final String QUOTE = "Love is the one thing that transcends time and space.";
        int numSpaces = 0;
        for (int i=0;i<QUOTE.length();i++){
            if(QUOTE.charAt(i) == ' '){
                numSpaces ++;
            }
        }
        System.out.println("The QUOTE has " + numSpaces + " spaces.");
    }
}
