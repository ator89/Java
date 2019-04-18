/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majora;

/**
 *
 * @author angel
 */
public class Majora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("agregado con éxito");
        Lista lista = new Lista();
        System.out.println("agregado con éxito");
        Persona p1 = new Persona("Angel", "Angel");
        Persona p2 = new Persona("Torres","Torres");
        
        lista.addUser(p1);
        System.out.println("agregado con éxito");
        lista.addUser(p2);
        
        lista.print();
    }
    
}
