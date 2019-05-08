public class Prostokat implements Figura, Comparable<Figura>
{
    Punkt punkt;
    double bokA, bokB;

    Prostokat()
    {
        this.bokA = 1;
        this.bokB = 1;
        punkt = new Punkt();
    }
    Prostokat(double bokA, double bokB, double x, double y)
    {
        this.bokA = bokA;
        this.bokB = bokB;
        punkt = new Punkt(x,y);
    }
    @Override
    public double pole(){return bokA*bokB;}
    public double obwod(){return 2*bokA + 2*bokB;}
    public double getPozycjaX() { return this.punkt.getPozycjaX();}
    public double getPozycjaY() { return this.punkt.getPozycjaY();}
    public double getBokA(){return this.bokA;}
    public double getBokB(){return this.bokB;}
    public String toString()
    {
        return "Bok A: " + getBokA() + "Bok B: " + getBokB() + " Pozycja na osi: (" + getPozycjaX() + " , " + getPozycjaY() + ") Pole: " + pole() + " Obwod " + obwod();
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
