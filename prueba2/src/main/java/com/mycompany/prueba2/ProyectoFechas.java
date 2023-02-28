/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prueba2;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author Sergio
 */
public class ProyectoFechas {

    public static void main(String[] args) 
    {
//        Date hoy = new Date();
//        long InMilisegundos = hoy.getTime();
//        
//        java.sql.Date sqlDate = new java.sql.Date(InMilisegundos);
//        java.sql.Time sqlTime = new java.sql.Time(InMilisegundos);
//        
//        java.sql.Timestamp sqlTimestamp = new java.sql.Timestamp(InMilisegundos);
//        
//        System.out.println("util.Date " + hoy);
//        System.out.println("sql.Date " + sqlDate);
//        System.out.println("sql.Time " + sqlTime);
//        System.out.println("sql.Timestamp + " + sqlTimestamp);
        
        LocalDate fechaNac = LocalDate.of(1990,10,25);
        LocalDate diaHoy = LocalDate.now();
        
        System.out.println("La fecha actual es: " + LocalDate.now());
        System.out.println("La hora actual es: " + LocalTime.now());
        System.out.println("La fecha y hora actuales son: " + LocalDateTime.now());
        System.out.println("El instante actual es: " + Instant.now());
        System.out.println("La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now());
        
        System.out.println("Tu edad es de " + ChronoUnit.YEARS.between(fechaNac, diaHoy) / 365 + " años");
        
    }
}
