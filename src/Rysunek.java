import java.util.*;

public class Rysunek
{

    static class WyjatekBoku extends Throwable
    {
        WyjatekBoku(){};
    }
    static class WyjatekIstnienia extends Throwable
    {
        WyjatekIstnienia(){};
    }

    public static void main(String[] args)
    {
        TreeSet<Figura> t = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        double wspX, wspY, bokA, bokB;
        boolean end = false;
            do
            {
                System.out.println("Witaj! Wybierz opcje: ");
                System.out.println("1 - Wprowadź koło");
                System.out.println("2 - Wprowadź Kwadrat");
                System.out.println("3 - Wprowadź Prostokat");
                System.out.println("Co innego - wyjście z menu");
                switch(sc.nextInt())
                {
                    case 1:
                        try
                        {
                            System.out.println("Podaj promień koła: ");
                            bokA = sc.nextDouble();
                            if(bokA <= 0)
                                throw new WyjatekBoku();
                            System.out.println("Podaj współrzędną X: ");
                            wspX = sc.nextDouble();
                            System.out.println("Podaj współrzędną Y: ");
                            wspY = sc.nextDouble();
                            if(!t.add(new Kolo(bokA, wspX, wspY)))
                                throw new WyjatekIstnienia();
                        }
                        catch(InputMismatchException e)
                        {
                            System.out.println("Wprowadziles zle dane!(litere zamiast liczby)");
                            sc.nextLine();
                        }
                        catch(WyjatekBoku e)
                        {
                            System.out.println("Bok musi być większy od 0!");
                            sc.nextLine();
                        }
                        catch(WyjatekIstnienia e)
                        {
                            System.out.println("Istnieje już taki obiekt!");
                        }
                        break;
                    case 2:
                        System.out.println("Podaj bok Kwadratu: ");
                        bokA = sc.nextDouble();
                        System.out.println("Podaj współrzędną X: ");
                        wspX = sc.nextDouble();
                        System.out.println("Podaj współrzędną Y: ");
                        wspY = sc.nextDouble();
                        t.add(new Kwadrat(bokA, wspX, wspY));
                        break;
                    case 3:
                        System.out.println("Podaj bok A prostokąta: ");
                        bokA = sc.nextDouble();
                        System.out.println("Podaj bok B prostokąta: ");
                        bokB = sc.nextDouble();
                        System.out.println("Podaj współrzędną X: ");
                        wspX = sc.nextDouble();
                        System.out.println("Podaj współrzędną Y: ");
                        wspY = sc.nextDouble();
                        t.add(new Prostokat(bokA, bokB, wspX, wspY));
                        break;
                    default:
                        end = true;
                        break;
                }
                if(end)
                    break;
            }while(true);

        for(Figura f : t)
        {
            System.out.println(f.getPozycjaX());
        }

    }
}
