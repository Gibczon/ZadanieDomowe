public class Kwadrat extends FiguraForemna implements Comparable<Figura>
{
    Kwadrat()
    {
        bok = 1;
        nazwa = "Kwadrat";
        punkt = new Punkt();
    }
    Kwadrat(double bok, double x, double y)
    {
        this.bok = bok;
        this.nazwa = "Kwadrat";
        punkt = new Punkt(x,y);
    }
    @Override
    public double pole() { return bok*bok; }
    public double obwod() { return 4*bok; }
    public double getPozycjaX() { return this.punkt.getPozycjaX();}
    public double getPozycjaY() { return this.punkt.getPozycjaY();}
    public double getBok(){return this.bok;}
    public String toString()
    {
        return "Bok + " + getBok() + " Pozycja na osi: (" + getPozycjaX() + " , " + getPozycjaY() + ") Pole: " + pole() + " Obwod " + obwod();
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
