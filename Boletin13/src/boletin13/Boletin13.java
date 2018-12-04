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
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Instanciamos un objeto de cada clase
    Plantilla plantilla1=new Plantilla();
    Entrenador entrenador1=new Entrenador("d323",32,41,"Fran","Infnate");
    Jugador jugador1=new Jugador(14,"delantero",43,24,"Fran","Infante");
    Masajista masajista1=new Masajista("Fisioterapia",32,43,34,"Fran","Infante");
    //Chamamos ao método concentrarse() desde cada obxecto e vemos que todos poden acceder a el e mostran o mesmo.
    plantilla1.concentrarse();
    jugador1.concentrarse();
    entrenador1.concentrarse();
    masajista1.concentrarse();
    /*Chamamos ao método viajar() desde todos os obxectos e vemos que en el de la superclase,
    solo nos muestra la primera frase, y en el resto aparte de esta una frase a mayores.*/
    jugador1.viajar();
    masajista1.viajar();
    entrenador1.viajar();
    plantilla1.viajar();
    /*Si que podemos utilizar un método de la superclase desde la subclase*/
    System.out.println(jugador1.getEdad());
    /*Desde la superclase no podemos utilizar los métodos de las subclases*/
    
    }
    
}
