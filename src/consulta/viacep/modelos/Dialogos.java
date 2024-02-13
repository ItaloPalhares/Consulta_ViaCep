package consulta.viacep.modelos;

import java.util.Scanner;

public class Dialogos {
	
	
	public void inicia() {
		System.out.println("************************");
		System.out.println("Bem vindo ao ConsultaCep");
		System.out.println("************************");
	}
	
	public int opcoes() {
		System.out.println("Qual operação desejar realizar?");
		System.out.println("Digite '1' Consultar novo Cep");
		System.out.println("Digite '2' para Sair");
		Scanner input = new Scanner(System.in);
		int resposta = input.nextInt();
		return resposta;
	}
	
	public int salvar() {
		System.out.println("*************************");
		System.out.println("Deseja salvar o endereço?");
		System.out.println("Digite '1' para 'Sim'");
		System.out.println("Digite '2' para 'Não'");
		Scanner input = new Scanner(System.in);
		int resposta = input.nextInt();
		return resposta;
	}
	
	public void finaliza() {
	System.out.println("*********************");
	System.out.println("finalizando programa.");
	}
}
