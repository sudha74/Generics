package com.bridgelabz;

public class TestMax <T extends Comparable<T>> {
    T x,y,z;

    TestMax(T x, T y,T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        return TestMax.maximum(x,y,z);
    }

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
        Integer xInt = 50, yInt = 90, zInt = 20;
        Float xFloat = 50.55f, yFloat = 90.99f, zFloat = 20.22f;
        String xString = "Peach", yString = "Banana", zString = "Apple";
        new TestMax(xInt,yInt,zInt).maximum();
        new TestMax(xFloat,yFloat,zFloat).maximum();
        new TestMax(xString,yString,zString).maximum();
    }
}