
package ec.edu.espoch.stackcero.clases;

public class Nodo {
    int dato; // Variable que almacenará un valor entero
    Nodo siguiente; // Referencia al siguiente nodo en la estructura

    // Constructor que recibe un entero como dato
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Método para obtener el dato
    public int getDato() {
        return dato;
    }

}
