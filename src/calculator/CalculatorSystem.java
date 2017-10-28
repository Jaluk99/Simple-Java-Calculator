package calculator;

public class CalculatorSystem {

    private int a, b;
    private double a1, b1, c1;
    private String typ;
    private int wynik;
    private double x1, x2, x0;

    public CalculatorSystem() {}

    public CalculatorSystem(int a, int b, String typ) {
        this.a = a;
        this.b = b;
        this.typ = typ;
    }

    public void msg() {
        System.out.println("Wynik " + typ + " to " + wynik);
    }

    public void msgDelta(int i) {
        switch (i) {
            case 1:
                System.out.println("Wynik " + typ + " to x0: " + getX0());
                break;
            case 2:
                System.out.println("Wynik " + typ + " to x1: " + getX1() + " | x2: " + getX2());
                break;
            case 3:
                System.out.println("Delta nie ma rozwiazania!");
        }
    }

    public void delta() {
        double delta;

        Math.pow(b1, 2);
        delta = b1 - 4 * a1 * c1;
        setWynik((int) Math.sqrt(delta));

        if(wynik == 0) {
            setX0((-b1 / (2 * a1)));
            msgDelta(1);
        } else if(wynik > 0) {
            setX1((-b1 + getWynik()) / (2 * a1));
            setX2((-b1 - getWynik()) / (2 * a1));
            msgDelta(2);
        } else if(wynik < 0) {
            msgDelta(3);
        } else {
            System.out.println("Wystapil blad!");
        }
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
            case "delta":
                setTyp("Delty");
                delta();
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

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getB1() {
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }
}
