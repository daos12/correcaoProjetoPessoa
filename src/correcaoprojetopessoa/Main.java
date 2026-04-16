package correcaoprojetopessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Lista de objetos
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        int opcao = 8;

        do {
            System.out.println("\n1. Cadastro de Pessoas");
            System.out.println("2. Listar Pessoas");
            System.out.println("3. Buscar Pessoas");
            System.out.println("4. Mostrar quantidade cadastrada.");
            System.out.println("5. Remover Pessoa");
            System.out.println("6. Sair");
            System.out.print("Escolha: ");

            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    //Cadastro Pessoa
                    System.out.print("Nome: ");
                    String nome = s.nextLine();

                    System.out.print("Idade: ");
                    int idade = s.nextInt();
                    s.nextLine();

                    System.out.print("Cpf: ");
                    String cpf = s.nextLine();

                    if (idade < 0) {
                        System.out.println("Idade invalida!");
                        break;
                    } else {
                        Pessoa p = new Pessoa(nome, idade, cpf);
                        lista.add(p);
                        System.out.println("Pessoa cadastrada com sucesso!");
                    }
                    
                    

                    break;
                case 2:
                    //Listar

                    if (lista.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada.");
                    } else {

                        for (Pessoa pessoa : lista) {
                            pessoa.exibir();
                        }

                    }

                    break;
                case 3:
                    //Buscar Pessoa
                    System.out.print("Digite o nome para buscar:");
                    String busca = s.nextLine();

                    boolean encontrado = false;

                    for (Pessoa pessoaPesquisa : lista) {
                        if (pessoaPesquisa.getNome().equalsIgnoreCase(busca)) {
                            encontrado = true;
                            pessoaPesquisa.exibir();
                        }
                    }
                    
                    if (encontrado) {
                        System.out.println("Pessoa encontrada!");
                    } else {
                        System.out.println("Pessoa não encontrada!");
                    }

                    break;
                case 4:
                    System.out.println("Total de pessoas:"
                            + lista.size());

                    break;
                    
                case 5:
                    //Remover Pessoa
                    System.out.print("Digite o nome para remover:");
                    String nomeRemover = s.nextLine();
                    
                    boolean removido = false;
                    
                    for(int i = 0; i < lista.size();i++){
                        if (lista.get(i).getNome().equalsIgnoreCase(nomeRemover)){
                            lista.remove(i);
                        
                            System.out.println("Pessoa removida com sucesso!");
                            removido = true;
                            break;
                        }
                    }
                    if(!removido){
                        System.out.println("Pessoa não encontrada");
                    }
                    
                    break;
                case 6:

                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcao != 6);

    }

}
