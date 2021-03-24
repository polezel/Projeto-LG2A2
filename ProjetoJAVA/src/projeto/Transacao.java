package projeto;

import java.math.BigDecimal;
import java.util.Date;


public class Transacao {

	private Tipo_Transacao tipo;
	private BigDecimal valor;
	private String categoria;
	private Date data;
	
	public Transacao(Tipo_Transacao tipo, BigDecimal valor, String categoria, Date data) {
		
		this.tipo = tipo;
		this.valor = valor;
		this.categoria = categoria;
		this.data = data;
	}

	public Tipo_Transacao getTipo() {
		return tipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public String getCategoria() {
		return categoria;
	}

	public Date getData() {
		return data;
	}

	@Override
	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append("Tipo: ");
		str.append(tipo);
		str.append('\n');
		
		str.append("Valor: ");
		str.append(valor);
		str.append('\n');
		
		str.append("Categoria: ");
		str.append(categoria);
		str.append('\n');
		
		str.append("Data: ");
		str.append(data);
		str.append('\n');
		
		return str.toString();
	}
	
}
