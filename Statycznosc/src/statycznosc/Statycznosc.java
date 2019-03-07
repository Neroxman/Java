package statycznosc;

public class Statycznosc 
{
    public static void main(String[] args) 
    {
        double wynik = Matematyka.dodaj(10, 20);
        
        System.out.println(wynik);
        
        System.out.println(Matematyka.PI);
        
        Klient a = new Klient ("Mateusz");
        Klient b = new Klient ("Adam");
        Klient c = new Klient ("Paweł");
        
        System.out.println("");
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(c.id);
    }
    
}

class Matematyka
{
    static final double PI = 3.14;
    static double dodaj(double a, double b)
    {
        return a + b;
    }
    
}

class Klient
{
    Klient(String imie)
    {
        this.imie = imie;
        
        id = nastepnyID;
        nastepnyID++;
    }
    String imie;
    int id = 1;
    static int nastepnyID = 1;
    
}