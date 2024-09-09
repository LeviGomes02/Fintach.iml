import java.util.Date;

public class Recebimentos extends Movimentacao {


    private String nomeRemetente;

    public String getNomeRemetente() {
        return nomeRemetente;
    }

    public Recebimentos(double valor, Date data, String descricao, String nomeRemetente){
        super(valor, data, descricao);
        this.nomeRemetente = nomeRemetente;
    }

    public Recebimentos(double valor, Date data, String descricao){
        super(valor, data, descricao);

    }

    public Recebimentos(double valor, Date data){
        super(valor, data);
    }

    public void setNomeRemetente(String nomeRemetente) {
        this.nomeRemetente = nomeRemetente;
    }

    public void hitoricoRecebimentos(){

        System.out.println("Exibindo o histórico de Receita: ");

    }

    public void exibirGanhoPrevisto() {

        System.out.println("Exibindo as receitas pré-programadas: ");

    }

    public void exibirHitoricoRemetente(String nomeRemetente) {

        System.out.println("Exibindo o histórico de recebimentos de um determinado remetente: ");

    }

    public void exibirFrequenciaGanhos(String descricao) {

        System.out.println("Exibindo a frequência de determinado ganho: ");

    }

    public void exibindoStatus() {

        System.out.println("Exibindo o status de determinado ganho: ");

    }

    @Override
    public void alterarSaldo(ContaBancaria conta){
        System.out.println("Alterando o saldo da conta bancária (adicionando)");
    }

}
