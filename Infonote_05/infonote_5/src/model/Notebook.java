package model;

public class Notebook {
	
	private int numeroNote;
	private String Modelo;
	private double PrecoUnitario;
	
	public String getModelo() {
		return Modelo;
	}

	public double getPrecoUnitario() {
		return PrecoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		PrecoUnitario = precoUnitario;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getNumeroNote() {
		return numeroNote;
	}

	public void setNumeroNote(int numeroNote) {
		this.numeroNote = numeroNote;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	private int numero;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;

	@Override
	public String toString() {
		return "Notebook [numero=" + numero + ", dataEmissao=" + dataEmissao + ", formaDePagamento=" + formaDePagamento
				+ ", valorTotal=" + valorTotal + ", situacao=" + situacao + ", getNumero()=" + getNumero()
				+ ", getDataEmissao()=" + getDataEmissao() + ", getFormaDePagamento()=" + getFormaDePagamento()
				+ ", getValorTotal()=" + getValorTotal() + ", getSituacao()=" + getSituacao() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Notebook(int numero, String dataEmissao, String formaDePagamento, double valorTotal, String situacao) {
		super();
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;

	}

	public void mostrar() {
		// Mostrar usu�rio
		System.out.println("\n\nNotebook:\n");
		System.out.println("DataEmissao: " + this.dataEmissao);
		System.out.println("FormaDePagamento: " + this.formaDePagamento);
		System.out.println("ValorTotal: " + this.valorTotal);
		System.out.println("Situacao: " + this.situacao);

	}

	public Notebook() {
		super();
		// super faz refer�ncia � super classe
		// toda classe java � sub classe da classe Object
	}
}