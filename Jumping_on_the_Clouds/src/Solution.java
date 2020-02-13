import java.io.IOException;

class Solution {

    static int jumpingOnClouds(int[] c) {
        int n = c.length;
        int jump = 0;
        int i = 0;
        while (i < n) {

            if(i==n-1){
                break;
            }


            if(c[i+1]==0){
                if(i+1==n-1){
                    jump+=1;
                    break;
                }
                if(c[i+2]==0 && (i+2)<n-1){
                    jump+=1;
                    i+=2;
                }
                if(c[i+2]==1){
                    jump+=1;
                    i+=1;
                }
            }
            if(c[i+1]==1){
                if(i+1==n-1){
                    break;
                }
                jump+=1;
                i+=2;
            }


        }
        return jump;

    }



    public static void main(String[] args) throws IOException {

        int[] c= {0,0,0,1,0,0};
        int result = jumpingOnClouds(c);

    }
}
