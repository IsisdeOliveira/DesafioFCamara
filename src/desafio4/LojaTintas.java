package desafio4;

import java.util.Scanner;

public class LojaTintas {
	
	/*Faça um programa para uma loja de tintas. O programa deverá pedir o
	tamanho em metros quadrados da área a ser pintada. Considere que a
	cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é
	vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a
	quantidades de latas de tinta a serem compradas e o preço total.*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int area;
		int capacidadeLata = 18*3;
		int precoLata = 80;
		int qtdLatas;
		int precoTotal;
		
		System.out.println("Informe a área a ser pintada:");
		area = ler.nextInt();
		
		ler.close();
		
		qtdLatas = area/capacidadeLata;
		precoTotal = qtdLatas * precoLata;
		
		
		System.out.println("A quantidade de latas necessária é: " + qtdLatas);
		System.out.println("O valor total é: R$" + precoTotal);
				
		
	}
}
