import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Date data = new Date();
        Date novaData = new Date();

        Usuario usuario = new Usuario("Marcelo", "Souza");
        Banco banco = new Banco("Itaú","341");
        AgenciaBancaria agencia = new AgenciaBancaria("8483", banco);
        ContaCorrente contaCorrente = new ContaCorrente(535, 5000.0d,agencia);
        ContaBancaria contaBancaria = new ContaBancaria(431,3000.0d,agencia);
        ContaInvestimento contaInvestimento = new ContaInvestimento(500.0d,agencia);
        Movimentacao movimentacao = new Movimentacao(100.0d,data,"boleto");
        Gastos gastos = new Gastos(800.0d,data,"aluguel");
        Recebimentos recebimentos = new Recebimentos(1000.0d, data, "vendas", "cliente x");
        Investimentos investimentos = new Investimentos(500.0d, data, "investimento a curto prazo","CDB");


//        usuario.setId(394921d);
//        System.out.println("Id: " + usuario.getId());
//        usuario.setNome("Mario");
//        System.out.println("Nome: " + usuario.getNome());
//        usuario.setSobrenome("Silva");
//        System.out.println("Sobrenome: " + usuario.getSobrenome());
//        usuario.setCpf("123215499-91");
//        System.out.println("CPF: " + usuario.getCpf());
//        usuario.setRg("32.432.432-00");
//        System.out.println("RG: " + usuario.getRg());
//        usuario.exibirDetalhesConta();

//        banco.setId(31432d);
//        System.out.println("Id: " + banco.getId());
//        banco.setNome("Nubank");
//        System.out.println("Nome: " + banco.getNome());
//        banco.setCodigoBanco("260");
//        System.out.println("Código: " + banco.getCodigoBanco());
//        banco.exibirDadosBanco();
//        banco.editarOsDadosBanco();
//        banco.removerBanco();

//        agencia.setId(3124123d);
//        System.out.println("Id: " + agencia.getId());
//        agencia.setBanco(banco);
//        System.out.println("Banco: " + agencia.getBanco().getNome());
//        agencia.setCodigoAgencia("324");
//        agencia.exibirDadosAgenciaBancaria();
//        agencia.editarOsDadosAgenciaBancaria();
//        agencia.removerAgenciaBancaria();


//        contaBancaria.setId(432492d);
//        System.out.println("Id: " + contaBancaria.getId());
//        contaBancaria.setNumeroConta(423);
//        System.out.println("Número: " + contaBancaria.getNumeroConta());
//        contaBancaria.setSaldo(15000d);
//        System.out.println("Saldo: " + contaBancaria.getSaldo());
//        contaBancaria.exibirSaldo();
//        contaBancaria.deletarConta();
//        contaBancaria.historiocoTransacoes();

//        contaCorrente.setId(959492d);
//        System.out.println("Id: " + contaCorrente.getId());
//        contaCorrente.setNumeroConta(998);
//        System.out.println("Número: " + contaCorrente.getNumeroConta());
//        contaCorrente.setSaldo(7000d);
//        System.out.println("Saldo: " + contaCorrente.getSaldo());
//        contaCorrente.exibirSaldo();
//        contaCorrente.deletarConta();
//        contaCorrente.historiocoTransacoes();

//        contaInvestimento.setId(734123d);
//        System.out.println("Id: " + contaInvestimento.getId());
//        contaInvestimento.setNumeroConta(466);
//        System.out.println("Número: " + contaInvestimento.getNumeroConta());
//        contaInvestimento.setSaldo(3000d);
//        System.out.println("Saldo: " + contaInvestimento.getSaldo());
//        contaInvestimento.exibirSaldo();
//        contaInvestimento.deletarConta();
//        contaInvestimento.historiocoTransacoes();
//        contaInvestimento.calcularRendimento();
//        contaInvestimento.exibirRendimento();

//        movimentacao.setValor(200.d);
//        System.out.println("Valor: " + movimentacao.getValor());
//        movimentacao.setData(novaData);
//        System.out.println("Data: " + movimentacao.getData());
//        movimentacao.setDescricao("compras");
//        System.out.println("Descrição: " + movimentacao.getDescricao());
//        movimentacao.setStatus("pago");
//        System.out.println("Status: " + movimentacao.getStatus());
//        movimentacao.cadastrarMovimentacaoRecorrente();
//        movimentacao.alterarSaldo(contaCorrente);

//        gastos.setValor(50d);
//        System.out.println("Valor: " + gastos.getValor());
//        gastos.setData(novaData);
//        System.out.println("Data: " + gastos.getData());
//        gastos.setDescricao("assinatura");
//        System.out.println("Descrição: " + gastos.getDescricao());
//        gastos.setStatus("pendente");
//        System.out.println("Status: " + gastos.getStatus());
//        gastos.cadastrarMovimentacaoRecorrente();
//        gastos.alterarSaldo(contaCorrente);
//        gastos.exibirTotalGastosMes();
//        gastos.exibirStatus();
//        gastos.exibirFrequenciaGastos("assinatura");
//        gastos.exibirGastosPrevistos();

//        recebimentos.setValor(1000d);
//        System.out.println("Valor: " + recebimentos.getValor());
//        recebimentos.setData(novaData);
//        System.out.println("Data: " + recebimentos.getData());
//        recebimentos.setDescricao("aluguel");
//        System.out.println("Descrição: " + recebimentos.getDescricao());
//        recebimentos.setStatus("recebido");
//        System.out.println("Status: " + recebimentos.getStatus());
//        recebimentos.setNomeRemetente("Tiago");
//        System.out.println("Nome do Remetente: " + recebimentos.getNomeRemetente());
//        recebimentos.cadastrarMovimentacaoRecorrente();
//        recebimentos.alterarSaldo(contaCorrente);
//        recebimentos.exibirHitoricoRemetente("Tiago");
//        recebimentos.hitoricoRecebimentos();
//        recebimentos.exibirFrequenciaGanhos("aluguel");
//        recebimentos.exibirGanhoPrevisto();
//        recebimentos.exibindoStatus();


        investimentos.setValor(3000d);
        System.out.println("Valor: " + investimentos.getValor());
        investimentos.setData(novaData);
        System.out.println("Data: " + investimentos.getData());
        investimentos.setTipoInvestimento("LCA");
        System.out.println("Tipo de investimento: " + investimentos.getTipoInvestimento());
        investimentos.setDescricao("investimento a longo prazo");
        System.out.println("Descrição: " + investimentos.getDescricao());
        investimentos.setStatus("investido");
        System.out.println("Status: " + investimentos.getStatus());
        investimentos.cadastrarMovimentacaoRecorrente();
        investimentos.alterarSaldo(contaCorrente);
        investimentos.trasferenciaSaldo(contaBancaria, contaInvestimento);
    }
}