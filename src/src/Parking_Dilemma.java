package com.company;

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
     * Complete the 'carParkingRoof' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY cars
     *  2. INTEGER k
     */


    public static long carParkingRoof(List<Long> cars,int k) {

        long roof =0;
        long roof_length=0;
        int n = cars.size();
        Collections.sort(cars);
        int times=n-k+1;
        int i=0;
        while(i<times){
            roof = Collections.max(cars.subList(i,i+k)) - Collections.min(cars.subList(i,i+k));
            if(i==0){
                roof_length=roof+1;
            }

            if(roof_length>roof+1){
                roof_length=roof+1;

            }
            i++;

        }


        return roof_length;
    }
}


public class Parking_Dilemma {
    public static void main(String[] args) throws IOException {

        long k =4;

        List<Long> cars = new ArrayList<>();

        cars.add((long) 2);
        cars.add((long) 10);
        cars.add((long) 8);
        cars.add((long) 17);
        cars.add((long) 3);

        int n = cars.size();



//        long result = Result.carParkingRoof(cars, k);
        System.out.println(k);
        for(int i = 0 ; i< n ;i++){

            System.out.print(cars.get(i)+ " ");
        }

        Result.carParkingRoof(cars,4);
    }
}
