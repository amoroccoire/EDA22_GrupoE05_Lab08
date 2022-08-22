public class Lista <T, U>{
	
	Node<T, U> root;
	int contador;
	//Node<T, U> puntero2;//solo para el metodo add(T e)
	
	public Lista() {
		contador = 0;
		root = null;
	}
	
	public int size() {
		return contador;
	}
	
	public void add(T elemento, U peso) { //para añadir al final
		
		Node<T, U> nodo = new Node<T, U>(elemento, peso);
		
		if (root == null)
			root = nodo;
		
		else {
			Node<T, U> puntero = root;
			
			while(puntero.getNextNode() != null)
				puntero = puntero.getNextNode();
			
			puntero.setNextNode(nodo);
		}
		contador++;
	}
	
	public void add(int indice, T elemento, U peso) {
		
		if (root == null || indice < 0 || indice > contador - 1)
			System.out.println("Indice inexistente");
		
		else if (indice == 0){
			Node<T, U> nodo = new Node<T, U>(elemento, peso);
			nodo.setNextNode(root);
			root = nodo;
			contador++;
		}
		else if(indice == contador - 1)
			add(elemento, peso);
		
		else {
			Node<T, U> nodo = new Node<T, U>(elemento, peso);
			Node<T, U> puntero = root;
			
			for (int i = 0; i < indice - 1; i++)
				puntero = puntero.getNextNode();
			
			Node<T, U> auxiliar = puntero.getNextNode();
			puntero.setNextNode(nodo);
			nodo.setNextNode(auxiliar);	
			
			contador++;
		}
	}
	
	public Node<T, U> get(int indice) {
		
		Node<T, U> puntero = root;
		if (root == null || indice < 0 || indice > contador - 1)
			puntero = null;
		
		else{
			for (int i = 0; i < indice; i++)
				puntero = puntero.getNextNode();
		}		
		return puntero;

	}
	
	public void remove(int indice) {
		
		if (root == null || indice < 0 || indice > contador - 1)
			System.out.println("La lista esta vacia");
		
		else {
			Node<T, U> puntero = root;
		
			for (int i = 0; i < indice - 1; i++)
				puntero = puntero.getNextNode();
			
			Node<T, U> auxiliar = puntero.getNextNode().getNextNode();
			puntero.getNextNode().setNextNode(null);
		
			puntero.setNextNode(auxiliar);
		
			contador--;
		}
	}
	
	public String toString() {
		
		Node<T, U> puntero = root;
		String cadena = "";
		for (int i = 0; i < contador; i++) {
			cadena += puntero.getDato() + "\n";
			puntero = puntero.getNextNode();
		}
		
		return cadena;
	}
	
}