public class Banco {

    private double id;
    private String nome;
    private String codigoBanco;

    public Banco(String nome, String codigoBanco){
        this.nome = nome;
        this.codigoBanco = codigoBanco;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }


    public void exibirDadosBanco() {
        System.out.println("Exibindo os dados do Banco.");
    }
    public void editarOsDadosBanco() {
        System.out.println("Editando os dados do Banco.");
    }
    public void removerBanco() {
        System.out.println("Removendo o Banco do banco de dados.");
    }
}
