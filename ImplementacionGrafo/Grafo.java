public class Grafo<T, N> {

    private int[] distancia;
	//para dfs
	private int[] d; //tiempo

    private NodoGrafo[] nodos;

    public Grafo(int elementos) {
		nodos = new NodoGrafo[elementos];
		distancia = new int[elementos];
	}

    public NodoGrafo[] getNodos() {
		return nodos;
	}

    public void add(T valor, N peso, int indice) {
		if (nodos[indice] == null)
			nodos[indice] = new NodoGrafo<T, N>();
		nodos[indice].agregarAdyacente(valor, peso);
	}
}