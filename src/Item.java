public interface Item {
    void venda(); // Método para realizar uma venda do item
    void reposicaoEstoque(); // Método para verificar e repor o estoque do item
    String getDescricao(); // Para exibir no menu
    String getInformacoesEstoque(); // Para exibir o estoque final de cada produto
}
