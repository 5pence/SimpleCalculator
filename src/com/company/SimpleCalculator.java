package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //---------------- Getters -----------------/
    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    //---------------- Setters -----------------/
    public void setFirstNumber(double number){
        this.firstNumber = number;
    }

    public void setSecondNumber(double number){
        this.secondNumber = number;
    }

    //---------------- Methods -----------------/
    public double getAdditionResult() {
        return (this.firstNumber + this.secondNumber);
    }

    public double getSubtractionResult() {
        return (this.firstNumber - this.secondNumber);
    }

    public double getMultiplicationResult() {
        return (this.firstNumber * this.secondNumber);
    }

    public double getMultiplicationResult(int one) {
        return (this.firstNumber * this.secondNumber);
    }

    public double getMultiplicationResult(double one) {
        return (this.firstNumber * this.secondNumber);
    }

    public double getMultiplicationResult(int one, int two) {
        return (this.firstNumber * this.secondNumber);
    }

    public double getDivisionResult() {
        if (this.secondNumber == 0) {
            return 0;
        }

        String name = "felix";

        switch (name) {
            case "felix":
                //do something
                break;
            case "spence":
                //do someting
                break;
        }


        return (this.firstNumber / this.secondNumber);

    }
}
