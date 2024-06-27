// alg ve prg final sorusu
package javaapplication104;
import java.util.Scanner;
public class JavaApplication104 {
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
        System.out.print("a ve b sayılarını girin:");
        int a = klavye.nextInt();
        int b = klavye.nextInt();
        double sonuc = Math.log10(b)/Math.log10(a);
        System.out.println("sonuç: "+sonuc);
    }
    
}
