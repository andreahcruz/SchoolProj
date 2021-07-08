package com.company;

public class MyClass {

    public static int powerDigitSum( int n ) {
        int num = (int) Math.pow(2,n);
        String numString = Integer.toString(num);
        int ans = 0;
        for(char c: numString.toCharArray()){
            System.out.println(c + " char ");
            ans= ans + Character.getNumericValue(c);
        }
        return ans;
    }

    public static void main(String args[]) {

        double passed = 0;

        if( powerDigitSum(2) == 4 )

            ++passed;

        if( powerDigitSum(4) == 7 )

            ++passed;

        if( powerDigitSum(6) == 10 )

            ++passed;

        if( powerDigitSum(8) == 13 )

            ++passed;

        if( powerDigitSum(11) == 14 )

            ++passed;

        if( powerDigitSum(14) == 22 )

            ++passed;

        if( powerDigitSum(20) == 31 )

            ++passed;

        if( powerDigitSum(25) == 29 )

            ++passed;

        if( powerDigitSum(30) == 37 )

            ++passed;



        System.out.println( passed + " out of 9 tests passed: " + passed*100/9 + "%");

    }

}