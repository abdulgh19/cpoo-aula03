package mz.co.devtec.aula03.entidades;

public class Produto {
	
	public String codigo, designacao;
	public double quantidadeEmStock, precoDeCompra, precoVenda;

	public Produto() {
	}
	
	public Produto(String codigo, String designacao) {
		
		this.codigo = codigo;
		this.designacao = designacao;
	}

	public void adicionarProdutos(double quantidadePorAdicionar) {
		
		quantidadeEmStock +=quantidadePorAdicionar;
	}
	
	public void removerProdutos(double quantidadePorRemover) {
		
		quantidadeEmStock -=quantidadePorRemover;
	}
	
	public double totalEquivalenteNoStock() {
		
		return precoVenda * quantidadeEmStock;
	}
	
	public String toString() {
		return "codigo: " +codigo 
				+"\ndesignacao: " +designacao
				+ "\nquantidade em stock: " +quantidadeEmStock
				+"\npreco de compra: " +precoDeCompra + " MZN"
				+"\npreco de venda: " +precoVenda + " MZN"
				+"\nvalor equivalente em: "+ totalEquivalenteNoStock() + " MZN";
	}
		
}