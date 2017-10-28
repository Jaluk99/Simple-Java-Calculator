package calculator;

public class Main {
    public static void main(String[] args){
        Matma.delta(1, -3, -4);
        System.out.println("Wynik dodawania to " + Matma.dodawanie(-15, 20));
        System.out.println("Wynik odejmowania to " + Matma.odejmowanie(10, 5));
        System.out.println("Wynik mnozenia to " + Matma.mnozenie(2, 4));
        System.out.println("Wynik dzielenia to " + Matma.dzielenie(4, 2));
        System.out.println("Wynik pierwiastkowania to " + Matma.pierwiastkowanie(25));
        System.out.println("Wynik potegowania to " + Matma.potegowanie(3, 2));
    }
}
