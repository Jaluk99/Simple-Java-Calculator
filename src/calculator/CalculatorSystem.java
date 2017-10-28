package calculator;

public class CalculatorSystem {

    private int a, b;
    private String typ;
    private int wynik;

    public CalculatorSystem() {}

    public void msg() {
        System.out.println("Wynik " + typ + " to " + wynik);
    }

    public void type(){
        switch(typ){
            case "mnozenie":
                setTyp("Mnozenia");
                setWynik(a * b);
                msg();
                break;
            case "dzielenie":
                setTyp("Dzielenia");
                setWynik(a / b);
                msg();
                break;
            case "dodawanie":
                setTyp("Dodawania");
                setWynik(a + b);
                msg();
                break;
            case "odejmowanie":
                setTyp("Odejmowania");
                setWynik(a - b);
                msg();
                break;
            default:
                System.out.println("Podales zly typ!");
        }
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

}
