package org.courses.ex9_4;

public class Main {
    public static void main(String[] args) {

        Calculatable sum = (a, b) -> a + b;
        Calculatable sub = (a, b) -> a - b;
        Calculatable div = (a, b) -> a / b;
        Calculatable mul = (a, b) -> a * b;

        int resultSum = sum.action(7, 5);
        int resultSub = sub.action(7, 5);
        int resultDiv = div.action(7, 5);
        int resultMul = mul.action(7, 5);

        System.out.println(resultSum);
        System.out.println(resultSub);
        System.out.println(resultDiv);
        System.out.println(resultMul);

    }
}