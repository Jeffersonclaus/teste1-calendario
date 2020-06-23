/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author root
 */
public class LocalDate {
    
    
    public static void main (String []args){
    

  LocalDate hoje = LocalDate.main(args)//

        System.out.println("LocalDate antes de formatar: " + hoje);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String hojeFormatado = hoje.format(formatter);

        System.out.println("LocalDate depois de formatar: " + hojeFormatado);

        //Obtém LocalDateTime de agora
        LocalDateTime agora = LocalDateTime.now();

        System.out.println("LocalDateTime antes de formatar: " + agora);

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String agoraFormatado = agora.format(formatter);

        System.out.println("LocalDateTime depois de formatar: " + agoraFormata;
    
    
    }

   
}
