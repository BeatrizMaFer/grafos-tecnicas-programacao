import java.util.List;
import java.util.ArrayList;
public class Vertice {
    public int num;
    public List<Vertice> adj = new ArrayList<>();
    
    public void Vertice(int x){
        num = x;
    }
    
    public int getNum(){
        return num;  
        
    }
    
    public void adicionarAdj(List<Vertice> adjs){
        this.adj.addAll(adjs);
    }
    
    public List<Vertice> retornarAdj(){
        return this.adj;
    }
    
}
    
    
