import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Grafo {
  // El número de vértices (nodos) en el grafo
  public int n;
  // Lista de objetos Edge que representan las conexiones entre vértices
  public List<Edge> edges;

  // Constructor para inicializar un nuevo Grafo
  public Grafo(int n) {
    this.n = n;
    this.edges = new ArrayList<>();
  }

  // Agrega una nueva arista con peso w del vértice u al vértice v
  public void addEdge(int u, int v, int w) {
    this.edges.add(new Edge(u, v, w));
  }

  // Devuelve una cadena que representa el grafo, listando todas las aristas y sus pesos
  public String grafoToString() {
    String resultado = ""; // Cadena para almacenar la representación del grafo

    for (Edge e : edges) {
      resultado += e.edgeToString() + "\n";
    }

    return resultado;
  }

  // Implementa el algoritmo de Prim para encontrar el árbol de expansión mínima (MST) del grafo
  // utilizando una cola de prioridad (edgeHeap) para seleccionar eficientemente
  // la arista con el peso mínimo en cada paso. Mantiene una lista de vértices visitados
  // (visitados) para evitar ciclos.
  // Complejidad temporal: O(m log m)
  public List<Edge> PrimEdgeHeap() {
    List<Edge> arbol = new ArrayList<>(); // Lista para almacenar las aristas del MST
    PriorityQueue<Edge> edgeHeap = new PriorityQueue<>(new CompLong()); // Cola de prioridad para ordenar aristas por peso
    int[] visitados = new int[n]; // Arreglo para marcar vértices visitados (0: no visitado, 1: visitado)

    // Agregar todas las aristas a la cola de prioridad
    for (Edge e : edges) {
      edgeHeap.add(e);
    }

    while (!edgeHeap.isEmpty() && arbol.size() < n - 1) {
      Edge siguiente = edgeHeap.poll(); // Extraer la arista con el peso mínimo

      // Si alguno de los vértices de la arista no ha sido visitado, agregar la arista al MST y marcar vértices como visitados
      if (visitados[siguiente.origen] < 1 || visitados[siguiente.destino] < 1) {
        arbol.add(siguiente);
        visitados[siguiente.origen] = 1;
        visitados[siguiente.destino] = 1;
      }
    }

    return arbol;
  }
}
