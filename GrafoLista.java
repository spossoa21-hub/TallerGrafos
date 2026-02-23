import java.util.*;

public class GrafoLista {

    private HashMap<String, List<String>> grafo;


    public GrafoLista() {
        grafo = new HashMap<>();
    }


    public void agregarVertice(String v) {
        grafo.putIfAbsent(v, new ArrayList<>());
    }


    public void agregarArista(String v1, String v2) {
        grafo.get(v1).add(v2);
        grafo.get(v2).add(v1); 
    }

    public void mostrarGrafo() {
        for (String vertice : grafo.keySet()) {
            System.out.println(vertice + " -> " + grafo.get(vertice));
        }
    }


    public static void main(String[] args) {

        GrafoLista grafo = new GrafoLista();

        grafo.agregarVertice("A");
        grafo.agregarVertice("B");
        grafo.agregarVertice("C");
        grafo.agregarVertice("D");

        grafo.agregarArista("A", "B");
        grafo.agregarArista("A", "C");
        grafo.agregarArista("B", "D");

        grafo.mostrarGrafo();
    }
}
