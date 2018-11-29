package model;

public class Pedido {
	
	private Endereco enderecoEntrega; 
	private ItemDePedido itens[] = new ItemDePedido[10];
	
	Notebook notebooks[] = new Notebook[10]; 
 	Pedido pedido; 

 	public void InfoNote(){ 
 	 	 // public Notebook(int numero, String dataEmissao, String formaDePagamento, double valorTotal, String situacao) {
		 	 	notebooks[0] = new Notebook(1, "Negativo N22BR", "CPU Intel Core 2 Duo, Memória 2 GB, HD 250 GB",1200.00,"img\\n22br.jpg"); 
		 	  	notebooks[1] = new Notebook(2, "Bell B55BR","CPU Intel I3, Memória 4 GB, HD 500 GB",1800.00, "img\\b55br.jpg"); 
		 	 	notebooks[2] = new Notebook(3, "Pompaq P41BR","CPU Intel I3, Memória 3 GB, HD 320 GB", 1600.00,"img\\p41br.jpg");		 	 	 
		 	 	notebooks[3] = new Notebook(4, "CCF CR71CH","CPU Intel Dual Core, Memória 2 GB, HD 160 GB", 1100.00,"img\\cr71ch.jpg"); 
		 	 	notebooks[4] = new Notebook(5, "BradescoTech BD22BR","CPU AMD Phenon II, Memória 4 GB, HD 500 GB", 1900.00,"img\\bd22br.jpg"); 
 	 	} 

 	

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public boolean inserirItem(ItemDePedido item){ 
 	 	for (int i = 0; i < itens.length; i++){  	 	 	
 	 		if (itens[i] == null){  	 	 	 	
 	 			itens[i] = item;  	 	 	 	
 	 			return true; 
 	 	 	} 
 	 	} 
 	 	return false; 
 	} 

    
	public String getLogradouro() {
		return logradouro;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	

	public ItemDePedido[] getItens() {
		return itens;
	}

	public void setItens(ItemDePedido[] itens) {
		this.itens = itens;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	@Override
	public String toString() {
		return "Pedido [logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", bairro="
				+ bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", getLogradouro()="
				+ getLogradouro() + ", getNumero()=" + getNumero() + ", getComplemento()=" + getComplemento()
				+ ", getBairro()=" + getBairro() + ", getCidade()=" + getCidade() + ", getEstado()=" + getEstado()
				+ ", getCep()=" + getCep() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Pedido(String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public void mostrar() {
		// Mostrar usuário
		System.out.println("\n\nPedido:\n");
		System.out.println("Logradouro: " + this.logradouro);
		System.out.println("Complemento: " + this.complemento);
		System.out.println("Bairro: " + this.bairro);
		System.out.println("Cidade: " + this.cidade);
		System.out.println("Estado: " + this.estado);
		System.out.println("Cep : " + this.estado);
	
		System.out.println("\n\nItens do Pedido:\n"); 
 	 	for (int i = 0; i < itens.length; i++){  	 	 
 	 		if(itens[i] != null){ 
 	 	 	 	itens[i].mostrar(); 
 	 	 	}  	 	} 
	
	}
	
	
	

	public Pedido() {
		super();
		// super faz referência à super classe
		// toda classe java é sub classe da classe Object
	}
	
	
	
	
	
	
}