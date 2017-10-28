package calculator;

public class Main {
    public static void main(String[] args){
        CalculatorSystem system = new CalculatorSystem();
        system.setA(-10);
        system.setB(8);

        system.setA1(-5);
        system.setB1(27);
        system.setC1(4);

        system.setTyp("delta");

        system.type();

    }
}
