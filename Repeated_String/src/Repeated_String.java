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
            String[] result = new String[l];
            int j=0;
            for (int i = 0; i < l; i++) {

                result[i] = tab[j];
                if(tab[j].equals("a")){
                    res+=1;
                }

                j++;
                if (j == len) {
                    j = 0;
                }
            }

        }
        System.out.println(res);
        return res;

    }

    public static void main(String[] args) throws IOException {

        long n = 10;
        String s = "abc";


        long result = repeatedString(s, n);

    }
}

