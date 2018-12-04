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
public class Entrenador extends Plantilla {
    //Atributos
    private String idFederacion;
    //Constructores

    public Entrenador(String idFederacion, int id, int edad, String nombre, String apellido) {
        super(id, edad, nombre, apellido);
        this.idFederacion = idFederacion;
    }
    //Métodos
    public void dirigirPartido(){
        
    }
    public void dirigirEntrenamiento(){
        
    }

    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Viaxa o entrenador");
    }
    
    //toString

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
    
}
