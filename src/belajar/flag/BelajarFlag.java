
package belajar.flag;
import java.util.Scanner;


public class BelajarFlag {

    
    public static void main(String[] args) 
    {
        int number, i;
        int m=0;
         int flag=0;
        Scanner numScanner = new Scanner(System.in);
  
                System.out.println("Masukan Angka");
                number = numScanner.nextInt();
                m= number/2;
                for (i = 2; i <=m; i++)
                {
                    if (number % i ==0)
                    {
                         System.out.println("Ini Bukan Bilangan Prima");
                         flag= 1;
                         break;
                    }
                } 
                for (i=0; i>= number; i++)
                {
                    if(number ==0)
                    {
                        System.out.println("Ini Bukan Bilangan Prima");
                        flag =1;
                        break;
                    }
                }
                for(i=1; i>=number; i++)
                {
                    if(number ==1)
                    {
                        System.out.println("Ini Bukan Bilangan Prima");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    System.out.println("Ini Adalah Bilangan Prima");
                }
    }
       
}
