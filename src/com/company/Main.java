package com.company;

public class Main {

    public static void main(String[] args) {
//	    SimpleCalculator calculator = new SimpleCalculator();
//	    calculator.setFirstNumber(5.0d);
//	    calculator.setSecondNumber(4d);
//        System.out.println("add = " + calculator.getAdditionResult());
//        System.out.println("subtract = " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25d);
//        calculator.setSecondNumber(0d);
//        System.out.println("multiply = " + calculator.getMultiplicationResult());
//        System.out.println("divide = " + calculator.getDivisionResult());

        Cup redCup = new Cup();
        Cup blueCup = new Cup();
        redCup.setColour("red");
        redCup.setVolume(90);
        blueCup.setVolume(110);
        System.out.println(redCup.isBigEnough("Felix"));
        System.out.println(blueCup.isBigEnough("Felix"));
    }



}
