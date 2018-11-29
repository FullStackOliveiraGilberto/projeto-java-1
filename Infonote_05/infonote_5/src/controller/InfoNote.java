package controller;

import model.*;
import util.*;

public class InfoNote {
	public static void main(String[] args) {
		int opcao = 8;
		do {
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua op��o: ");
			switch (opcao) {
			case 1:
				info.efetuarLogin();
				break;
			case 2:
				info.cadastrarUsuario();
				break;
			case 3:
				info.buscarNotebook();
				break;
			case 4:
				info.manterCarrinho();
				break;
			case 5:
				info.manterCarrinho();
				break;
			case 6:
				info.manterCarrinho();
				break;
			case 7:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}
			case 8:
				System.out.println("Sa�da do Sistema.");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");

		} while (opcao != 8);
	}

	Usuario user;
	boolean logado = false;
	int opcao = 8;

	public void mostrarMenu() {
		System.out.println("=================================================");
		System.out.println(" InfoNote - Se n�o � Info n�o vendemos. ");
		System.out.println("=================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");
		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Login efetuado com sucesso.");
			logado = true;
		} else {
			System.out.println("Login ou Senha inv�lido.");
			efetuarLogin();
		}
	}

	public void cadastrarUsuario() {
		System.out.println("");
		System.out.println(" InfoNote - Cadastro de Usu�rios. ");
		System.out.println("=================================================");
		int matricula = Teclado.lerInt("Matr�cula: ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");
		user = new Usuario(matricula, login, senha, nome, email, telefone);
		System.out.println("=================================================");
		System.out.println(" Usu�rio Cadastrado Com Sucesso. ");
		System.out.println("=================================================");
		System.out.println(user);
	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Constru��o");
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Constru��o");
	}

	
	
	
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;
	
	static InfoNote info = new InfoNote();

			
	public void buscarNotebook() {  	 	
		for (int i = 0; i < notebooks.length; i++){  	
			if(notebooks[i] != null){ 
	 	 	 	System.out.println(notebooks[i].getNumeroNote()+"-----"+notebooks[i].getModelo()); 
 	 	 	} 
 	 	} 
 	} 
		
			

	public void inserirNotebook() {
		// L� o notebook escolhido do teclado
		String numeroNote = Teclado.lerTexto("Informe o n�mero do notebook" + " para compra: ");

		//Cria pedido
		if (pedido == null) { 
	 	 	pedido = new Pedido(); 
	 	}
		
		// Busca notebook selecionado 
		Notebook aux = null;
		
		for (int i = 0; i < notebooks.length; i++){
			if (notebooks[i] != null && numeroNote.equals(notebooks[i].getNumeroNote())){ 
	 	 	 	aux = notebooks[i]; 
	 	 	} 
	 	if (aux == null){ 
	 	 	return; 
	 	} 
	    // Se n�o existir, interrompe 
	 	 ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux); 
	 	 
	 	//Insere item no pedido 
	 	 	pedido.inserirItem(item); 


	}
	
	
	// Busca notebook selecionado Notebook 
		aux = null; 
		for (int i = 0; i <	 notebooks.length; i++)
		{ 
			if (notebooks[i] != null && numeroNote.equals(notebooks[i].getNumeroNote()
			
					)
		)
 
    {
		aux = notebooks[i];
	}
	}

	// Se n�o existir, interrompe
	ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);

	if(aux==null)
	{
		return;
	}

	// Cria item
	// Insere item no pedido
	pedido.inserirItem(item);

}

}

