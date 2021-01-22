package mz.co.devtec.aula03.main;

import java.util.Scanner;

import mz.co.devtec.aula03.entidades.Produto;
public class ExecutaProduto {
	public static void main(String[] args) {		
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		Produto produto = new Produto();	
		
		double quantidadeAdicionada;		
		
		System.out.println("Informe o codigo do produto:");
		produto.codigo = entradaPorTeclado.nextLine();	
		
		System.out.println("Informe a designacao do produto:");
		produto.designacao = entradaPorTeclado.nextLine();	
		
		System.out.println("Informe a quantidade inicial do produto em Stock:");
		produto.quantidadeEmStock = entradaPorTeclado.nextDouble();
		
		System.out.println("Informe o preco pelo qual o produto foi comprado:");
		produto.precoDeCompra = entradaPorTeclado.nextDouble();	
		
		System.out.println("Por quanto o produto vai ser vendido?");
		produto.precoVenda = entradaPorTeclado.nextDouble();				
		
		System.out.println("# ---------- Supermercado Devtec ---------- #");
		System.out.println();
		System.out.println("Relatorio de produto");
		System.out.println();
		System.out.println(produto.codigo +", " + produto.designacao +", " +produto.precoDeCompra +", " +produto.quantidadeEmStock + ", " +produto.precoVenda);
		System.out.println();	
		
		System.out.println("Quantos produtos deseja adicionar ao Stock?");	
		quantidadeAdicionada = entradaPorTeclado.nextDouble();	
		
		produto.adicionarProdutos(quantidadeAdicionada);
		
		System.out.println(produto);	
		
		
	//Outra instancia de produto
		
		System.out.println("Informe o codigo do outro produto:");
		String codigo = entradaPorTeclado.nextLine();
		
		System.out.println("Informe o codigo do outro produto:");
		String designacao = entradaPorTeclado.nextLine();	
		
		Produto outroProduto = new Produto(codigo, designacao);
		
		System.out.println(outroProduto);
		
		entradaPorTeclado.close();
	}
	

	

}
