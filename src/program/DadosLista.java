package program;


import java.util.ArrayList;
import java.util.List;

public class DadosLista <T> {
    private int quantidade;
    private String tipoDeDados;
    
    List<T> dados = new ArrayList<>();

    public void add(T valor)
    {
        dados.add(valor);
        
    }
    public String print(){
        String println ="";
        
        for(int a = 0 ; a < dados.size() ; a++)
        {
            
            if(a == 0){
                println = "[ "+dados.get(a).toString();
                
            }
            else if(dados.size()-1 ==  a) {
             println += " , "+dados.get(a).toString()+" ]";
            } 
            
            else{
                println += " , "+dados.get(a).toString();
            
            
            }
            
        
        }
        
        return println;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipoDeDados() {
        return tipoDeDados;
    }

    public void setTipoDeDados(String tipoDeDados) {
        this.tipoDeDados = tipoDeDados;
    }
    
    
}
