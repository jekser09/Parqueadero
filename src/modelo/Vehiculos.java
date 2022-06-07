/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author JEKSER
 */
public class Vehiculos {
    private String nombreDueño;
    private int ccDueño;
    private String tipoVehiculo;
    private String placa;
    private Calendar fechaEntrada;
    private Calendar fechaSalida;
    
   public Vehiculos(String nombreDueño,int ccDueño,String tipoVehiculo, String placa,Calendar fechaEntrada){
       this.nombreDueño=nombreDueño;
       this.ccDueño=ccDueño;
       this.tipoVehiculo=tipoVehiculo;
       this.placa=placa;
       this.fechaEntrada=fechaEntrada;
   }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public int getCcDueño() {
        return ccDueño;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
   

}
