package projeto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private String nome;
    private int id;
    private List<Transacao> transacoes;
    private BigDecimal saldo;

    public Conta(String nome, int id){
        this.nome = nome;
        this.id = id;

        this.transacoes = new ArrayList<>();
        this.saldo = new BigDecimal("0.00");
    }

    public void adicionaTransacao(Tipo_Transacao tipo, BigDecimal valor, String categoria){
        Transacao tr = new Transacao(tipo, valor, categoria, new Date());

        if(tipo == Tipo_Transacao.RECEITA){
            saldo = saldo.add(valor);
        }
        else{
            saldo = saldo.subtract(valor);
        }

        transacoes.add(tr);
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("===== Conta: "); str.append(nome);
        str.append(" === id: "); str.append(id);
        str.append(" =====\n");

        for(Transacao tra: transacoes){
            str.append(tra);
            str.append("\n\n");
        }

        str.append("==============================\n");
        str.append("Saldo da Conta: " + saldo + '\n');

        return str.toString();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}