package com.bridgelabz;

public class TestMax {

    public static void main(String[] args) {
        int a = 50; //50, 90, 20
        int b = 90;
        int c = 20;
        int temp;
        int temp1;
        temp = a > b ? a:b;
        temp1 = temp > c ? temp:c;
        System.out.println("maximum number among 3 integer: "+temp1);
    }
}