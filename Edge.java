public class Edge {
	// Vértice origen de la arista
	public int origen;
	// Vértice destino de la arista
	public int destino;
	// Peso de la arista
	public int peso;
  
	// Constructor por defecto que inicializa la arista con valores predeterminados
	// (origen y destino como -1, peso como el valor máximo de entero)
	public Edge() {
	  this.origen = -1;
	  this.destino = -1;
	  this.peso = Integer.MAX_VALUE;
	}
  
	// Constructor que inicializa la arista con los valores especificados
	public Edge(int u, int v, int w) {
	  this.origen = u;
	  this.destino = v;
	  this.peso = w;
	}
  
	// Devuelve una cadena que representa la arista, incluyendo origen, destino y peso
	public String edgeToString() {
	  return "(" + origen + ", " + destino + ") : " + peso;
	}
  
	// Método que tal vez no sea necesario (destinoToString() no se usa en el código actual)
	// Devuelve una cadena que representa solo el vértice destino
	public String destinoToString() {
	  return ("" + destino);
	}
  }
  