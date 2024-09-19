package SistemaComprasOnline;

import java.util.InputMismatchException;
import java.util.Scanner;

/* CLASSE PRINCIPAL/ INTERFACE DO USUÁRIO*/
public class TesteComprasItens {

	public static void main(String[] args) {

/* OBJETOS INSTÂNCIADOS */		
		CarrinhoDeCompras cdc = new CarrinhoDeCompras();
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("                 [SISTEMA REGISTRA + ]                  ");
		System.out.println();
		System.out.println();
		
/* ATRIBUTO BOOLEAN */
	    boolean continuar = true;	
		
/* WHILE: VAI CONTINUAR O PROGRAMA, ATÉ QUE O USUÁRIO PARE: CONTINUAR = FALSE; */	    
	while(continuar) {	
		System.out.println("--------------------------------------------------------");
		System.out.println("Escolha uma opção: ");
		System.out.println();
		System.out.println("  [1] Adicionar itens ");
		System.out.println("  [2] Exibir item ");
		System.out.println("  [3] Remover item ");
		System.out.println("  [4] Sair ");
		System.out.println();
		System.out.println("--------------------------------------------------------");
		System.out.println();
		System.out.println();
	
		
/* ESCOLHA DA OPÇÃO DO SWITCH */		
	
		System.out.print("Digite a opção que deseja: ");
		int opcao = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
		System.out.println();
		
/* ESTRUTURA DE CASO */		
		switch (opcao) {
		case 1:
			System.out.print("Digite o nome do item: ");
			String nome = scan.nextLine();
			System.out.println();
			System.out.print("Digite o preço do item: ");
			double preco = scan.nextDouble();
			System.out.println();
			System.out.print("Digite a quantidade do item: ");
            int quantidade = scan.nextInt();
            scan.nextLine();
            System.out.println();
            cdc.adicionarItens(nome, preco, quantidade);
            System.out.print("Item adicionado com Sucesso!");
        	System.out.println();
    		System.out.println();
            break;
            
		case 2: 
			System.out.print("Verificar Itens no carrinho: ");
			cdc.exibirItens();
			break;
			
			
		case 3:
            System.out.print("Digite o nome do item a ser removido: ");
            String nomeParaRemover = scan.nextLine();
            cdc.removerItem(nomeParaRemover);
            System.out.println("Item removido com sucesso!");
            break;	
            
            
 /* DEFINE CONTINUAR COMO FALSE PARA SAIR DO LOOP E ENCERRAR O PROGRAMA */          
		case 4: 
			continuar = false;
			System.out.print("Saindo do sistema!");
			break;
			
			default:
				System.out.println("Opção inválida. Tente novamente.");
			break;
		 }
	  }
	   scan.close();
   }
}
