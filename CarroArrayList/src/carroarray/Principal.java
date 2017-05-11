
package carroarray;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      ArrayList<Carro> listaCarros;
      listaCarros = new ArrayList<Carro>();
      Carro novo;
      int opcao;
      do{
          opcao= menu();
          switch(opcao){
              case 1:
                  novo = cadastro();
                  listaCarros.add(novo);
                  System.out.println("Cadastrado com Sucesso");
                  break;
              case 2:
                  imprimir(listaCarros);
                  break;
              case 3:
                  calcMedia(listaCarros);
                  break;
              case 4:
                  calcCarrosPrata(listaCarros);
                  break;
          }
          
      }while(opcao!=0);
      
    } 

    private static int menu() {
     int op;
     Scanner leia = new Scanner(System.in);
     do{
         System.out.println("Menu de Opções:");
         System.out.println("0 - Sair");
         System.out.println("1 - Inserir");
         System.out.println("2 - Imprimir");
         System.out.println("3 - Valor médio dos Carros");
         System.out.println("4 - Quantidade de carros prata");
         op = leia.nextInt();
     
     }while(op<0||op>4);
     return op;
    }

    private static Carro cadastro() {
        Carro x = new Carro();
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite a cor do carro");
        x.setCor(leia.next());
        System.out.println("Digite o valor do Carro");
        x.setValor(leia.nextDouble());
        return x;
     }   

    private static void imprimir(ArrayList<Carro> listaCarros) {
        if(listaCarros.isEmpty()) {
            System.out.println("Lista Vazia");
        }
        else{
            System.out.println("A lista de Carros:");
            for (int i = 0; i < listaCarros.size(); i++) {
                System.out.println(listaCarros.get(i).toString());
                
            }
        
        }
    }

    private static void calcMedia(ArrayList<Carro> listaCarros) {
        if(listaCarros.isEmpty()) {
            System.out.println("Lista Vazia");
        }
        else{
            double soma = 0;
            for (int i = 0; i < listaCarros.size(); i++) {
                soma = soma+listaCarros.get(i).getValor();
                
            }
            double media = soma/listaCarros.size();
            System.out.printf("O Valor Medio dos Carros: %.2f",media);
        }
    }

    private static void calcCarrosPrata(ArrayList<Carro> listaCarros) {
        if(listaCarros.isEmpty()){
            System.out.println("Lista de Carros");
        }
        else{
            int qtde = 0;
            for (int i = 0; i < listaCarros.size(); i++) {
                if(listaCarros.get(i).getCor().equalsIgnoreCase("Prata"))
                    qtde = qtde + 1;
            
            }
        }
        System.out.println("A quantidade de Carros Prata:"+qtde);
    }
}






