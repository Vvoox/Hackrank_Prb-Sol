import java.util.ArrayList;
import java.util.List;

public class Counting_Valleys {

    static int countingValleys(int n, String s) {
        int valley = 0;
        int numberOfValley = 0;



        for (int i = 0; i <n; i++) {

            if (s.charAt(i) == 'D') {
                valley -= 1;
            }
            if (s.charAt(i) == 'U'){
                valley += 1;
            }
            if(valley==0 && s.charAt(i) == 'U'){
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
