
package javaapplication113;
import java.util.Scanner;
public class JavaApplication113 {
    public static void main(String[] args) {
      Scanner klavye = new Scanner (System.in);
      double a,b,c;
        System.out.println("birinci kenar uzunluğunu giriniz:");
        a= klavye.nextDouble();
        System.out.println("ikinci kenar uzunluğunu giriniz:");
        b = klavye.nextDouble();
        c = Math.sqrt(Math.pow(b,2)+Math.pow(a,2));
        System.out.println("hipotenüs = "+ c);
        
    }
    
}
