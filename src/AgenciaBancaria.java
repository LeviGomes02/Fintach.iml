public class AgenciaBancaria {

    private double id;
    private String codigoAgencia;
    private Banco banco;

    public AgenciaBancaria(String codigoAgencia, Banco banco){

        this.codigoAgencia = codigoAgencia;
        this.banco = banco;
    }

    public double getId(){
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getCodigoAgencia() {
        return codigoAgencia;
    }

    public void setCodigoAgencia(String codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }


    public void exibirDadosAgenciaBancaria() {
        System.out.println("Exibindo os dados da Agência Bancária.");
    }
    public void editarOsDadosAgenciaBancaria() {
        System.out.println("Editando os dados do Agência Bancária.");
    }
    public void removerAgenciaBancaria() {
        System.out.println("Removendo o Agência Bancária do banco de dados.");
    }


}
