package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        int a = rnd.nextInt();
        int b = rnd.nextInt();
        int c = rnd.nextInt();

        calculateQuadraticExpression(a, b, c);
    }

    public static int calculateDescriminant(int a, int b, int c){
        return b*b - 4*a*c;
    }

    public static void calculateQuadraticExpression(int a, int b, int c) {
        int d = calculateDescriminant(a, b, c);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println(String.format("This expression has two solutions: x1 = %f, x2 = %f", x1, x2));
        }
        else if (d == 0) {
            double x = -b / (2*a);
            System.out.println(String.format("This expression has one solution: %f", x));
        }
        else if (d < 0) {
            System.out.println("This expression doesn't have solution");
        }
    }
}
