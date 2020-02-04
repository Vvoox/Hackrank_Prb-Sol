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

        int n = cars.size();
        Collections.sort(cars);
        List<Long> end = new ArrayList<>();


//        for (int i = 0; i < n; i++) {
//
//            System.out.println(cars.get(i));
//        }

        for (int i = 0; i < n; i++) {
            List<List<Long>> allCars = new ArrayList<>();
            for (int j = 0; j < n; j++) {

                List<Long> c = new ArrayList<>();
                if (cars.get(i) <= cars.get(j)) {

                    c.add(cars.get(j));
                    c.add(cars.get(j) - cars.get(i));
                } else {
                    c.add(cars.get(j));
                    c.add(cars.get(i) - cars.get(j));
                }

                allCars.add(c);


            }

            end.add(sortedCarDis(allCars,k));
            Collections.sort(end);


        }
        System.out.print(end.get(0)+" ");

        return end.get(0);


    }

    public static long sortedCarDis(List<List<Long>> allcars,int k) {
        int n = allcars.size();
        long roof_length = 0 ;


        for(int i=0 ; i<n ; i++){

            for(int j = 0 ; j<n ; j++){

                if(allcars.get(i).get(1) <= allcars.get(j).get(1)){
                    List<Long> backup = new ArrayList<>();
                    backup = allcars.get(i);
                    Collections.replaceAll(allcars, allcars.get(i), allcars.get(j));
                    allcars.set(j, backup);
                }
            }
        }

        long max = allcars.get(0).get(0) ;
        int indice_max = 0;
        long min = allcars.get(0).get(0) ;
        int indice_min = 0;



        for(int i = 0 ; i<k ; i++){


            if(max<=allcars.get(i).get(0)){
                max=allcars.get(i).get(0);
                indice_max = i;

            }
            if(min>=allcars.get(i).get(0)){
                min=allcars.get(i).get(0);
                indice_min=i;

            }
        };

        if(allcars.get(indice_max).get(0)< allcars.get(indice_min).get(0)){

            roof_length = allcars.get(indice_min).get(0) - allcars.get(indice_max).get(0) +1;
        }
        else{
            roof_length = allcars.get(indice_max).get(0) - allcars.get(indice_min).get(0) +1;

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
