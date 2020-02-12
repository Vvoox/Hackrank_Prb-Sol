package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SockMerchant {
    static int pairs = 0;

    static int sockMerchant(int n, int[] ar) {
        int len = ar.length;
        List<List<Integer>> pr = new ArrayList<>();
        List<Integer> ss= new ArrayList<>();
        ss.add(0);
        ss.add(0);
        pr.add(ss);

        for(int i=0 ; i<len ; i++){
            int numberOfColor =0 ;
            for(int j=0 ; j<len ; j++){

                if(ar[i]==ar[j]){
                    numberOfColor+=1;
                }

            }
            boolean stat =false;
            for(int l = 0 ; l<pr.size() ;l++){
                if(ar[i]==pr.get(l).get(0)){
                    stat=true;
                }
            }

            if(!stat){
                List<Integer> s= new ArrayList<>();
                s.add(ar[i]);
                s.add(numberOfColor);
                pr.add(s);
            }

        }


        for(int i=0 ; i<pr.size() ; i++) {
            pairs+=calcul(pr.get(i));
        }
        return pairs;
    }
    public static int calcul(List<Integer> ls){
        int result=0;
        if(ls.get(1)>1){
            result=ls.get(1)/2;
        }

        return  result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 9;
        int[] ar = {10,20,20,10,10,30,50,10,20};


        int result = sockMerchant(n, ar);


    }
}


