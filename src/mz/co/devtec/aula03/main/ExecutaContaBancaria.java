package mz.co.devtec.aula03.main;

import java.util.Scanner;

import mz.co.devtec.aula03.entidades.ContaBancaria;

public class ExecutaContaBancaria {

	public static void main(String[] args) {
		
		Scanner entradaPOrTeclado = new Scanner(System.in);
		
		ContaBancaria contaBancaria = new ContaBancaria(23456789);
		
		contaBancaria.saldo = 234564.07;
		contaBancaria.titularDaConta = "Fulano qualquer";
		
		
		ContaBancaria contaBancaria2 = new ContaBancaria();
		
		
		ContaBancaria contaBancaria3 = new ContaBancaria(54545, "Abdul");
		
		contaBancaria2.saldo = 12.07;
		contaBancaria2.titularDaConta = "Beltrano po ai";
		
		ContaBancaria contaBancaria4 = new ContaBancaria(4567, "Nataniel");

		System.out.println(contaBancaria);
		
		System.out.println();
		
		System.out.println(contaBancaria2);
		System.out.println(contaBancaria4);
		
		
		entradaPOrTeclado.close();

	}

}
