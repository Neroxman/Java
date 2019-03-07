package konstruktory;

public class Konstruktory 
{
    
    public static void main(String[] args) 
    {
        
        Punkt p = new Punkt(10, 15);
        
        
        System.out.println("p.x " + p.x);
        System.out.println("p.x " + p.y);
    }
    
}

class Punkt
{
    Punkt()
    {
        System.out.println("Wywołano konstruktor domyślny");  
        x = 5;
        y = 10;
    }
    
    Punkt(int pierwszy, int drugi)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        x = pierwszy;
        y = drugi;
    }
  
    int x;
    int y;
}
