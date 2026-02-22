import java.util.ArrayList;
import java.util.List;

public class GrafoMatriz {

    private int[][] matriz;
    private List<String> vertices;
     
public GrafoMatriz(int tamaño) {
    matriz = new int[tamaño][tamaño];
    vertices = new ArrayList<>();


}
  public void agregarVertice(String v){
    vertices.add(v);

  }
  public void agregarArista(String v1,String v2){
    int i = vertices.indexOf(v1);
    int j = vertices.indexOf(v2);
    if (i != -1 && j != -1){
        matriz[i][j] = 1;
        matriz[j][i] = 1;
    } else {
        System.out.println("uno de lo vertices no existe"); 
        
    }
  
  }
public void mostrarmatriz(){
System.out.println("matriz aydacente:");

for( int i = 0; i <matriz.length;i++) {
    for(int j = 0; j<matriz.length;j++  ){
       System.out.print(matriz [i][j] + "" );
    }
    System.out.println();
}
}
public static void main (String [] arg) {
    GrafoMatriz grafo = new GrafoMatriz(4);

    grafo.agregarVertice("A");
    grafo.agregarVertice("B");
    grafo.agregarVertice("C");
    grafo.agregarVertice("D");

    grafo.agregarArista("A", "B");
    grafo.agregarArista("B", "C");
    grafo.agregarArista("C", "D");
    grafo.agregarArista("D", "A");

    grafo.mostrarmatriz();
   

}
}