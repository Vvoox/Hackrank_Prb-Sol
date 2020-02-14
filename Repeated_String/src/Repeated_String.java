import java.io.IOException;

public class Repeated_String {

    static long repeatedString(String s, long n) {

        int len = s.length();
        long res = 0;
        int l = (int)n;
        String[] tab = s.split("");
        String[] result = new String[l];
        int j=0;
        for(int i = 0 ; i<l; i++){
            if( calcul(tab,"a")==len ){
                res = len*n;
                break;
            }

            result[i]=tab[j];

            j++;
            if(j==len) {
                j=0;
            }
            if(i==n-1){
                res = calcul(result,"a");

            }


        }
        return res;

    }
    public static int calcul(String[] tab , String caracter ){
        int n = tab.length;
        int count = 0 ;
        for(int i=0 ;i<n ; i++){
            if(tab[i].equals(caracter)){
                count+=1;
            }
        }
        return count;
    }


    public static void main(String[] args) throws IOException {

        long n= 100000000;
        String s = "a";


        long result = repeatedString(s, n);

    }
}

