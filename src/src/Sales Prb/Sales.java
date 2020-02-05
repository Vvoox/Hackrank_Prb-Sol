import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    public static int balancedSum(List<Integer> sales) {
        int n = sales.size();
        int result=0;
        sales.subList(0,1);
        for(int balancedN =1;balancedN<n-1;balancedN++){

            if(leftSum(sales,balancedN)==rightSum(sales,balancedN)){

                result = balancedN;
                break;

            }
        }
        System.out.println(result);
        return result;
    }

    public static int leftSum(List<Integer> leftSales,int index){
        int sum= 0;
        for(int i:leftSales.subList(0,index)){

            sum+=i;
        }

        return sum;
    }
    public static int rightSum(List<Integer> rightSales,int index){
        int sum= 0;
        int n = rightSales.size();
        for(int i :rightSales.subList(index+1,n)){
            sum+=i;
        }
        return sum;
    }


}


public class Solution {
    public static void main(String[] args) throws IOException {

        long startTime = System.nanoTime();
        List<Integer> sales = new ArrayList<>();
        sales.add(1);
        sales.add(2);
        sales.add(1);
        sales.add(3);
        Result.balancedSum(sales);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration/10000);
    }
}
