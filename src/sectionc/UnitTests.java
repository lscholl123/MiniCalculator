package sectionc;

public class UnitTests {
    public static void main(String[] args) {
        multiplyTest();
        divideTest();
        calculateTest();
    }

    public static void multiplyTest() {
        Calculator calculator=new MiniCalculator();
        calculator.multiply(5);
        calculator.multiply(5);
        if(calculator.calculate()==25) {
            System.out.println("Multiply Test successful");
        }
        else {
            System.out.println("Multiply Test failed");
        }
    }

    public static void divideTest() {
        Calculator calculator= new MiniCalculator();
        try {
            calculator.divide(0);
            System.out.println("Divide Test division by 0 failed");
        }
        catch (Exception e) {
            System.out.println("Division Test divide by 0 failed successfully");
        }
    }

    public static void calculateTest() {
        Calculator calculator = new MiniCalculator();
        if(calculator.calculate()==1){
            System.out.println("Calculate Test successful");
        }
        else {
            System.out.println("Calculate Test failed");
        }
    }
}
