package desafio6;

import java.util.Arrays;
import java.util.List;

	public class Retangulo {

	private double ladoA;
	private double ladoB;

	public void mudarValorDosLados(Double valorLadoA, Double valorLadoB) {
		this.ladoA = valorLadoA;
		this.ladoB = valorLadoB;
	}

	public List<Double> retornarValorDosLados(){
		return Arrays.asList(this.ladoA, this.ladoB);
	}

	public Double calcularArea() {
		return this.ladoA * this.ladoB;
	}

	public Double calcularPerímetro() {
		return (this.ladoA*2) + (this.ladoB *2);
	}
}

