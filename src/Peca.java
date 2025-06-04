public abstract class Peca implements Item {
    protected String descricao;
    protected int quantidade;
    protected int estoqueMinimo;
    protected int estoqueMaximo;

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    @Override
    public abstract void venda();

    @Override
    public void reposicaoEstoque() {
        if (this.quantidade < this.estoqueMinimo) {
            this.quantidade = this.estoqueMaximo;
            System.out.println("Estoque de " + this.descricao + " reposto para " + this.quantidade);
        }
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    @Override
    public String getInformacoesEstoque() {
        return "Produto: " + descricao + ", Quantidade em Estoque: " + quantidade +
                ", Mínimo: " + estoqueMinimo + ", Máximo: " + estoqueMaximo;
    }
}
