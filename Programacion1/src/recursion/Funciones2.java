package recursion;

public class Funciones2 {

	// RECURSION CON FUNCIONES AUXILIARES
	// true -> +3 vocales
	public static boolean masTresVocales(String s) {
		return contarVocales(s) >= 3;
	}

	public static int contarVocales(String s) {
		// caso base
		if (s.isEmpty()) {
			return 0;
		}
		// caso recursivo
		if (esVocal(s.charAt(0))) {
			return 1 + contarVocales(s.substring(1));
		}
		return contarVocales(s.substring(1));
	}

	public static boolean esVocal(char c) {
		String aux = "aeiou";
		aux = aux + aux.toUpperCase();
		return aux.indexOf(c) != -1;
	}

	public static boolean esConsonante(char c) {
		String aux = "bcdfghjklmnpqrstvwxyz";
		aux = aux + aux.toUpperCase();
		return aux.indexOf(c) != -1;
	}

	// RECURSION CON ARGUMENTOS AUXILIARES
	public static String separarVocales(String s) {
		// caso base
		if (s.isEmpty()) {
			return s;
		}
		// caso recursivo
		if (esVocal(s.charAt(0))) {
			return s.charAt(0) + separarVocales(s.substring(1));
		}

		return separarVocales(s.substring(1)) + s.charAt(0);

	}

	public static String separarLetras(String s) {
		return separarLetras(s, "vocales: ", " simbolos: ", " consonantes: ");
	}

	public static String separarLetras(String s, String vocales, String simbolos, String consonantes) {
		// caso base
		if (s.isEmpty()) {
			return vocales + simbolos + consonantes;
		}
		// Caso Recursivo
		// vocal
		if (esVocal(s.charAt(0))) {
			return separarLetras(s.substring(1), vocales + s.charAt(0), simbolos, consonantes);
		}

		if (esConsonante(s.charAt(0))) {
			return separarLetras(s.substring(1), vocales, simbolos, consonantes + s.charAt(0));
		}

		return separarLetras(s.substring(1), vocales, simbolos + s.charAt(0), consonantes);
	}

	public static int cantDivisores(int n) {
		return cantDivisores(n, 1);
	}

	public static int cantDivisores(int n, int i) {
		// caso base
		if (i > n) {
			return 0;
		}
		// caso recursivo
		if (n % i == 0) {
			return 1 + cantDivisores(n, i + 1);
		}

		return cantDivisores(n, i + 1);
	}

	public static String divisores(int n) {
		return divisores(n, "", 1);
	}

	private static String divisores(int n, String s, int i) {
		// caso base
		if (i > n) {
			return s.substring(0, s.length() - 1);
		}
		// caso recursivo
		if (n % i == 0) {
			return divisores(n, s + i + " -", i + 1);
		}
		return divisores(n, s, i + 1);

	}

	// EJERCICIO PARCIAL
	public static int log(int n, int b) {
		// caso base
		if (n / b == 0) {
			return 1;
		}
		// caso recursivo
		return 1 + log(n / b, b);
	}

	public static boolean seLeeEn(String s1, String s2) {
		// caso base
		if (s1.isEmpty()) {
			return true;
		}
		if (s2.isEmpty()) {
			return false;
		}

		// caso recursivo
		if (s1.charAt(0) == s2.charAt(0)) {
			return seLeeEn(s1.substring(1), s2.substring(1));
		}
		return seLeeEn(s1, s2.substring(1));
	}

	public static String eliminarYDuplicar(String s, int n) {
		// caso base
		if (s.isEmpty()) {
			return s;
		}
		// caso recursivo
		if (n > 0) {
			return s.charAt(0) + eliminarYDuplicar(s.substring(1), n - 1);
		}
		if (esVocal(s.charAt(0))) {
			return eliminarYDuplicar(s.substring(1), n);
		}
		return "" + s.charAt(0) + s.charAt(0) + eliminarYDuplicar(s.substring(1), n);

	}

}





