package Restaurante;

public class TesteFunc {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Claudio", "120.120.300-73",1500,"Administrativo","20/02/1986");
        Funcionario g = g1;
        g.mostraFuncionario();
        g.bonificacao(1.50);

        Garcom g2 = new Garcom("Jorge","111.111.111-11",1500,"Atendimento","25/02/2000");
        Funcionario ga = g2;
        ga.mostraFuncionario();
        ga.bonificacao(1.10);

        Caixa c2 = new Caixa("Pamela","222.222.222-22",1200,"Atendimento","23/01/1998");
        Funcionario c = c2;
        c.mostraFuncionario();
        c.bonificacao(1.12);

        Caixa c1 = new Caixa(" Rafael","200.200.200-20",1250,"Atendimento","15/02/2002");
        Funcionario cc = c1;
        cc.mostraFuncionario();
        cc.bonificacao(1.35);

        Cheff cf = new Cheff("Calr", "155.155.155-55",1450,"Cozinha","13/05/1995","Carnes");
        Funcionario cf1 = cf;
        cf1.mostraFuncionario();
        ((Cheff) cf1).mostraCheff();
        cf1.bonificacao(1.85);
    }
}
