
package javaapplication107;
import java.util.Scanner;
public class JavaApplication107 {
    public static void main(String[] args) {
     int m=5,n=4;
        System.out.print("!!!!");
        for(int j=1; j<=n; j++)  
            System.out.print("!!!"+j);
        System.out.println();
        for(int j=1;j<=n+1; j++) 
            System.out.print("----");
        System.out.println();
        for(int i=1; i<=m; i++){
            System.out.print(i+">**");
            for(int j=1; j<=n; j++) 
                System.out.printf("-%d0%d",i,j);
        System.out.println();
                    }
        
    
    }
    
}
