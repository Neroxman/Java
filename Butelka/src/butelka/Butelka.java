package butelka;

public class Butelka 
{
    private double ileLitrow;
    
    Butelka(double ileLitrow)
    {
        this.ileLitrow = ileLitrow;         //konstruktor
    }
    
    double getIleLitrow()
    {
        return ileLitrow;
    }
    
    void wlej(double ilosc)
    {
        this.ileLitrow += ilosc;
    }
    
    boolean wylej(double ilosc)
    {
        if(ilosc < ileLitrow)
            this.ileLitrow -= ilosc;
        else
            return false;
        return true;
    }
    
    void przelej(double ilosc, Butelka gdzie)
    {
       if (this.wylej(ilosc))
            gdzie.wlej(ilosc);
       else
            System.out.println("Za mało");
    }
    
    public static void main(String[] args) 
    {
        Butelka[] butelka = new Butelka[3]; //NULL
        
        for(int i = 0; i <= 2; i++)
        {
            butelka[i] = new Butelka(i+1);
        }
        
        butelka[0].wlej(2);
        
        butelka[0].przelej(45, butelka[1]);
        
        for(int i = 0; i <= 2; i++)
        {
            System.out.println(butelka[i].getIleLitrow());
        }
    }
}
