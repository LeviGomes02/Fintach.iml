import java.util.Date;

public class Gastos extends Movimentacao {


    public Gastos(double valor, Date data, String descricao){
        super(valor, data, descricao);

    }

    public Gastos(double valor, Date data){
        super(valor, data);
    }

    public void historicoGastos(){

        System.out.println("Exibindo o hostórico de gastos: ");

    }

    public void exibirTotalGastosMes() {

        System.out.println("Exibindo o total de gastos mensais: ");

    }

    public void exibirGastosPrevistos() {

        System.out.println("Exibindo o total de gastos pré-programados: ");

    }

    public void exibirFrequenciaGastos(String descricao) {

        System.out.println("Exibindo a frequência de determinado gasto: ");

    }

    public void exibirStatus() {

        System.out.println("Exibindo o status do pagamento: ");

    }
}
