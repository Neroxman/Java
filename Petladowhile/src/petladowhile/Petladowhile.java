package petladowhile;

public class Petladowhile {

    public static void main(String[] args) 
    {
       String[] kursyProgramowania = 
       {
           "Java",
           "Java Aplikacje",
           "Java Strumienie",
           "Java Aspekty Zaawansowane",
           "Java Android",
           "C#",
           "C# Tworzenie aplikacji",
           "Pascal"
       };
       
       int i = 0;
       while(i < kursyProgramowania.length)     //wielkosc tablicy - dzięki czemu można dopisywać
       {
           System.out.println(kursyProgramowania[i]);
           i++;
       }
       
       int k = 0;
       do
       {
         System.out.println(kursyProgramowania[k]);
         k++;  
       }while(k < kursyProgramowania.length);
    
    
    int[] liczby = 
       {
           10,
           20,
           30,
           40,
           50,
           60,
           70,
           80,
           90,
           100 
       };
       
       int n = 0;
       while(n < liczby.length)     //wielkosc tablicy - dzięki czemu można dopisywać
       {
           System.out.println(liczby[n]);
           n++;
       }
    }
 }

