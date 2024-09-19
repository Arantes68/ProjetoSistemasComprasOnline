package SistemaComprasOnline;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

/* ATRIBUTO COM INTERFACE LIST */
	private List<Itens> itensList;

/* CONSTRUTOR */	
	public CarrinhoDeCompras() {
		this.itensList = new ArrayList<>();
		}
	
/* MÉTODO ADICIONAR */
    public void adicionarItens(String nome, double preco, int quantidade) {
    	itensList.add(new Itens(nome,preco, quantidade));
    }
    
 /* MÉTODO REMOVER */   
    public void removerItem(String nome) {
    	/* CRIAÇÃO DA LISTA PARA ITENS SEREM REMOVIDOS */
    	List<Itens> itemParaRemover = new ArrayList<>(); 
    	/* PERCORRENDO A LISTA ITENS*/
    	for(Itens I : itensList) {
    		/* COMPARANDO O NOME DO ITEM COM O NOME FORNECIDO */
    		if(I.getNome().equalsIgnoreCase(nome)) {
    			itemParaRemover.add(I);
    		}
    	}
    	/* REMOVE TODOS OS ITENS DA LISTA itensList QUE ESTÃO NA LISTA itemParaRemover */
    	itensList.removeAll(itemParaRemover);
    }
    
/* MÉTODO CALCULAR VALORES */    
    public double calcularValorTotal() {
    	double soma = 0;
    	for (Itens I : itensList) {
    		soma += I.getPreco();
    	}
    	return soma;
    }
    
/* MÉTODO EXIBIR OS ITENS */    
    public void exibirItens() {
    	System.out.println(itensList);
    }
}
