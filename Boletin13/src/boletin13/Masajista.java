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
public class Masajista extends Plantilla {
    //Atributos
    private String titulacion;
    private int aniosExperiencia;
    //Constructor

    public Masajista(String titulacion, int aniosExperiencia, int id, int edad, String nombre, String apellido) {
        super(id, edad, nombre, apellido);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }
    //Métodos
    public void darMasaje(){
    
    }

    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Viaxa o masajista");
    }
    
       //toString

    @Override
    public String toString() {
        return "Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }
    
}
