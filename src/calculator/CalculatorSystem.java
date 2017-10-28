package calculator;

public class CalculatorSystem {

    private int a;
    private int b;
    private String typ;
    private int wynik;

    public CalculatorSystem() {}

    public CalculatorSystem(int a, int b, String typ) {
        this.a = a;
        this.b = b;
        this.typ = typ;
    }

    public void msg() {
        System.out.println("Wynik " + typ + " to " + wynik);
    }

    public void type(){
        switch(getTyp()){
            case "mnozenie":
                setTyp("Mnozenia");
                setWynik(getA()*getB());
                msg();
                break;
            case "dzielenie":
                setTyp("Dzielenia");
                setWynik(getA()/getB());
                msg();
                break;
            case "dodawanie":
                setTyp("Dodawania");
                setWynik(getA()+getB());
                msg();
                break;
            case "odejmowanie":
                setTyp("Odejmowania");
                setWynik(getA()-getB());
                msg();
                break;
            default:
                System.out.println("Podales zly typ!");
        }
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }
}
