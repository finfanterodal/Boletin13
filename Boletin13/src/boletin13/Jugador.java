/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author finfanterodal
 */
public class Jugador extends Plantilla {
    //Atributos
    private int dorsal;
    private String demarcacion;
    //Constructor

    public Jugador(int dorsal, String demarcacion, int id, int edad, String nombre, String apellido) {
        super(id, edad, nombre, apellido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    //Métodos
    public void jugarPartido(){
        
    }
    public void entrenar(){
        
    }

    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Viaxan os xogadores");
    }
    
//toString
    @Override
    public String toString() {
        return "Jugador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    
}
