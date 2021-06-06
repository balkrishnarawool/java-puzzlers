package com.balarawool.javapuzzlers;

import java.math.BigDecimal;

public class JavaPuzzler001 {

    public static void main(String[] args) {
        BigDecimal bd1 = BigDecimal.valueOf(2.8);
        BigDecimal bd2 = BigDecimal.valueOf(2);
        BigDecimal bd3 = BigDecimal.valueOf(10);
        int i = bd1.subtract(bd2).multiply(bd3).intValue();
        System.out.println(i);
    }
}


















//    Convert 0.8 in base 10 to base 2
//    0.8 * 2 = 1.6 => 1
//    0.6 * 2 = 1.2 => 1
//    0.2 * 2 = 0.4 => 0
//    0.4 * 2 = 0.8 => 0
//    0.8 in base 10 = 0.1100110011001100.... in base 2
//    Convert 0.1100110011001100.... in base 2 to base 10
//    1 / 2^1 = 0.5
//    1 / 2^2 = 0.25
//    0 / 2^3 = 0
//    0 / 2^4 = 0
//    1 / 2^5 = 0.03125
//    1 / 2^6 = 0.015625
//    0.1100110011001100 in base 2 = 0.796875 in base 10

//    Convert 0.5 in base 10 to base 2
//    0.5 * 2 = 1.0 => 1
//    0.5 in base 10 = 0.1 in base 2
//    Convert 0.1 in base 2 to base 10
//    1 / 2^1 = 0.5
//    0.1 in base 2 = 0.5 in base 10
