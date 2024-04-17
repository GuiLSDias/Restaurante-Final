package Restaurante;

import java.text.DecimalFormat;

public class Cheff extends Funcionario{

    private String especialidade;

    public Cheff(String nome, String documento, double salario, String setor, String datanascimento, String especialidade) {
        super(nome, documento, salario, setor, datanascimento);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void mostraCheff() {
        System.out.println("Especialidade: " + this.especialidade);
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
