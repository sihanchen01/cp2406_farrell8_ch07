import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        List<String> babyNames = new ArrayList<String>();
        for(int i=0;i<3;++i){
            System.out.printf("Input baby name %s: ", i+1);
            Scanner userInput = new Scanner(System.in);
            babyNames.add(userInput.nextLine());
        }

        for (int i=0; i<babyNames.size() - 1; i++){
            for (int j=i+1; j<babyNames.size(); j++){
                System.out.println(babyNames.get(i) + " - " + babyNames.get(j));
            }
        }
    }
}
