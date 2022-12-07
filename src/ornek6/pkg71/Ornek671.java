
package ornek6.pkg71;

import java.util.Scanner;


public class Ornek671 {

    
    public static void main(String[] args) {
       
        Scanner input =new Scanner(System.in);
        
        System.out.println("bir numara giriniz: ");
        int n =input.nextInt();
        
        int t =0;
        
        for(int i=0; i < n-1; i++){
            
            t+= 1/((2*i+1) * (2*i+2));
        
        }
        
        
        System.out.println("Ln degeri = "+t);
    }
    
}
