package Restaurante;
import  java.text.DecimalFormat;
public class Caixa extends Funcionario{

    public Caixa(String nome, String documento, double salario, String setor, String datanascimento) {
        super(nome, documento, salario, setor, datanascimento);
    }
    @Override
    public void bonificacao(double bonus){
        double bonificacao = getSalario() * bonus;
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Bonificação do caixa: " + bonus);
        System.out.println("Salario com bonificação: R$" + df.format(bonificacao));
        System.out.println("  ");
    }
}
