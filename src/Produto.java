public class Produto {
    private Fornecedor fornecedor;
    private String nome;
    private String descricao;
    private String tipo;
    private String cor;
    private String caracteristicas;
    private double valorDeCusto;
    private double percentualDeLucro;

    // Gets e Sets
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public double getPercentualDeLucro() {
        return percentualDeLucro;
    }

    public void setPercentualDeLucro(double percentualDeLucro) {
        this.percentualDeLucro = percentualDeLucro;
    }
}
