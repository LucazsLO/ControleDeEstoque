public class RoupaTamanhoUnico extends Peca {

    public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        if (this.quantidade > 0) {
            this.quantidade--;
            System.out.println("Uma unidade de " + descricao + " vendida.");
        } else {
            System.out.println("Estoque de " + descricao + " esgotado. Não é possível vender.");
        }
    }
}
