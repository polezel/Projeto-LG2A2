package projeto;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Usuario lucas = new Usuario("Lucas de Macedo Polezel");

        lucas.adicionaConta("Itaú", 1);
        lucas.adicionaConta("Carteira", 2);
        lucas.adicionaConta("Paypal", 3);

        //Conta Itaú
        lucas.adicionaTransacao(Tipo_Transacao.RECEITA, new BigDecimal("7200.12"), "Salário", 1);
        lucas.adicionaTransacao(Tipo_Transacao.DESPESA, new BigDecimal("4000.10"), "Aluguel", 1);
        lucas.adicionaTransacao(Tipo_Transacao.DESPESA, new BigDecimal("1000.10"), "Pagamento de Contas", 1);

        
        //Conta Carteira
        lucas.adicionaTransacao(Tipo_Transacao.RECEITA, new BigDecimal("20.00"), "Achado no chão", 2);
        lucas.adicionaTransacao(Tipo_Transacao.RECEITA, new BigDecimal("10.00"), "Aposta", 2);
        lucas.adicionaTransacao(Tipo_Transacao.DESPESA, new BigDecimal("35.00"), "Alimentação", 2);

        //Conta Paypal
        lucas.adicionaTransacao(Tipo_Transacao.RECEITA, new BigDecimal("1200.00"), "Investimento", 3);
        lucas.adicionaTransacao(Tipo_Transacao.DESPESA, new BigDecimal("500.50"), "Parcela Notebook", 3);
        lucas.adicionaTransacao(Tipo_Transacao.DESPESA, new BigDecimal("499.50"), "Parcela Mecanico", 3);

        System.out.println(lucas.extrato());

    }
}