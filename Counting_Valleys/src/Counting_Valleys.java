import java.util.ArrayList;
import java.util.List;

public class Counting_Valleys {


    static int countingValleys(int n, String s) {
        int valley = 0;
        int numberOfValley = 0;

        String[] tab = s.split("");
        for (int i = 0; i < tab.length; i++) {
            List<Integer> ls= new ArrayList<>();
            if(valley){

            }


            if (tab[i].equals("D")) {
                valley -= 1;
            }
            if (tab[i].equals("U")) {
                valley += 1;
            }
            System.out.println(valley);
            if(tab[i].equals("U") && valley==0){
                numberOfValley+=1;
            }



        }

        return numberOfValley;

    }


        public static void main (String[]args){
            int n = 8;
            String s = "UDDDUDUU";

            int result = countingValleys(n, s);
        }


}
