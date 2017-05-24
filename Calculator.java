package mockito.HomeTaskMokito;

import java.util.Random;

public class Calculator {

    public int getRandomNumber() {
        Random number = new Random();
        return number.nextInt(50) + 1;
    }

    public int getRandomNumberTwo() {
        return (int) (Math.random() * 50 + 1);
    }

    public int getResultOfMultiplication() {
        return getRandomNumber() * getRandomNumberTwo();
    }

    public double getResultOfDivision() {
        return (double) getRandomNumber() / getRandomNumberTwo();
    }

    public int getResultOfAdding() {
        return getRandomNumber() + getRandomNumberTwo();
    }

    public int getResultOfSubtraction() {
        return getRandomNumber() - getRandomNumberTwo();
    }

    public int getResultOfQuotient() {
        return getRandomNumber() % getRandomNumberTwo();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result of Multiplication = " + calculator.getResultOfMultiplication());
        System.out.println("Result of Division = " + calculator.getResultOfDivision());
        System.out.println("Result of Adding = " + calculator.getResultOfAdding());
        System.out.println("Result of Substruction = " + calculator.getResultOfSubtraction());
        System.out.println("Result of Quotient = " + calculator.getResultOfQuotient());
    }
}


