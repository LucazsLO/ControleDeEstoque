import java.util.InputMismatchException;
import java.util.Scanner;

public class Acessorio extends Peca {

    public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        int quantidadeVendida = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Informe a quantidade de " + descricao + " a ser vendida: ");
                quantidadeVendida = scanner.nextInt();
                if (quantidadeVendida <= 0) {
                    System.out.println("A quantidade vendida deve ser um número positivo.");
                } else if (quantidadeVendida > this.quantidade) {
                    System.out.println("Não há estoque suficiente. Quantidade atual: " + this.quantidade);
                } else {
                    this.quantidade -= quantidadeVendida;
                    System.out.println(quantidadeVendida + " unidades de " + descricao + " vendidas.");
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para a quantidade.");
                scanner.next();
            }
        }
    }
}