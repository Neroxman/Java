package zadania;
import java.util.Scanner;

public class Zadania 
{

    public static void main(String[] args) 
    {
//       Scanner input = new Scanner(System.in);
      
//       System.out.println("Podaj słowo: ");
//       String word = input.next();
//       
//       Words result = new Words();
//       System.out.println("Liczba liter w wyrazie " + word + " wynosi: " + result.letters(word));
        
        Samples a = new Samples();
        a.age();
    }
}

class Samples
{
    void age()
    {
        System.out.println("Wiek: 22");
    }
    
    void name()
    {
        System.out.println("Imie: Mateusz");
    }
    
    void math(int a, int b)
    {
        
    }
    
}

 class Words
    {
        int letters(String how)
        {
           return how.length();
        }
    }
