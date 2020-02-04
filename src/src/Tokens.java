package com.company;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class Tokens {

    public static void main(String[] args) throws IOException {
        List<List<Integer>> commands = new ArrayList<>();

        int expiryLimit = 3;

        List<Integer> a1 = new ArrayList<>();
        a1.add(0);
        a1.add(1);
        a1.add(1);
        List<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(1);
        a2.add(4);
        List<Integer> a3 = new ArrayList<>();
        a3.add(1);
        a3.add(6);
        a3.add(5);

        commands.add(a1);
        commands.add(a2);
        commands.add(a3);

        System.out.println(expiryLimit);
        System.out.println(commands.size());
        System.out.println(commands.get(0).size());

        for(int i =0 ; i<commands.size() ; i++){
            for(int j = 0 ; j<commands.get(0).size(); j++){

                System.out.print(commands.get(i).get(j)+" ");
            }
            System.out.println();

        }
//        Result.numberOfTokens(expiryLimit, commands);

//        int result = Result.numberOfTokens(expiryLimit, commands);
        Result.test(expiryLimit, commands);


    }

}

class Result {

    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {

        int T = 0;
        int time_running = 0;
        int token_running = 0;
//        List<List<Integer>> token = new ArrayList<>();
//
//
//        int l=0;
//        for(int j = 0 ; j<commands.size() ; j++){
//
//            List<Integer> t = new ArrayList<>();
//
//            if (commands.get(l).get(1).equals(commands.get(j).get(1))) {
//
//                t.add(commands.get(j).get(0));
//                t.add(commands.get(j).get(2));
//
//            }
//            token.add(t);
//
//            if(j==commands.size()-1){
//                break;}
//
//
//            }
//
//
//
//        for(int i = 0 ; i<token.size();i++){
//
//            for(int j=0 ; j<token.get(0).size() ; j++){
//
//                System.out.print(token.get(i).get(j)+" ");
//
//            }
//            System.out.println();
//
//        }
//
////        return expiryLimit;
//    }
        for (int i = 0; i < commands.size(); i++) {

            boolean get = false, reset = false;
            if (commands.get(i).get(0).equals(0)) {
                get = true;
                reset = false;
            }
            if (commands.get(i).get(0).equals(1)) {
                get = false;
                reset = true;
            }

            if (get) {

                token_running = commands.get(i).get(1);
                time_running = commands.get(i).get(2) + expiryLimit;
                System.out.println(time_running);
            }
            if (reset) {
                System.out.println(commands.get(i).get(2));

                if (time_running >= commands.get(i).get(2)) {
                    time_running = commands.get(i).get(2) + expiryLimit;
                }
                else{
                    token_running-=1;
                }
            }



        }
        return token_running;




    }
    public static void test(int expiryLimit, List<List<Integer>> commands) {
        int max = commands.get(0).get(1);
        for(int i = 0 ; i< commands.size() ; i++){

            if(max <= commands.get(i).get(1)){

                max = commands.get(i).get(1);
            }

        }
        System.out.println("max of tokens id  : "+max);

        int tokens_number = 1;
        int t = commands.get(0).get(1);
        for (int i = 0; i < commands.size(); i++) {

            if (t != commands.get(i).get(1)) {

                t = commands.get(i).get(1);
                tokens_number += 1;
            }
        }
        System.out.println(tokens_number);

        int n = commands.get(0).get(1);
        while (n <= max) {
            int status = 0;
            int i=0;
            int token_id=commands.get(i).get(1);
            if (token_id == commands.get(n).get(1)) {
                status += 1;

            }

            System.out.println("token " + token_id + " times : " + status);
            n++;
            i++;

        }
    }


}

