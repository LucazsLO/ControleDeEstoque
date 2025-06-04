import java.util.Scanner;

class RoupaPMG implements Item {
    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeP = quantidadeP;
        this.quantidadeM = quantidadeM;
        this.quantidadeG = quantidadeG;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    @Override
    public void venda() {
        Scanner scanner = new Scanner(System.in);
        String tamanhoVenda;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Informe o tamanho (P, M ou G) de " + descricao + " a ser vendido: ");
            tamanhoVenda = scanner.nextLine().toUpperCase();

            switch (tamanhoVenda) {
                case "P":
                    if (this.quantidadeP > 0) {
                        this.quantidadeP--;
                        System.out.println("Uma unidade de " + descricao + " (Tamanho P) vendida.");
                        entradaValida = true;
                    } else {
                        System.out.println("Estoque de " + descricao + " (Tamanho P) esgotado.");
                    }
                    break;
                case "M":
                    if (this.quantidadeM > 0) {
                        this.quantidadeM--;
                        System.out.println("Uma unidade de " + descricao + " (Tamanho M) vendida.");
                        entradaValida = true;
                    } else {
                        System.out.println("Estoque de " + descricao + " (Tamanho M) esgotado.");
                    }
                    break;
                case "G":
                    if (this.quantidadeG > 0) {
                        this.quantidadeG--;
                        System.out.println("Uma unidade de " + descricao + " (Tamanho G) vendida.");
                        entradaValida = true;
                    } else {
                        System.out.println("Estoque de " + descricao + " (Tamanho G) esgotado.");
                    }
                    break;
                default:
                    System.out.println("Tamanho inválido. Por favor, digite P, M ou G.");
                    break;
            }
        }
    }

    @Override
    public void reposicaoEstoque() {
        if (this.quantidadeP < this.estoqueMinimo) {
            this.quantidadeP = this.estoqueMaximo;
            System.out.println("Estoque de " + descricao + " (Tamanho P) reposto para " + this.quantidadeP);
        }

        if (this.quantidadeM < this.estoqueMinimo) {
            this.quantidadeM = this.estoqueMaximo;
            System.out.println("Estoque de " + descricao + " (Tamanho M) reposto para " + this.quantidadeM);
        }

        if (this.quantidadeG < this.estoqueMinimo) {
            this.quantidadeG = this.estoqueMaximo;
            System.out.println("Estoque de " + descricao + " (Tamanho G) reposto para " + this.quantidadeG);
        }
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public int getQuantidadeP() {
        return quantidadeP;
    }

    public int getQuantidadeM() {
        return quantidadeM;
    }

    public int getQuantidadeG() {
        return quantidadeG;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    @Override
    public String getInformacoesEstoque() {
        return "Produto: " + descricao + ", P: " + quantidadeP + ", M: " + quantidadeM +
                ", G: " + quantidadeG + ", Mínimo: " + estoqueMinimo + ", Máximo: " + estoqueMaximo;
    }
}