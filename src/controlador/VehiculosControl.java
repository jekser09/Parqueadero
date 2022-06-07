/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modelo.Vehiculos;

/**
 *
 * @author JEKSER
 */
public class VehiculosControl {
    private Vehiculos vehiculo;
    private ArrayList<Vehiculos> listaVehiculos;
      
    public VehiculosControl(){        
        
    }
    
    public void listarVehiculo(String nombreDueño,int ccDueño,String tipoVehiculo,String placa,Calendar fechaEntrada){
        vehiculo=new Vehiculos(nombreDueño, ccDueño, tipoVehiculo, placa, fechaEntrada);
        listaVehiculos.add(vehiculo);
        JOptionPane.showMessageDialog(null,"Vehiculo Añadido","informacion",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Vehiculos buscarVehiculo(String placa){
        vehiculo=null;
        for(Vehiculos bVehiculo:listaVehiculos){
            if(bVehiculo.getPlaca().equals(placa)){
                vehiculo=bVehiculo;
            }
        }
        return vehiculo;
    }
    
    public void guardarArchivo(){
        
    }
}
