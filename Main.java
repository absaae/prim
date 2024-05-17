import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

  public static void main(String[] args) {
    // Número de vértices en el grafo
    int n = 5;
    // Variable para almacenar el peso total del árbol de expansión mínima (APM)
    int pesoTotal = 0;
    // Crea un nuevo grafo con n vértices
    Grafo g = new Grafo(n);
    // Lista para almacenar las aristas del APM
    List<Edge> apm = new ArrayList<>();

    // Agrega aristas al grafo con sus respectivos pesos
    g.addEdge(0, 1, 3);
    g.addEdge(0, 4, 5);
    g.addEdge(1, 2, 2);
    g.addEdge(1, 3, 7);
    g.addEdge(1, 4, 1);
    g.addEdge(2, 3, 3);
    g.addEdge(3, 4, 2);

    // Imprime la representación del grafo (lista de aristas y pesos)
    System.out.println("Representación del Grafo:");
    System.out.println(g.grafoToString());

    // Encuentra el APM del grafo utilizando el algoritmo de Prim
    apm = g.PrimEdgeHeap();

    // Imprime las aristas del APM y calcula el peso total
    System.out.println("\nAristas del Árbol de Expansión Mínima (APM):");
    for (Edge e : apm) {
      System.out.println(e.edgeToString());
      pesoTotal += e.peso;
    }

    // Imprime el peso total del APM
    System.out.println("\nPeso Total del APM: \t" + pesoTotal);
  }
}
