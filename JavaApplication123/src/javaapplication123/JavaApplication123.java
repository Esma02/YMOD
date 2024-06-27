
package javaapplication123;
import java.util.Scanner;
public class JavaApplication123 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
    /*NewClass hesap1 = new NewClass();
    hesap1.sayi1 = 10;
    hesap1.sayi2 = 20;
        System.out.println(hesap1.sayi2);
        NewClass hesap2 = new NewClass();
        hesap2.sayi1 = 20;
        System.out.println(hesap2.sayi1);*/
        /*NewClass hesap3 = new NewClass();
        System.out.println("1. sayiyi giriniz:");
        int a = klavye.nextInt();
        System.out.println("2. sayiyi giriniz:");
        int b = klavye.nextInt();
        hesap3.böl = a/b;
        System.out.println("bölme: "+hesap3.böl);
        hesap3.carp = a*b;
        System.out.println("çarpma: "+hesap3.carp);
        hesap3.top = a+b;
        System.out.println("toplama: "+hesap3.top);
        hesap3.cik = a-b;
        System.out.println("çıkarma: "+hesap3.cik);*/
        Araba a = new Araba();
        //a.model= Corolla;
        //a.marka = Toyota;
        a.motorHacim = 4.2;
        //a.renk = Beyaz;
        kisi mert = new kisi();
        mert.dogumTarihi = 1997;
        System.out.println("mert şuan "+mert.yas()+" yasinda");
    }
    
}
