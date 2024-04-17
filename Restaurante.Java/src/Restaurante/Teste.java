

package Restaurante;

public class Teste {
    public static void main(String[] args) {
        // Criação de objetos
        Cliente cliente1 = new Cliente("João da Silva","123456789","199958465");

        Mesa mesa1 = new Mesa(1, 4);

        Reserva reserva1 = new Reserva(1, "15/10/2022", cliente1, mesa1);

        // Exibição das informações
        reserva1.mostraReserva();



        Cliente cliente = new Cliente("João", "123456789", "199958465");
        Mesa mesa = new Mesa(1,4);

        Reserva reserva = new Reserva(1, "2024-04-11", cliente, mesa);

        System.out.println("Mostrando reserva antes do desconto:");
        reserva.mostraReserva();

        try {
            reserva.desconto(10); // Aplicando um desconto de 10%
        } catch (DescontoException e) {
            System.out.println("Erro ao aplicar desconto: " + e.getMessage());
        }

        System.out.println("Mostrando reserva após o desconto:");
        reserva.mostraReserva();






    }
}

