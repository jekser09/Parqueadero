/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author JEKSER
 */
public class PrecioMinuto {
    private static float valorMinutoCarro;
    private static float valorMinutoMoto;
    private int tiempo;
    
    public PrecioMinuto(int tiempo){
              
    }   

    public static float getValorMinutoCarro() {
        return valorMinutoCarro;
    }

    public static void setValorMinutoCarro(float valorMinutoCarro) {
        PrecioMinuto.valorMinutoCarro = valorMinutoCarro;
    }

    public static float getValorMinutoMoto() {
        return valorMinutoMoto;
    }

    public static void setValorMinutoMoto(float valorMinutoMoto) {
        PrecioMinuto.valorMinutoMoto = valorMinutoMoto;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    
    
    
}
