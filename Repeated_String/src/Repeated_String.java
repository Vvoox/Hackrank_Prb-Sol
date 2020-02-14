import java.io.IOException;

public class Repeated_String {

    static long repeatedString(String s, long n) {

        int len = s.length();
        long res = 0;
        int l = (int)n;
        String[] tab = s.split("");
        String[] result = new String[l];
        int div =(int) n/len;
        int ln = div*len;
        int rest =(int) n-ln;
        for(int i = 0 ; i<n ; i+=len){
            for(int j=0 ; j<len ; j++){

                if((i+j)==n-1){
                    break;
                }
                result[i+j]=tab[j];

            }

        }
//        res = calcul(result,"a");
        for(int i =0 ; i<n ; i++){
            System.out.println(result[i]);
        }
        System.out.println(res);


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

        long n= 1000000000000;
        String s = "a";


        long result = repeatedString(s, n);

    }
}

