import java.util.Date;

public class Movimentacao {

    private double valor;
    private Date data;
    private String descricao;
    private String status;

    public Movimentacao(double valor, Date data, String descricao){
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public Movimentacao(double valor, Date data){
        this.valor = valor;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cadastrarMovimentacaoRecorrente(){
        System.out.println("Cadastrando uma movimentação que ocorre frequêntemente");
    }

    public void alterarSaldo(ContaBancaria conta){
        System.out.println("Alterando o saldo da conta bancária (retirando)");
    }
}
