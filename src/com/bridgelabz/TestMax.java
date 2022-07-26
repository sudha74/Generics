package com.bridgelabz;

public class TestMax {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if (z.compareTo(max) > 0){
            max = z;
        }
        System.out.printf("Max of %s, %s and %s is: %s\n",x,y,z,max);
        return max;
    }

    public static void main(String[] args) {
        maximum(50,90,20);
        maximum(50.55,90.99,20.22);
        maximum("Peach","Banana","Apple");

    }
}