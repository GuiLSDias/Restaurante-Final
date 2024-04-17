package Restaurante;

abstract class Funcionario extends Pessoa{


    private String setor;
    private String datanascimento;
    private double salario;
    private double bonus;
    public Funcionario(String nome, String documento, double salario, String setor, String datanascimento){
        super(nome, documento);
        this.salario = salario;
        this.setor = setor;
        this.datanascimento = datanascimento;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostraFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Documento: " + this.documento);
        System.out.println("Setor: " + this.setor);
        System.out.println("Data de nascimento: " + this.datanascimento);
        System.out.println("Salário: " + this.salario);

    }
    abstract void bonificacao(double bonus);
}