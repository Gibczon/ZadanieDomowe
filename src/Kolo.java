public class Kolo implements Figura, Comparable<Figura>
{
    public static final double PI = 3.14159265359;
    double promien;
    Punkt punkt;

    Kolo()
    {
        this.promien = 1;
        punkt = new Punkt();
    }
    Kolo(double promien, double x, double y)
    {
        this.promien = promien;
        punkt = new Punkt(x,y);

    }
    public double getPromien(){ return this.promien; }
    public void setPromien(double promien){ this.promien = promien; }



    @Override
    public double pole()
    {
        return PI*(Math.pow(promien, 2));
    }
    public double obwod()
    {
        return PI*2*promien;
    }
    public double getPozycjaX() { return this.punkt.getPozycjaX();}
    public double getPozycjaY() { return this.punkt.getPozycjaY();}
    public String toString()
    {
        return "Promien " + getPromien() + " Pozycja na osi: (" + getPozycjaX() + " , " + getPozycjaY() + ") Pole: " + pole() + " Obwod " + obwod();
    }

    public int compareTo(Figura temp)
    {
        if(this.pole() > temp.pole())
            return 1;
        else if(this.pole() < temp.pole())
            return -1;
        else if(this.getPozycjaX() != temp.getPozycjaX() || this.getPozycjaY() != temp.getPozycjaY())
            return 1;
        else
            return 0;

    }
}
