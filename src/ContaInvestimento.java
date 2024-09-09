public class ContaInvestimento extends ContaBancaria{

    public ContaInvestimento(double saldo, AgenciaBancaria agenciaBancaria) {
        super(saldo, agenciaBancaria);
    }

    public void calcularRendimento(){
        System.out.println("Calcula o rendimento com base no tipo de investimento.");
    }

    public void exibirRendimento() {
        System.out.println("Exibindo o rendimento");
    }

}
