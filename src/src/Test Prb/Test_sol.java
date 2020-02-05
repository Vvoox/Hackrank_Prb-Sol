package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        for(int i = 1 ; i<=n ; i++){
            String stat="";
            if (i % 3 == 0) {
                stat = "Fizz";
                if(i%5==0){
                    stat="FizzBuzz";
                }
            }
            if (i % 5 == 0 && stat=="") {
                stat = "Buzz";

            } if(stat==""){
                stat = Integer.toString(i);
            }

            System.out.println(stat);
        }
    }

}
