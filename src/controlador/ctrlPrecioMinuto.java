/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import modelo.PrecioMinuto;
import modelo.Vehiculos;



public class ctrlPrecioMinuto {
    private Calendar fecha;
    private Vehiculos vehiculo;
    private PrecioMinuto precio;
    
    public ctrlPrecioMinuto(){
        
    }
    
    public float calcularValor(Vehiculos vehiculo, float valorMinuto){        
        float valor;        
        valor=vehiculo.getFechaEntrada().get(Calendar.MINUTE)-vehiculo.getFechaSalida().get(Calendar.MINUTE);
        valor=valor*valorMinuto;
        return valor;
    } 
    
   /* public void ctrlPrecioMinuto(){
        boolean bandera=true;
        Scanner scan=new Scanner(System.in);              
        System.out.println("1)entrada\n"+"2)salida\n"+"3)pagar");
        
        while(bandera==true){
            switch(scan.nextInt()){
                case 1:                    
                    entrada.setTime(new Date());
                    System.out.println("fecha entrada:"+" "+entrada.getTime());                    
                    break;
                case 2:
                    salida.setTime(new Date());
                    System.out.println("fecha salida:"+" "+salida.getTime());
                    break;
                case 3:
                    int me=(entrada.getTime().getHours()*60)+entrada.getTime().getMinutes();
                    int ms=(salida.getTime().getHours()*60)+salida.getTime().getMinutes();                    
                    precio.setTiempo((me-ms)*-1);
                    
                    System.out.println("minutos: "+" "+precio.getTiempo());
                    System.out.println("Valor servicio: "+precio.getTiempo()*precio.getValorMinutoCarro()+"$");
                    break;
            }//2 horas
        }
    }*/
}
