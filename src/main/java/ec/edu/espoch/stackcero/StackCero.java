/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.stackcero;

import ec.edu.espoch.stackcero.clases.Stack;

/**
 *
 * @author Pedro
 */
public class StackCero {

    public static void main(String[] args) {
        Stack pila = new Stack();

        // Agregar elementos a la pila
        pila.push(10);
        pila.push(20);
        pila.push(30);

        // Mostrar el elemento en la cima de la pila
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println("Elemento en la cima: " + pila.peek()); // Debe mostrar 30

        // Remover el elemento de la cima
        System.out.println("Elemento removido: " + pila.pop()); // Debe remover 30

        // Mostrar el nuevo elemento en la cima después de pop
        System.out.println("Elemento en la cima después de pop: " + pila.peek()); // Debe mostrar 20

        // Verificar el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pila.getTamaño()); // Debe mostrar 2

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía?: " + pila.isEmpty());
        
        pila.mostrarElementos();
    }
}
