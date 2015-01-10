package com.tw.assignment;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    private int number;

    public PrimeFactors(int number) {
        this.number = number;
    }

    public static void main(String args[]){
        System.out.println(new PrimeFactors(1).generate());
        System.out.println(new PrimeFactors(30).generate());
        System.out.println(new PrimeFactors(11).generate());
    }

    private List<Integer> generate() {
        if (number == 1){
            return new ArrayList<Integer>();
        }

        List<Integer> factors = new ArrayList<Integer>();
        int maximumDivisor = number;
        for (int divisor = 2; divisor <= maximumDivisor; divisor++) {
            if(number%divisor == 0){
                factors.add(new Integer(divisor));
                while(number%divisor == 0){
                    number /= divisor;
                }
            }
        }

        return factors;
    }
}
