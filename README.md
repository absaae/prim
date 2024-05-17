# prim

**1. Grafo.java**

Esta clase representa una estructura de datos llamada grafo. Un grafo se utiliza para modelar relaciones entre objetos, los cuales llamamos vértices. El grafo define dos elementos principales:

* `n`: Representa el número total de vértices en el grafo.
* `edges`: Es una lista que almacena objetos de tipo `Edge`. Cada objeto `Edge` representa una conexión (arista) entre dos vértices, incluyendo su peso.

La clase `Grafo` también cuenta con métodos para trabajar con los vértices y las aristas:

* `Grafo(int n)`: Este constructor inicializa un nuevo grafo con un número específico de vértices (`n`) y una lista vacía de aristas.
* `addEdge(int u, int v, int w)`: Este método permite agregar una nueva arista al grafo. La arista conecta el vértice `u` con el vértice `v` y tiene un peso `w` asociado (puede representar distancia, costo, etc.).
* `grafoToString()`: Este método devuelve una cadena que representa el contenido del grafo. La cadena lista todas las aristas existentes en el grafo, mostrando su origen, destino y peso.
* `PrimEdgeHeap()`: Este método implementa el algoritmo de Prim para encontrar el árbol de expansión mínima (MST) del grafo. El algoritmo de Prim permite encontrar un subconjunto de aristas que conecta todos los vértices del grafo con un peso total mínimo. 

**2. Edge.java**

Esta clase representa una arista (conexión) entre dos vértices en un grafo. Cada arista tiene tres propiedades:

* `origen`: Indica el vértice del cual parte la arista.
* `destino`: Indica el vértice al cual llega la arista.
* `peso`: Representa el peso asociado a la arista (puede representar distancia, costo, etc.).

La clase `Edge` también cuenta con métodos para obtener información de la arista:

* Constructores:
    * Constructor por defecto: Inicializa la arista con valores predeterminados (-1 para `origen` y `destino`, y `Integer.MAX_VALUE` para `peso`).
    * `Edge(int u, int v, int w)`: Permite inicializar la arista con valores específicos para el vértice origen (`u`), el vértice destino (`v`), y el peso (`w`).
* `edgeToString()`: Devuelve una cadena que representa la arista, incluyendo el origen, destino y peso.
* `destinoToString()`: (No se usa en el código actual) Devuelve una cadena con solo el vértice destino.

**3. CompLong.java**

Esta clase implementa un comparador personalizado para la cola de prioridad utilizada en el algoritmo de Prim. La cola de prioridad se utiliza para ordenar eficientemente las aristas según su peso. La clase `CompLong` implementa la interfaz `Comparator` para lograr dicha ordenación.

El método principal de esta clase es:

* `compare(Edge e1, Edge e2)`: Compara los pesos de dos aristas (`e1` y `e2`) utilizando el método `Integer.compare()`. Devuelve un valor negativo si el peso de `e1` es menor que el de `e2`, 0 si son iguales, y un valor positivo si el peso de `e1` es mayor.

**4. Main.java**

Esta clase es la encargada de demostrar cómo utilizar la clase `Grafo` y el algoritmo de Prim para encontrar el árbol de expansión mínima (MST) de un grafo. El código realiza los siguientes pasos:

* Define el número de vértices (`n`) en el grafo.
* Crea un nuevo objeto `Grafo`.
* Agrega aristas al grafo con sus respectivos pesos utilizando el método `addEdge()`.
* Imprime la representación en cadena del grafo utilizando el método `grafoToString()`.
* Encuentra el árbol de expansión mínima (MST) usando el método `PrimEdgeHeap()`.
* Itera a través de las aristas del MST, imprimiendo su representación en cadena y calculando el peso total del árbol.
* Por último, imprime el peso total del árbol de expansión mínima (MST).
