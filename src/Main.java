import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Implementa um vetor de 5 (cinco) posições de itens
        Item[] estoque = new Item[5];

        // Cria objetos variados para preencher o vetor
        estoque[0] = new RoupaTamanhoUnico("Camisa", 10, 3, 15);
        estoque[1] = new RoupaPMG("Saia", 5, 8, 3, 2, 10);
        estoque[2] = new Acessorio("Cinto", 12, 4, 20);
        estoque[3] = new Acessorio("Pulseira", 25, 5, 30);
        estoque[4] = new RoupaTamanhoUnico("Saída de praia", 7, 2, 10);

        int opcao;
        do {
            System.out.println("\n--- Menu de Controle de Estoque ---");
            // Mostra o índice do vetor e a descrição do produto daquela posição
            for (int i = 0; i < estoque.length; i++) {
                System.out.println(i + " - " + estoque[i].getDescricao());
            }
            System.out.println("5 - Sair do sistema"); // Opção para sair

            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();

                if (opcao >= 0 && opcao < 5) {
                    estoque[opcao].venda(); // Aciona o método venda para o objeto adequado
                    estoque[opcao].reposicaoEstoque(); // Em seguida o método reposicaoEstoque
                } else if (opcao == 5) { // O sistema só encerra quando for escolhida a opção 5
                    System.out.println("Saindo do sistema. Estoque final:");
                    // Deve ser mostrado na tela o estoque de cada produto
                    for (Item item : estoque) {
                        System.out.println(item.getInformacoesEstoque());
                    }
                } else {
                    System.out.println("Opção inválida. Por favor, escolha um número entre 0 e 5.");
                }
            } catch (InputMismatchException e) { // Controle de exceções
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner
                opcao = -1; // Garante que o loop continue
            } catch (Exception e) { // Captura outras exceções inesperadas
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                opcao = -1;
            }

        } while (opcao != 5);

        scanner.close();
    }
}