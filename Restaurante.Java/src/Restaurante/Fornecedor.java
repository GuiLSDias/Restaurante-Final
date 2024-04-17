package Restaurante;

public class Fornecedor {
    private String nome;
    private String tipoproduto;
    private String dataentrega;
    private String valor;

    public Fornecedor(String nome, String tipoproduto, String dataentrega, String valor) {
        this.nome = nome;
        this.tipoproduto = tipoproduto;
        this.dataentrega = dataentrega;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoproduto() {
        return tipoproduto;
    }

    public void setTipoproduto(String tipoproduto) {
        this.tipoproduto = tipoproduto;
    }

    public String getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(String dataentrega) {
        this.dataentrega = dataentrega;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void mostraFornecedor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo de produto: " + this.tipoproduto);
        System.out.println("Data de entrega: " + this.dataentrega);
        System.out.println("Valor: " + this.valor);
    }
}