
package javaapplication101;
import java.util.Scanner;
public class JavaApplication101 {
    public static void main(String[] args) {
     Scanner klavye = new Scanner(System.in);
   int sayi =(int)(Math.random()*101);
        int tahmin =-1;
        while(tahmin != sayi){
            System.out.println("Tahmin ediniz: ");
            tahmin =klavye.nextInt();
            if(tahmin== sayi){
                System.out.println("evet sayı : "+ sayi);
                
            }
            else if(tahmin>sayi)
                System.out.println("tahmininiz yüksek");
            else
                System.out.println("tahmininiz  düşük");
        
        }
        
    }
    
}
