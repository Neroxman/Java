package breakcontinue;

public class Breakcontinue 
{

   
    public static void main(String[] args) 
    {
       /*
        1 2 3 4 5 6 7 8 9
        2 4 6 8 10 ...
        */
    
        for (int j = 1; j <= 10; j++)
        {
          
            for (int i = 1; i < 10; i++)
            {
                  if (i % 2 != 0)
                    continue;
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < 10; i++)
//        {
//            if (i % 2 != 0)
//                continue;
//           System.out.println(i);
//        }
        
    }
}
