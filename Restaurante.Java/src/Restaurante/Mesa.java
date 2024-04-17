package Restaurante;

public class Mesa {
    private  int numero;
    private  int qtdlugares;

    public Mesa(int numero, int qtdlugares) {
        this.numero = numero;
        this.qtdlugares = qtdlugares;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQtdlugares() {
        return qtdlugares;
    }

    public void setQtdlugares(int qtdlugares) {
        this.qtdlugares = qtdlugares;
    }

    public void mostraMesa() {
        System.out.println("Número: " + this.numero);
        System.out.println("Quantidade de lugares: " + this.qtdlugares);
    }
}