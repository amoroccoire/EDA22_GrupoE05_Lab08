public class Node <T, U> {

    private T dato;
    private U peso;
    private Node<T, U> nextNode;
  
    public Node(T e, U y) {
    	dato = e;
    	peso = y;
    }
    
    public T getDato() {
        return dato;
    }
    
    public void setDato(T dato) {
        this.dato = dato;
    }
    
    public U getPeso() {
    	return peso;
    }
    
    public void setPeso(U peso) {
    	this.peso = peso;
    }
    
    public Node<T, U> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node<T, U> nextNode) {
        this.nextNode = nextNode;
    }
}