package programowanieobiektowe;

public class ProgramowanieObiektowe 
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
    
    Punkt(int x, int y)
    {
        System.out.println("Wywołano konstruktor z dwoma parametrami");
        this.x = x;
        this.y = y;
        
    }
   
    int x;
    int y;
}
