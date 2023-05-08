import java.util.List;
import java.util.ArrayList;
public class Grafos
{
    private List<Vertice> vertices = new ArrayList<>();;
    

    public Vertice novoVertice(int x) {
        
        Vertice novoVertice = new Vertice();
        novoVertice.Vertice(x);
        vertices.add(novoVertice);
        return novoVertice;
    }
    
    public void listaAdjGrafo(){
        System.out.println("A lista de adjacência do grafo é: " );
        
        for (Vertice item1 : vertices){
            
            System.out.print(item1.num + "| " );
        
            for (Vertice item2 : item1.adj){
                
                System.out.print(item2.num +" ");
            }
            
            System.out.println("\n");
        }
        
    }
        
    
    
    
    public void adicionarAdj(Vertice v, List<Vertice> adjs){
        v.adicionarAdj(adjs);
    }
    
    
    public String retornarAdj(Vertice v){
        
        List<Vertice> adjs = v.retornarAdj();
        
        String result = "A lista de adjacentes de " + v.num + " é: ";
        for (Vertice item : adjs){
            result += item.num + " ";
        }
        if (adjs != null)
            return result;
        else return null;    
        
    }
    public int saoVizinhos(Vertice v1, Vertice v2) {
    for (Vertice item : v1.adj) {
        if (v2.equals(item)) {
            return 1;
        }
    }
    return 0;
}

    
    
}

