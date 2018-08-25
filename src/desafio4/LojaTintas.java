package desafio4;

import java.util.Scanner;

public class LojaTintas {
	
	/*Fa�a um programa para uma loja de tintas. O programa dever� pedir o
	tamanho em metros quadrados da �rea a ser pintada. Considere que a
	cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a tinta �
	vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usu�rio a
	quantidades de latas de tinta a serem compradas e o pre�o total.*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int area;
		int capacidadeLata = 18*3;
		int precoLata = 80;
		int qtdLatas;
		int precoTotal;
		
		System.out.println("Informe a �rea a ser pintada:");
		area = ler.nextInt();
		
		ler.close();
		
		qtdLatas = area/capacidadeLata;
		precoTotal = qtdLatas * precoLata;
		
		
		System.out.println("A quantidade de latas necess�ria �: " + qtdLatas);
		System.out.println("O valor total �: R$" + precoTotal);
				
		
	}
}
