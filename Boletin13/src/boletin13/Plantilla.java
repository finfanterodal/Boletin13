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
public class Plantilla {
    //Atributos
    private int id;
    private int edad;
    private String nombre;
    private String apellido;
   //Constructores

    public Plantilla() {
    }

    public Plantilla(int id, int edad, String nombre, String apellido) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   //Setters Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //Métodos
    public void concentrarse(){
        System.out.println("Concentrarse a selección");
    }
    public void viajar(){
         System.out.println("Viaxa a selección");
    }

    @Override
    public String toString() {
        return "Plantilla{" + "id=" + id + ", edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
