package Restaurante ;

import java.util.Scanner;

public class Reserva implements DarDesconto{
    private int numero;
    private String data;
    private Cliente cliente;
    private Mesa mesa;
    private double valorReserva;


    public Reserva(int numero, String data, Cliente cliente, Mesa mesa) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.mesa = mesa;
        this.valorReserva = 50;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public double getValorReserva() {
        return valorReserva;
    }
    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void mostraReserva() {
        System.out.println("------------Reserva------------");
        System.out.println("Número da Reserva: " + this.numero);
        System.out.println("Data: " + this.data);
        System.out.println("valor reserva: " + this.valorReserva);
        System.out.println("\n------------Cliente------------ ");
        this.cliente.mostraCliente();
        System.out.println("\n-------------Mesa------------ ");
        this.mesa.mostraMesa();

    }

    @Override
    public void desconto(int descontin) throws DescontoException {

        Scanner sc = new Scanner(System.in);
        System.out.println("insira o cupom de desconto  insira o valor do desconto em %:");
        descontin = sc.nextInt();
        double temp;
        temp = descontin;
        temp = (temp * 0.01);

        if ( temp <= 0.01) {
            throw new DescontoException("O desconto deve ser maior que 1%");

        } setValorReserva( getValorReserva() - (getValorReserva() * temp) );
        System.out.println("valor da Reserva: " + getValorReserva());

    }
}