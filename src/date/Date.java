/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;




/**
 *
 * @author root
 */
public class Date {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Random r = new Random();
      //  Scanner sc = new Scanner(System.in);
         int[] idades = new int[10];
    for (int i = 0; i < 10; i++) {
        idades[i] = r.nextInt(100);
    }
    for (int i = 0; i < 10; i++) {
        System.out.println(idades[i]);
    }

        
        
        
        
        Calendar calen = Calendar.getInstance();
        int hora = calen.get(Calendar.HOUR_OF_DAY);
       
        if (hora > 6 && hora < 12){
                       
            System.out.println("Bom dia!!!");
        } if ( hora > 12 && hora < 18  ){
        
            System.out.println("BOA TARDE!!!");
            
        } else{
        
        System.out.println(" BOA NOITE");
        }
        
        
        Calendar cal = Calendar.getInstance();
        
        java.util.Date date = cal.getTime();// data atual
        
            
        SimpleDateFormat z = new SimpleDateFormat("dd/MM/YYY");
   
        System.out.println("FORMATADO COMO QUISER "+z.format(date));
        
        

        
       DateFormat f = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println("PADRAO "+ f.format(date));
        
        f= DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("DATA CURTA " + f.format(date));
        f = DateFormat.getDateInstance(DateFormat.LONG);
        
        System.out.println("DATA LONGA escrita " + f.format(date));
        
        f = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("DATA FULL " + f.format(date));
        
        
        
        
        
        
    }

   

    
    
}
