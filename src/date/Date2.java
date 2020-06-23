/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author root
 */
public class Date2 {

    public static void main(String[] args) throws ParseException {

       Calendar c = Calendar.getInstance();
        int horas = c.get(Calendar.HOUR_OF_DAY);

        System.out.println("HORAS: " + horas);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss dd/MM/YYYY");
        SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm:ss dd/MM/YYYY");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
        
        
        Date x1 = new Date(); // data e hora atual
        Date x2 = new Date(System.currentTimeMillis());   
        Date x3 = new Date(0L);  
        Date x4 = new Date(1000L * 60L * 60L * 5L);  // 01/01/1970 as 5:00 da manha
        
        Date y1 =  sdf1.parse("23/03/2022"); 
        Date y2 = sdf2.parse("14:30:00 21/02/2013");
        Date y3 = Date.from(Instant.parse("2018-06-24T15:42:07Z"));
        
        
        
        
        
        
         System.out.println("----- FORMATADO COM FORMAT(GMT) SDF3-----------");
        System.out.println("X1- Data atual " + sdf3.format(x1));
        System.out.println("X2- Data atual currentTimeMillis " + sdf3.format(x2));
        System.out.println("X3- Começo sistema " + sdf3.format(x3));
        System.out.println("X3- Calcular data " + sdf3.format(x4));
         System.out.println("y1:  "+ sdf3.format(y1)); 
        System.out.println("y4: "+ sdf3.format(y2)); 
        System.out.println("Y3: Padrao UTC - "+ sdf3.format(y3));
       
        
        System.out.println("----- FORMATADO COM FORMAT SDF2-----------");
        System.out.println("X1- Data atual " + sdf2.format(x1));
        System.out.println("X2- Data atual currentTimeMillis " + sdf2.format(x2));
        System.out.println("X3- Começo sistema " + sdf2.format(x3));
        System.out.println("X4- Calcular data " + sdf2.format(x4));
         System.out.println("y1:  "+ sdf2.format(y1)); 
        System.out.println("y2: "+ sdf2.format(y2)); 
        System.out.println("Y3: Padrao UTC - "+ sdf2.format(y3));
       
        
        
        System.out.println("----- SEM FORMATO-----------");
        System.out.println("X1- Data atual " + x1);
        System.out.println("X2- Data atual currentTimeMillis " + x2);
        System.out.println("X3- Começo sistema " + x3);
        System.out.println("X4- Calcular data " + x4);
         System.out.println("y1:  "+ y1); 
        System.out.println("y2: "+ y2); 
        System.out.println("Y3: Padrao UTC - "+ y3);
       

        
        
        
        
        
        
        
        
        
        
        
        
       
    }
}
