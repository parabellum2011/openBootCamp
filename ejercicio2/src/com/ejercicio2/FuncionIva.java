package com.ejercicio2;

public class FuncionIva {

	public static void main(String[] args) {

		double base = 100;
		double total=0;
		total = calculaIva(base);
		
		System.out.println("El total para la base " + base + " es: " + total);
		
	}

	public static double calculaIva(double base) {
		double total = base * 1.21;
		return total;
	}
}
