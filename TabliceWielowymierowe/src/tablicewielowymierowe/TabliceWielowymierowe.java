package tablicewielowymierowe;

public class TabliceWielowymierowe {

    public static void main(String[] args) 
    {
        int[][] tab = new int[4][3];
        
        tab[0][0] = 25;
        tab[3][2] = 70;
        
        System.out.println(tab[3][2]);
        
      //  int[][] tab2 = new int [4][3];
        
        int tab2[][] =
        {
            {4,5,17},
            {8,5,14},
            {6,-5,199}
        };
        
        System.out.println(tab2[1][1]);     // drugi wiersz, druga kolumna
        
    }
    
}
