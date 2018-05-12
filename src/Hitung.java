
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author QQ
 */
public class Hitung {

    public static void dectohex() {
        Scanner input = new Scanner( System.in );
     System.out.print("Decimal : ");
     int num =input.nextInt();
        
   
     int rem;
        
   
     String str2=""; 
 
 
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
 
     while(num>0)
     {
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
     System.out.println("hexadecimal: "+str2);
    }
    public static void array(){
//        Scanner masuk = new Scanner(System.in);
        int nilai[] = new int[100];
//        System.out.println("Masuka 5 buah data nilai ");
        for(int i = 0;i<100;i++ ){
            nilai[i] = (i+1)*(i+1);
        
            System.out.println("Kuadrat " +(i+1)+" = " +nilai[i]);
//        nilai[i]=masuk.nextFloat();
        
//        System.out.println("Data nlai Yang dimasukan");
           
//            System.out.println(nilai[i]);
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dectohex();
//        Hitung converter = new Hitung();
//            Hitung.dectohex(12);
      
//                array();
                
                }
    
}
