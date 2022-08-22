import java.util.LinkedList;
import java.util.Queue;

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

    public String BFS(int valor) {
        
        String orden = "";

        for (int i = 0; i < nodos.length; i++)
			distancia[i] = -1;

        nodos[valor].marcar();
        orden += (valor + 1) + " ";
		distancia[valor] = 0;

        Queue<Integer> cola = new LinkedList<Integer>();
		cola.add(valor);

        while (!cola.isEmpty()) {

            int indice = cola.poll();
			Lista<T, N> lista = nodos[indice].getLista();
			Node<T, N> puntero = lista.root;

            while (puntero != null) {
				
				T index = puntero.getDato();

				if (!nodos[(int) index - 1].getEstado()) {
					nodos[(int) index - 1].marcar();
                    orden += index + " ";
					distancia[(int) index - 1] += distancia[indice];
					nodos[(int) index - 1].setPadre(nodos[indice]); //establecer padre del nodo
					cola.add((int) index - 1);
				}
				puntero = puntero.getNextNode();
			}
        }
        return orden;
    }
}