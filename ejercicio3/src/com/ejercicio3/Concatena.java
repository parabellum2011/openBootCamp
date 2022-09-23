package com.ejercicio3;

/*
 * Crear un bucle que permita concatenar textos y imprima el resultado final por consola.
Concatenar nombres
Los textos pueden venir de un array String
String[] nombres = {"", "", "", ""};
Separados por un espacio
Se puede usar el método concat o si no el operador + Ejemplo
"Pepe", "Juan", "Anthony" Resultado:
Pepe Juan Anthony (en la misma línea)
 */

public class Concatena {

	public static void main(String[] args) {

		String[] nombres = {"Pepe", "Jose", "Antonio", "Maria"};
		String separador =" ";
		String cadena ="";
		String cadenaConcat = "";
		
		for ( int i = 0; i<nombres.length; i++) {
			
			separador =" ";
			
			if (i == nombres.length-2) {
				separador = " y ";
			}
			
			cadena += nombres[i] + separador; 

			cadenaConcat = cadenaConcat.concat(nombres[i]).concat(separador);
		}
		
		System.out.println("concatenacion con +: " + cadena);
		System.out.println("concatenacion con concat: " + cadenaConcat);
		
		
	}

}
