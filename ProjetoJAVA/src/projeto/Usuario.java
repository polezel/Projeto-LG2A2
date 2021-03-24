package projeto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private BigDecimal saldo_total;
    private List<Conta> contas;

    public Usuario(String nome){
        this.nome = nome;
        this.saldo_total = new BigDecimal("0.00");
        this.contas = new ArrayList<>();
    }

    public void adicionaConta(String nome, int id){
        Conta c = new Conta(nome, id);
        contas.add(c);
    }

    public Conta buscaContaID(int id_conta){
        for(Conta conta: contas){
            if(conta.getId() == id_conta) {
                return conta;
            }
        }

        return null;
    }

    public void adicionaTransacao(Tipo_Transacao tipo, BigDecimal valor, String categoria, int id_conta){
        Conta c = buscaContaID(id_conta);

        c.adicionaTransacao(tipo, valor, categoria);

        if(tipo == Tipo_Transacao.RECEITA){
            saldo_total = saldo_total.add(valor);
        }
        else{
            saldo_total = saldo_total.subtract(valor);
        }
    }

    public String extrato(){
        StringBuilder str = new StringBuilder();

        str.append("*-*-*-*-*-* EXTRATO *-*-*-*-*-*\n");

        for(Conta c: contas){
            str.append(c);
        }

        str.append("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*\n\n\n\n");
        str.append("Saldo Total: " + saldo_total);

        return str.toString();
    }

}
