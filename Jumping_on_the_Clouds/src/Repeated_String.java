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
        System.out.println(rest);
        for(int i = 0 ; i<ln ; i+=len){
            System.out.println("times:"+i);
            for(int j=0 ; j<len ; j++){

                result[i+j]=tab[j];
                System.out.println(result[j]);


            }

        }

        for(int j = 0 ; j<n ; j++){
            System.out.print(result[j]);
        }

        return res;

    }


    public static void main(String[] args) throws IOException {

        int n= 10;
        String s = "abcd";


        long result = repeatedString(s, n);
//        System.out.println(result);

    }
}

