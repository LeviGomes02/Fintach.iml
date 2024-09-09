import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Date data = new Date();

        Banco itau = new Banco("Itaú","341");
        AgenciaBancaria agencia = new AgenciaBancaria("8483", itau);


    }
}