
import java.util.List;
import java.util.Arrays;

public class Main
{
    public static void saoVizinhosPrint(Vertice v1, Vertice v2, Grafos meuGrafo) {
        int result = meuGrafo.saoVizinhos(v1, v2);
        if (result == 1) 
            System.out.println(v1.num + " e " + v2.num + " sao vizinhos.");
        else 
            System.out.println(v1.num + " e " + v2.num + " nao sao vizinhos.");
        
    }
        
  public static void main (String[]args)
  {
    Grafos meuGrafo = new Grafos();
    
    // Criando os vértices
    Vertice v1 = meuGrafo.novoVertice(1);
    Vertice v2 = meuGrafo.novoVertice(2);
    Vertice v3 = meuGrafo.novoVertice(3);
    Vertice v4 = meuGrafo.novoVertice(4);
    Vertice v5 = meuGrafo.novoVertice(5);
    
    // Adicionando as adjacências
    
    List<Vertice> adj1 = Arrays.asList(v2, v5);
    meuGrafo.adicionarAdj(v1, adj1);
    
    List<Vertice> adj2 = Arrays.asList(v1, v5, v4, v3);
    meuGrafo.adicionarAdj(v2, adj2);

    
    List<Vertice> adj3 = Arrays.asList(v2, v4);
    meuGrafo.adicionarAdj(v3, adj3);
    
    
    List<Vertice> adj4 = Arrays.asList(v2, v5, v3);
    meuGrafo.adicionarAdj(v4, adj4);
    
    
    List<Vertice> adj5 = Arrays.asList(v4, v1, v2);
    meuGrafo.adicionarAdj(v5, adj5);
    
    
    // Retornar adjacencias
    System.out.println(meuGrafo.retornarAdj(v1));
      
    // Retornar se são vizinhos
    saoVizinhosPrint(v4, v5, meuGrafo);
    
    // Imprimir lista de adjacências do grafo 
    meuGrafo.listaAdjGrafo();
    
    // Imprimir matriz de adjacências do grafo
    meuGrafo.matrizAdj();
    
  }
}
