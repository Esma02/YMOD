
package javaapplication114;
import java.util.Scanner;
public class JavaApplication114 {
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);
        float a,b,c,x;
        System.out.println("a katsayısı: ");
        a = klavye.nextFloat();
        System.out.println("b katsayısı: ");
        b = klavye.nextFloat();
        System.out.println("c katsayısı: ");
        c = klavye.nextFloat();
        x=(c-b)/a;
        System.out.printf("\n%.2fx+%.2f=%.2f denkleminin kökü: %.3f",a,b,c,x);
    }
    
}
