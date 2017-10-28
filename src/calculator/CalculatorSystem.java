package calculator;

public class CalculatorSystem {

    private int a, b;
    private double a1, b1, c1;
    private String typ;
    private int wynik;
    private double x1, x2, x0;

    public CalculatorSystem() {}

    public void msg() {
        System.out.println("Wynik " + typ + " to " + wynik);
    }

    public void msgDelta(int i) {
        switch (i) {
            case 1:
                System.out.println("Wynik " + typ + " to x0: " + x0);
                break;
            case 2:
                System.out.println("Wynik " + typ + " to x1: " + x1 + " | x2: " + x2);
                break;
            case 3:
                System.out.println("Delta nie ma rozwiazania!");
        }
    }

    public void delta() {
        double delta;

        Math.pow(b1, 2);
        delta = b1 - 4 * a1 * c1;
        wynik = ((int) Math.sqrt(delta));

        if(wynik == 0) {
            setX0((-b1 / (2 * a1)));
            msgDelta(1);
        } else if(wynik > 0) {
            setX1((-b1 + wynik) / (2 * a1));
            setX2((-b1 - wynik) / (2 * a1));
            msgDelta(2);
        } else if(wynik < 0) {
            msgDelta(3);
        } else {
            System.out.println("Wystapil blad!");
        }
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
            case "delta":
                setTyp("Delty");
                delta();
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

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }
}
