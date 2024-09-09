import java.util.Date;

public class Investimentos extends Movimentacao{

    private String tipoInvestimento;

    public Investimentos(double valor, Date data, String descricao) {
        super(valor, data, descricao);
    }

    public Investimentos(double valor, Date data, String descricao, String tipoInvestimento) {
        super(valor, data, descricao);
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }


    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public void trasferenciaSaldo(ContaBancaria contaBancaria, ContaInvestimento contaInvestimento){
        System.out.println("Transferindo saldos da conta bancária para a conta invenstimentos.");
    }
}
