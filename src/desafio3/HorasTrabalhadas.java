package desafio3;

import java.util.Scanner;

public class HorasTrabalhadas {

	/*Receba o número de horas trabalhadas por uma pessoa e o valor do
	salário mínimo e mostre o salário a receber baseado nas seguintes regras:
	A hora trabalhada equivale a 10% do salário mínimo informado;
	O salário bruto é dado pelo número de horas trabalhadas multiplicado pelo
	valor de cada hora;
	O imposto pago é de 3%.
	O salário a receber é equivalente ao salário bruto subtraído do imposto.*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int horasTrabalhadas;
		double salarioMinimo;
		double valorHoraTrabalhada;
		double salarioBruto;
		double salarioLiquido;
		
		System.out.println("Informe as horas trabalhadas:");
		horasTrabalhadas = ler.nextInt();
		
		System.out.println("Informe o salário mínimo:");
		salarioMinimo = ler.nextDouble();
		
		ler.close();
		
		valorHoraTrabalhada = salarioMinimo * 0.1;
		
		salarioBruto = valorHoraTrabalhada * horasTrabalhadas;
		
		salarioLiquido = salarioBruto - (salarioBruto/100 * 3);
		
		System.out.println("O salário a receber é: " + salarioLiquido);	

	}
}	
