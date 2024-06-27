//taş kağıt makas oyunu 1. sınıf alg ve prg final sorusu
package javaapplication106;
import java.util.Scanner;
public class JavaApplication106 {
    public static void main(String[] args) {
        String [] nesneler = {"tas", "kagit", "makas"};
        int prg = (int)(Math.random()*3);
        Scanner klavye = new Scanner(System.in);
        System.out.println("tas:0,kagit:1,makas:2 hangisi?");
        int a = klavye.nextInt();
        System.out.println("program: "+nesneler[prg]);
        System.out.println("sen: "+nesneler[a]);
        if((prg==0 && a==2) || (prg==1 && a==2)||(prg==2&&a==0))
            System.out.println("kazandınn!!");
        else if((prg==0&&a==2)||(prg==1&&a==0)||prg== 2 &&a==1 )
            System.out.println("kaybettin!!");
        else
            System.out.println("kazanan yok!!");
    
    }  
}
