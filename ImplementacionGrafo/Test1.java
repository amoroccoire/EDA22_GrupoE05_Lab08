import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Número de nodos del grafo: ");
		int numero = sc.nextInt();
		
		Grafo<Integer, Integer> grafo = new Grafo<Integer, Integer>(numero);
		
		for (int i = 0; i < numero; i++) {
			System.out.print("NODO: " + (i + 1) + "\nNumero de nodos adyacentes: ");
			int adyacentes = sc.nextInt();
			for (int j = 0; j < adyacentes; j++) {
				System.out.print("Adyacente: " + (j + 1) + "\nValor: ");
				int num = sc.nextInt();
				System.out.print("Peso: ");
				int peso = sc.nextInt();
				grafo.add(num, peso, i); 
			}	
		}
		
		System.out.print("Nodo Para iniciar Recorrido BFS: ");
		int value = sc.nextInt() - 1;
		
		System.out.println(grafo.BFS(value));
		
	}
}