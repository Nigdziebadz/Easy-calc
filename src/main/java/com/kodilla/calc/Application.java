package com.kodilla.calc;

public class Application {

    public static void main(String[] args) {

        Calc run = new Calc();

        int plusResult = run.CalcAplusB(10, 5);
        int minusResult = run.CalcAminusB(10, 5);

        System.out.println("a plus b result: " + plusResult);
        System.out.println("a minus b result: " + minusResult);
    }
}
