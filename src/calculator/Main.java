package calculator;

public class Main {
    public static void main(String[] args){
        CalculatorSystem system = new CalculatorSystem();
        //Parametry dla mnozenia, odejmowania, dodawania, dzielenia
        system.setA(-10);
        system.setB(8);

        //Parametry dla delty
        system.setA1(-5);
        system.setB1(27);
        system.setC1(4);

        //Ustaw typ (mnozenie, dodawania, odejmowanie, dzielnie, delta)
        system.setTyp("delta");

        //Metoda licząca
        system.type();
    }
}
