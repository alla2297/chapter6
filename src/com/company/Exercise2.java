package com.company;

public class Exercise2 {
    public static void main(String[] args) {
    double result = squareRoot(16);
    System.out.println(result);
    }
    public static double squareRoot(double a){
    double x=a/2;
    double oldx=-1;

    for(/*int i=0*/;Math.abs(oldx-x) <0.0001 /*1<10*/;/* i++*/){
    x= (x+a/x)/2;
    oldx=x;
    x=(x+a/x)/2;
    }
    return x;
    }

}
//x1 =(x_0 + a/x_0) / 2     0.0001. You can use Math.abs
