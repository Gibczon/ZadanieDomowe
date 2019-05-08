public class Punkt
{
    private double pozycjaX, pozycjaY;
    Punkt()
    {
        pozycjaX = 0;
        pozycjaY = 0;
    }
    Punkt(double x, double y)
    {
        this.pozycjaX=x;
        this.pozycjaY=y;
    }
    public double getPozycjaX()
    {
        return pozycjaX;
    }
    public double getPozycjaY()
    {
        return pozycjaY;
    }
    public String getPozycja() { return "Pozycja X: " + pozycjaX + " pozycja Y:" + pozycjaY; }
    public void setPozycjaX(double pozycjaX)
    {
        this.pozycjaX = pozycjaX;
    }
    public void setPozycjaY(double pozycjaY)
    {
        this.pozycjaY = pozycjaY;
    }

}
