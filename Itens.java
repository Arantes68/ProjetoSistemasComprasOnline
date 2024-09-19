package SistemaComprasOnline;

public class Itens {

/* ATRIBUTO */
	private String nome;
	private double preco;
	private int quantidade;
	
	
/* CONSTRUTOR */	
	public Itens(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}


/* MÉTODO ESPECIAL: GET E SET */	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Itens: \n\n Produtos= " + nome + "\n\n Preço= " + preco + "\n\n Quantidade= " + quantidade + "\n\n";
	}
}
