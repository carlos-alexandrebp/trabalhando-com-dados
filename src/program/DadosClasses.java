package program;

import java.util.ArrayList;
import java.util.List;

public class DadosClasses {
     
    private int quantidade;
    
    private String tipoDeDados;
    
    List<Produtos> dados = new ArrayList<>();
    

    public void add(Produtos valor)
    {
        dados.add(valor);
    }
    
    public String print(){
        
        String println ="";
        
        for(int a = 0 ; a < dados.size() ; a++)
        {
            
            if(a == 0){
                println = "[ "+dados.get(a).getNome()+" | "+ dados.get(a).getValor();
                
            }
            else if(dados.size()-1 ==  a) {
             println += " , "+dados.get(a).getNome()+" | "+ dados.get(a).getValor()+" ]";
            } 
            
            else{
                println += " , "+dados.get(a).getNome()+" | "+ dados.get(a).getValor();
            
            
            }
            
        
        }
        max(dados);
        
        return println;
    }
    public void max(List<Produtos> lista){
        
        if(lista.isEmpty()){
            throw new IllegalStateException("A lista e nula");
        }
        double conferente = 0;
        int indice = 0;
         
        for(Produtos item : lista){
            if(item.getValor() > conferente)
                conferente = item.getValor();
            indice = lista.indexOf(item);

        }
        
        System.out.print("Maior Da lista e : "+lista.get(indice).getNome()+""
                + " "+lista.get(indice).getValor());
    
    
       
    }
    
}













