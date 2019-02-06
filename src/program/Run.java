package program;

import java.util.Locale;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);
        DadosLista<String> dadosSTR = new DadosLista<>();
        DadosLista<Integer> dadosINT = new DadosLista<>();
        DadosLista<Double> dadosDOU = new DadosLista<>();
        
        
        System.out.print("Digite o tipo de dados a trabalhar no sistema [Str / Dou / Int ] :");
        String opcao = sc.next();
        opcao = opcao.toUpperCase();
        System.out.println("");
         int qnt = -1;
         
        switch(opcao){
            case "STR" :
                System.out.print("Digite a quantidade de String para salvar: ");
               
               
                try{
                    qnt = sc.nextInt();
                    System.out.println("");
                }
                catch(Exception erro ) 
                {
                    System.out.println("Erro Seguir com o programa assim mesmo: [y/s]: " );
                    
                }
                while(qnt != 0){
                
                    System.out.print(">: ");
                    dadosSTR.add(scs.nextLine());
                    qnt--;
                }
                    
                    
                System.out.println(dadosSTR.print()); 
                    
                    break;
            case "INT":
                System.out.print("Digite a quantidade de Inteiros para salvar: ");
               
                
                try{
                    qnt = sc.nextInt();
                    System.out.println("");
                }
                catch(Exception erro ) 
                {
                    System.out.println("Erro Seguir com o programa assim mesmo: [y/s]: " );
                    
                }
                while(qnt != 0){
                
                    System.out.print(">: ");
                    dadosINT.add(scs.nextInt());
                    qnt--;
                }
                    
                    
                System.out.println(dadosINT.print()); break;
           
            case "DOU" :
                System.out.print("Digite a quantidade de Double para salvar: ");
               
                
                try{
                    qnt = sc.nextInt();
                    System.out.println("");
                }
                catch(Exception erro ) 
                {
                    System.out.println("Erro Seguir com o programa assim mesmo: [y/s]: " );
                    
                }
                while(qnt != 0){
                
                    System.out.print(">: ");
                    dadosDOU.add(scs.nextDouble());
                    qnt--;
                }
                    
                    
                System.out.println(dadosDOU.print()); break;
        
        
        
        }
    }
}
