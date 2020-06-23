/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.TimeZone;




/**
 *
 * @author root
 */
public class Calendario {

   
    
   public static void main (String []args){
       
      Calendar c = Calendar.getInstance();
        int horas = c.get(Calendar.SHORT_FORMAT);

        System.out.println("HORAS: " + horas);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
        
        
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss dd/MM/YYYY");
        SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss dd/MM/YYYY");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        
        java.util.Date x1 = new java.util.Date(); // data e hora atual
        java.util.Date x2 = new java.util.Date(System.currentTimeMillis());   
        java.util.Date x3 = new java.util.Date(0L);  
        java.util.Date x4 = new java.util.Date(1000L * 60L * 60L * 5L);  // 01/01/1970 as 5:00 da manha
        
     //   java.util.Date y1 =  sdf1.parse("23/03/2022"); 
      //  java.util.Date y2 = sdf2.parse("14:30:00 21/02/2013");
        java.util.Date y3 = java.util.Date.from(Instant.parse("2018-06-24T15:42:07Z"));








       
   }
    
}
