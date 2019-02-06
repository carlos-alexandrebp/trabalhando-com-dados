
package program;

import java.util.Locale;
import java.util.Scanner;


public class RumProdutos {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        
        DadosClasses produtos = new DadosClasses();
        
        
        
        System.out.print("Digite inserir ou deletar produtos : ");
        String opcao = sc.next();
        opcao = opcao.toUpperCase();
        System.out.println("");
         int qnt = -1;
         
        switch(opcao){
            case "INSERIR" :
                System.out.print("Digite a quantidade de Produtos para inserir : ");
                System.out.println("");
               
                qnt = sc.nextInt();
                System.out.println(""); 
                
                while(qnt != 0){ 
                
                    System.out.print("Nome> ");
                    String name_ = scs.nextLine();
                    System.out.print("Preco> ");
                    Double preco_ = sc.nextDouble();
                    produtos.add(new Produtos(name_ , preco_));
                    qnt--;
                }
                    
                    
                System.out.println(produtos.print()); 
                
                
                    
                    break;
           
           
            case "DELETAR" :
                System.out.println("Em Desemvolvimento");
                break;
        
        
        
        }
    }
}
