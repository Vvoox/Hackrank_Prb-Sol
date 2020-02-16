package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Minus_Plus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr, int n) {
        float positive = 0 , negative = 0 , zero = 0;
        float pos =0,neg =0 , ze=0;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<0){
                negative+=1;
            }
            if(arr[i]>0){
                positive+=1;
            }
            if(arr[i]==0){
                zero+=1;
            }

        }
        pos = positive / n;
        neg = negative / n;
        ze = zero / n;

        System.out.println(pos + " "+ neg + " "+ze);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 6;
        int[] arr = {-4,3,-9,0,4,1};

        plusMinus(arr,n);


    }
}

