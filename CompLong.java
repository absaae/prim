import java.util.Comparator;

public class CompLong implements Comparator<Edge> {

  // Implementa la interfaz Comparator para ordenar objetos Edge por su peso
  @Override
  public int compare(Edge e1, Edge e2) {
    // Utiliza el método Integer.compare() para comparar los pesos de las aristas e1 y e2
    // Devuelve un valor negativo si e1.peso < e2.peso, 0 si son iguales y positivo si e1.peso > e2.peso
    return Integer.compare(e1.peso, e2.peso);
  }
}
