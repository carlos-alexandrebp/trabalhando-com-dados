package program;

import java.util.List;

public class ServicoMaxGenericsEmMetodos {
        public <T extends Comparable<T>> T max(List<T> list){
        
        if(list.isEmpty()){
            throw new IllegalStateException("A lista e nula");
        }
        T max  = list.get(0);
        for(T item : list){
            if(item.compareTo(max)>0){
            
                max = item;
            }
        
        }
        
    
       return max;
    }
    
}
