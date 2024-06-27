
package javaapplication109;
import java.util.Scanner;
public class JavaApplication109 {
    public static void main(String[] args) {
       double [] sira ={1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};
       int enbInd ,n = sira.length; double enb,temp;
       for(int i=0; i<n; i++){
           enb = sira[i];
           enbInd=i;
           for(int j=i; j<n; j++){
               if (sira[j]>= enb){
                   enb =sira[j];
                   enbInd= j;
                   
               }
           }
           temp = sira[i];
           sira[i]= sira[enbInd];
           sira[enbInd] = temp;
           
       }
       for (int i=0; i<n;i++)
           System.out.print(sira[i]+" ");
           
    }
    
}
