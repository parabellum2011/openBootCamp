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
		String cadena ="";
		String cadenaConcat = "";
		
		for ( int i = 0; i<nombres.length; i++) {
			cadena += nombres[i]+" "; 
			cadenaConcat = cadenaConcat.concat(nombres[i]).concat(" ");
		}
		
		System.out.println(cadena);
		System.out.println(cadenaConcat);
		
		
	}

}
