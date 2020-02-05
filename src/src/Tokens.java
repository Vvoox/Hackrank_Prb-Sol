package com.company;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import sun.java2d.opengl.GLXSurfaceData;

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

public class Solution {

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();

        List<List<Integer>> commands = new ArrayList<>();

        int expiryLimit = 3;
        int tok;
        int n = commands.size();

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
        a3.add(2);
        a3.add(5);
        List<Integer> a4 = new ArrayList<>();
        a4.add(0);
        a4.add(3);
        a4.add(7);
        List<Integer> a5 = new ArrayList<>();
        a5.add(1);
        a5.add(3);
        a5.add(8);


        commands.add(a1);
        commands.add(a2);
        commands.add(a3);
        commands.add(a4);
        commands.add(a5);



        System.out.println(expiryLimit);
        System.out.println(commands.size());
        System.out.println(commands.get(0).size());

        for (int i = 0; i < commands.size(); i++) {
            for (int j = 0; j < commands.get(0).size(); j++) {

                System.out.print(commands.get(i).get(j) + " ");
            }
            System.out.println();

        }
        int status = 0;

        for(int i=0 ; i < commands.size() ; i++){
            System.out.println(Result.tokenRunning(i, expiryLimit, commands));
            if(Result.tokenRunning(i, expiryLimit, commands)){
                status+=1;
            }

        }
        System.out.println(status);




        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("Time : " + duration / 10000);

    }

}

class Result {

    public static boolean tokenRunning(int token , int expiryLimit , List<List<Integer>> commands){

        int n = commands.size();
        int i=0;
        int start = 0;
        int finish = 0;
        boolean status = false;
        while(i<n){
            if(commands.get(i).get(1)==token){

                if(commands.get(i).get(0)==0){
                    start=commands.get(i).get(2);
                    finish =commands.get(i).get(2)+expiryLimit ;
                }
                if(commands.get(i).get(0)==1){

                    if(commands.get(i).get(2)>finish){
                        status = false;
                        break;
                    }
                    else{
                        start = commands.get(i).get(2);
                        finish =commands.get(i).get(2)+expiryLimit ;
                        status=true;
                    }

                }

            }
            i++;

        }

        return status;

    }


}

