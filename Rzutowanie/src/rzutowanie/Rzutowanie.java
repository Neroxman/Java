package rzutowanie;

public class Rzutowanie {

   
    public static void main(String[] args) 
    {
        int a = 5, b = 2;
        double c = 12, d = 15;
        
        System.out.println((double)a / b);
        
        int wynik1 = a / (int)d;
        double wynik2 = c / d;
        
        System.out.println(wynik1);
    }
    
}
