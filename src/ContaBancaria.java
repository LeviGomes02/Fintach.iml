public class ContaBancaria {

    private double id;
    private int numeroConta;
    private double saldo;
    private AgenciaBancaria agenciaBancaria;

    public ContaBancaria(int numeroConta, double saldo, AgenciaBancaria agenciaBancaria){
        this.id = id;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agenciaBancaria = agenciaBancaria;
    }

    protected ContaBancaria(double saldo, AgenciaBancaria agenciaBancaria){
        this.saldo = saldo;
        this.agenciaBancaria = agenciaBancaria;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public AgenciaBancaria getAgenciaBancaria() {
        return agenciaBancaria;
    }

    public void setAgenciaBancaria(AgenciaBancaria agenciaBancaria) {
        this.agenciaBancaria = agenciaBancaria;
    }


    public void historiocoTransacoes(){

        System.out.println("Exibindo o hitórico das transações da conta bancária:");

    }

    public void exibirSaldo() {

        System.out.println("Exibindo o saldo da conta bancária: ");

    }

    public void deletarConta() {

        System.out.println("Deletando conta bancária do sistema Fintach: ");

    }

}
