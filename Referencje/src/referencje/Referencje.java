package referencje;

public class Referencje 
{

    public static void main(String[] args) 
    {
       int a = 53;
       int b = a;
       
       b = 30;
       
       System.out.println(a);
       
       Test x = new Test(); // pod x nie znajduje sie żadna wartość zwykła, tylko ADRES
       
       Test y = x;  //przypisanie adresu
      
       y.a = 40;
       
       System.out.println(x.a);
       
       String imie = "Mateusz";
       String imie2 = imie;
       
       imie2 = "tralala";
       
       System.out.println(imie);
    }
}
    
    class Test
    {
        int a = 20;
    }