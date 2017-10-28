package calculator;

public class Main {
    public static void main(String[] args){
        CalculatorSystem system = new CalculatorSystem();
        system.setA(10);
        system.setB(2);
        system.setTyp("odejmowanie");

        system.type();

    }
}
