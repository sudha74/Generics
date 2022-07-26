package com.bridgelabz;

public class TestMax {

    public static void main(String[] args) {
        int a = 90; //90, 50, 20
        int b = 50;
        int c = 20;
        int temp;
        int temp1;
        temp = a > b ? a:b;
        temp1 = temp > c ? temp:c;
        System.out.println("maximum number among 3 integer: "+temp1);
    }
}