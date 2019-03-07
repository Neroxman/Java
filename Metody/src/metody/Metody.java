package metody;

public class Metody 
{

    public static void main(String[] args) 
    {
       Test a = new Test();
       
       a.wypisz("Mateusz", "Brzezicki");
       
       double wynik = a.dodaj(10.9, 20);
        System.out.println(wynik);
    }   
}
class Test
{
    void wypisz(String imie, String nazwisko)
    {
        System.out.println(imie + " " + nazwisko);
    }
    
    int dodaj(int a, int b)
    {
        return a + b;
    }
    
    double dodaj(double a, double b)
    {
        return a + b;
    }
    
    
}