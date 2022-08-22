import java.util.LinkedList;

public class NodoGrafo<T, N> {

	private NodoGrafo<T, N> padre;
	private boolean estado;
	private Lista<T, N> lista;
	
	public NodoGrafo() {
		estado = false;
		lista = new Lista<T, N>();
		padre = null;
	}
	
	public void setPadre(NodoGrafo<T, N> padre) {
		this.padre = padre;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void marcar() {
		estado = true;
	}
	
	public void desmarcar() {
		estado = false;
	}
	
	public void agregarAdyacente(T valor, N peso) {
		lista.add(valor, peso);
	}
	
	public Lista<T, N> getLista(){
		return lista;
	}
}