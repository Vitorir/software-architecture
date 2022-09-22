public class Loja {
    private Fornecedor fornecedor;
    private Produto produto;
    private Estoque estoque;

    public Loja(Fornecedor fornecedor, Produto produto, Estoque estoque) {
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.estoque = estoque;
    }


    // gets e sets
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }


    public void registrarProduto(Produto produto, int qtd) {
        this.estoque.setProduto(produto);
        this.estoque.setQuantidade(qtd);
    }

    public int Comprar(Produto produto, int qtd) {
        if (estoque.getQuantidade() > 0) {
            this.estoque.setQuantidade(qtd);
        }

        return 0;
    }

}