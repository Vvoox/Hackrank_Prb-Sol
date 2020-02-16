package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Repeated_String implements Serializable{

    static long repeatedString(String s, long n) {

        int len = s.length();
        long res = 0;

        if(len==1 && s.equals("a")){
            res = n;
        }
        else {
            int l = (int)n;
            String[] tab = s.split("");
            if(tab.length==calcul(tab)){
                res=l;
            }
            else {
                int j = 0;
                for (int i = 0; i < l; i++) {
                    if (tab[j].equals("a")) {
                        res += 1;
                    }
                    j++;
                    if (j == len) {
                        j = 0;
                    }
                }
            }

        }
        return res;

    }
    public static int calcul(String[] tab){
        int calcul= 0;

        for(int i=0 ; i<tab.length ; i++){
            if(tab[i].equals("a")){
                calcul+=1;

            }
        }
        return calcul;
    }

    public static void main(String[] args) {
        //just an exemple
        long n = 100;
        String s = "abc";


        long result = repeatedString(s, n);

    }
}

