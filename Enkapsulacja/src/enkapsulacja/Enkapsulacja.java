package enkapsulacja;

public class Enkapsulacja {

    public static void main(String[] args) 
    {
        KontoBankowe oszczednosciowe = new KontoBankowe();
        
        oszczednosciowe.wplata(5000);
        
        if (oszczednosciowe.wyplata(4))
        {
            System.out.println("wyplacono");
        }
        else
            System.out.println("Brak środków");
        
        System.out.println(oszczednosciowe.getSaldo());
    }
    
}

class KontoBankowe
{
    public KontoBankowe()
    {
        saldo = 1000;
    }
    
    private int saldo;
    
    int getSaldo()
    {
        return saldo;
    }
    
    boolean setSaldo(int saldo)
    {
        /*WARUNKI
        
        */
        this.saldo = saldo;
        
        return true;
    }
    
    boolean wyplata(int ile)
    {
        if (saldo < ile)
        {
            return false;
        }
        else
            setSaldo(saldo - ile);
        
        return true;
    }
    
    boolean wplata(int ile)
    {
        setSaldo(saldo + ile);
        return true;
    }
}
