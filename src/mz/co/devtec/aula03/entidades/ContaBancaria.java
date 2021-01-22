package mz.co.devtec.aula03.entidades;

public class ContaBancaria {
	
	public int numeroConta;
	public double saldo;
	public String titularDaConta;

	//Construtor Vazio
	public ContaBancaria() {

	}
	
	//Construtor com 1 parametro
	public ContaBancaria(int numeroConta) {
		
		this.numeroConta = numeroConta;
	}
	
	//Construtor com dois parametros
	public ContaBancaria(int numeroConta, String titularDaConta) {
		
		this.numeroConta = numeroConta;
		this.titularDaConta = titularDaConta;
	}	

}


