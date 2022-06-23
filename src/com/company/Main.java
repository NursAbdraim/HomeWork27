package com.company;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sqrt().apply(sc.nextDouble()));
    }

    public static UnaryOperator<Double> sqrt(){
        return Math::sqrt;
    }
}
