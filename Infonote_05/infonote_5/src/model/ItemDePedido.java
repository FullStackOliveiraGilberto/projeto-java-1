package model;

public class ItemDePedido {
	int qtde;
	double subtotal;
	private Notebook notebook; 
	

	public Notebook getNotebook() {
		return notebook;
	}

	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "ItemDePedido [qtde=" + qtde + ", subtotal=" + subtotal + ", getQtde()=" + getQtde() + ", getSubtotal()="
				+ getSubtotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;

	}

	public void mostrar() {
		// Mostrar ItemDePedido
		System.out.println("\n\nPedido:\n");
		System.out.println("Qtde: " + this.qtde);
		System.out.println("Subtotal: " + this.subtotal);

	}

	public ItemDePedido() {
		super();
		// super faz referência à super classe
		// toda classe java é sub classe da classe Object
	}
	
	
	public ItemDePedido(Notebook notebook) {
		super();
		this.notebook = notebook;
		
		// super faz referência à super classe
		// toda classe java é sub classe da classe Object
	}

	public ItemDePedido(int i, double precoUnitario, Notebook aux) {
		// TODO Auto-generated constructor stub
	}
	
	
}