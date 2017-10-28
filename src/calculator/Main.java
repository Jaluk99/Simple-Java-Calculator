package calculator;

public class Main {
    public static void main(String[] args){
        CalculatorSystem system = new CalculatorSystem();
        //Parametry dla mnozenia, odejmowania, dodawania, dzielenia
        system.setA(-10);
        system.setB(8);

        system.setTyp("dodawanie");
        system.type();

        Delta.delta(1, -3, -4);
    }
}
