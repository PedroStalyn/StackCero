
package ec.edu.espoch.stackcero.clases;

public class Stack {
    private Nodo cima; // Representa la cima de la pila
    private int tamaño; // Almacena el tamaño de la pila
    
    public Stack() {
        this.cima = null;
        this.tamaño = 0;
    }

    // Método para agregar un elemento a la pila (push)
    public void push(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima; // El nuevo nodo apunta al anterior nodo de la cima
        cima = nuevoNodo; // La cima ahora es el nuevo nodo
        tamaño++;
    }

    // Método para remover el elemento de la cima de la pila (pop)
    public int pop() {
      /*  if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }*/     
        
        int dato = cima.getDato(); // Obtener el dato de la cima
        cima = cima.siguiente; // La cima ahora es el siguiente nodo
        tamaño--;
        return dato;
    }

    // Método para ver el elemento en la cima sin removerlo (peek)
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return cima.getDato();
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return cima == null;
    }

    // Método para obtener el tamaño de la pila
    public int getTamaño() {
        return tamaño;
    }
    
    public void mostrarElementos() {
    Nodo actual = cima; // Empezar desde la cima de la pila

    // Verificar si la pila está vacía
    if (actual == null) {
        System.out.println("La pila está vacía.");
        return;
    }
    // Recorrer la pila hasta llegar al final (null)
    System.out.println("Elementos en la pila:");
    while (actual != null) {
        System.out.println(actual.getDato()); // Imprimir el dato de cada nodo
        actual = actual.siguiente; // Moverse al siguiente nodo en la pila
    }
}

}
