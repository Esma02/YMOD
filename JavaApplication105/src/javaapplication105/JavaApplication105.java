//alg ve prg final sorusu
package javaapplication105;
import java.util.Scanner;
public class JavaApplication105 {
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
        System.out.print("dizi boyutunu giriniz:");
        int n = klavye.nextInt();
        int[]sayilar = new int[n];
        sayilar[0]=0;
       sayilar[1]=1;
       for(int i=2; i<n; i++)
           sayilar[i] = sayilar[i-1]+sayilar[i-2];
       for(int i=0;i<n; i++)
           System.out.print(sayilar[i]+" ");
           
    }
    
}
