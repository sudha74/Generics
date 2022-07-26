package com.bridgelabz;

public class TestMax {

    public static void main(String[] args) {
        float a = 50.55f; //50, 90, 20
        float b = 20.22f;
        float c = 90.99f;
        float temp;
        float temp1;
        temp = a > b ? a:b;
        temp1 = temp > c ? temp:c;
        System.out.println("maximum number among 3 float number: "+temp1);
    }
}