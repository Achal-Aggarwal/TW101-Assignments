package com.tw.assignment;

/**
 * Created by achalaggarwal on 1/9/15.
 */
public class FizzBuzz {
    private int maximum;

    public FizzBuzz(int maximum) {
        this.maximum = maximum;
    }

    public static void main(String argv[]){
        System.out.println(new FizzBuzz(100).print());
    }

    private String print() {
        String str = "";

        for (int num = 1; num <= maximum; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                str += "FizzBuzz";
            } else if (num % 3 == 0) {
                str += "Fizz";
            } else if (num % 5 == 0) {
                str += "Buzz";
            } else {
                str += num;
            }

            str += "\n";
        }

        return str;
    }
}
