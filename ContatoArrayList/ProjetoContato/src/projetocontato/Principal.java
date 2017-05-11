
package projetocontato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Contato> listaContato= new ArrayList<>();
        Contato novo;
        int opcao;
        
        do{
            opcao=menu();
            switch (opcao){
                case 1:
                    novo= cadastro();
                    listaContato.add(novo);
                break;
                case 2:
                    imprimir(listaContato);
                break;       
                case 3:
                    remover(listaContato);
                break;
                case 4: 
                    mulheres(listaContato);
                break;
                case 5: 
                    homens(listaContato);
                break;    
                case 6:
                    Pesquisar(listaContato);
                break;
            }
        }while (opcao!=0);
    }

    private static int menu() {
        int op;
       Scanner leia= new Scanner(System.in);
       
       do{
           System.out.println("Menu de opções");
           System.out.println("0 - Sair");
           System.out.println("1 - Inserir");
           System.out.println("2 - Imprimir");
           System.out.println("3 - Excluir o ultimo");
           System.out.println("4 - Qtde de mulheres");
           System.out.println("5 - Qtde de homens");
           System.out.println("6 - Pesquisar o e-mail");
           op=leia.nextInt();
       }while(op<0 || op>6);
       return op;
    }

    private static Contato cadastro() {
        Scanner leia = new Scanner (System.in);
        Contato x = new Contato();
        System.out.println("Digite o e-mail.................:");
        x.setEmail(leia.nextLine());
        System.out.println("Digite o sexo homem ou mulher...:");
        x.setSexo(leia.nextLine());
        System.out.println("Digite o nome...................:");
        x.setNome(leia.nextLine());
        System.out.println("Digite a idade..................:");
        x.setIdade(leia.nextInt());
        
        return x;
    }

    private static void imprimir(List<Contato> listaContato) {
        if(listaContato.size ()== 0)
            System.out.println("Lista Vazia");
        else{
            System.out.println("Relação de Contatos");
            for(int i=0;i<listaContato.size();i++){
                System.out.println(listaContato.get(i).toString());
            }
        }
    }

    private static void mulheres(List<Contato> listaContato) {
      int quant=0;
        for(int j=0;j<listaContato.size();j++){
            if(listaContato.get(j).getSexo().equalsIgnoreCase("Mulher"))
                quant++;  
            }
            System.out.println("Quantidade de Mulheres é "+quant);
    }

    private static void homens(List<Contato> listaContato) {
        int quant=0;
        for(int j=0;j<listaContato.size();j++){
            if(listaContato.get(j).getSexo().equalsIgnoreCase("Homem"))
                quant++;  
            }
            System.out.println("Quantidade de Homem é "+quant);
    }

    private static void Pesquisar(List<Contato> listaContato) {
        if(listaContato.isEmpty()){
            System.out.println("Lista Vazia");
        }
        else{
             Scanner leia= new Scanner (System.in);
             System.out.println("Digite o nome para pesquisa do e-mail:");
             String nome;
             nome=leia.nextLine();
             int qt=0;// para verificar se existi o nome
             
             for(int i=0;i<listaContato.size();i++){
                if (listaContato.get(i).getNome().equalsIgnoreCase(nome)){
                    System.out.println("O e-mail é: "+listaContato.get(i).getEmail());
                    qt++;
                }     
            }
                if (qt==0)
                 System.out.println("O Contato não existi");
        }
    }

    private static void remover(List<Contato> listaContato) {
        if (listaContato.size()==0)
            System.out.println("Lista Vazia");
        else{
            listaContato.remove(listaContato.size()-1);
            System.out.println("Ultimo Contato removido com SUCESSO!!!");
        }
    }
}
    
