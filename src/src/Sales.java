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

    /*
     * Complete the 'balancedSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY sales as parameter.
     */

    public static int balancedSum(List<Integer> sales) {

        int n = sales.size();
//        int leftSum = sales.get(0);
//        int rightSum = sales.get(n-1);
        int L = n - 2;
        int R = n - 1;
        int balancedN = 1;
        int result = 0;

        while(balancedN<n-1){

            if(leftSum(sales,balancedN)==rightSum(sales,balancedN)){

                result = balancedN;

            }


            balancedN++;
        }
        System.out.println(result);
        return result;
    }

    public static int leftSum(List<Integer> leftSales,int index){
        int i=0;
        int sum= 0;
        while(i<index){

            sum+=leftSales.get(i);
            i++;
        }
        System.out.println("left sum "+sum);
        return sum;
    }
    public static int rightSum(List<Integer> leftSales,int index){
        int i= leftSales.size()-1;
        int sum= 0;
        while(i>index){

            sum+=leftSales.get(i);
            i--;
        }
        System.out.println("right sum :"+sum);
        return sum;
    }
//
//
//        for (int index = 1; index < n - 1; index++) {
//
//            int leftsum = 0;
//            int rightsum = 0;
//            for (int left = 0; left < index; left++) {
//                leftsum += sales.get(left);
//            }
//            for (int right = index + 1; right < n; right++) {
//
//                rightsum += sales.get(right);
//            }
//            System.out.println("left is : " + leftsum);
//            System.out.println("right is : " + rightsum);
//
//            if(leftsum==rightsum){
//
//                result=index;
//            }
//
//
//
//        }
//        System.out.println(result);
//

}


public class Solution {
    public static void main(String[] args) throws IOException {


        List<Integer> sales = new ArrayList<>();
        sales.add(1);
        sales.add(2);
        sales.add(1);
        sales.add(3);
        Result.balancedSum(sales);

    }
}
