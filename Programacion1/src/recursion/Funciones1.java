package recursion;

public class Funciones1 {

	public static int longitud(String s) {

		if (s.isEmpty()) {
			return 0;
		}

		return 1 + longitud(s.substring(1));
	}

	public static void imprimirEspaciado(String s) {

		if (s.isEmpty()) {
			System.out.println();
			return;
		}

		System.out.print(s.charAt(0) + " ");
		imprimirEspaciado(s.substring(1));
	}

	public static void imprimirEspaciado2(String s) {

		if (s.length() <= 1) {
			System.out.println(s);
			return;
		}

		System.out.print(s.charAt(0) + "*");
		imprimirEspaciado2(s.substring(1));
	}

	public static String combinar(String s, String t) {

		if (s.isEmpty() || t.isEmpty()) {
			return s + t;
		}

		if (s.charAt(0) > t.charAt(0)) {
			return t.charAt(0) + combinar(s.substring(1), t.substring(1));
		}
		return s.charAt(0) + combinar(s.substring(1), t.substring(1));
	}

	public static boolean esAbecedaria(String s) {

		if (s.length() <= 1) {
			return true;
		}

		if (s.charAt(0) > s.charAt(1)) {
			return false;
		}
		return esAbecedaria(s.substring(1));
	}

	public static String espejar(String s) {

		if (s.isEmpty()) {
			return s;
		}

		return s.charAt(0) + espejar(s.substring(1)) + s.charAt(0);
	}

	public static String repetirLetras(String s) {

		if (s.length() <= 1) {
			return s;
		}

		if (esVocal(s.charAt(0)) && esVocal(s.charAt(1))) {
			return "" + s.charAt(0) + s.charAt(0) + repetirLetras(s.substring(1));
		}
		if (!esVocal(s.charAt(0)) && !esVocal(s.charAt(1))) {
			return "" + s.charAt(0) + s.charAt(0) + s.charAt(0) + repetirLetras(s.substring(1));
		}
		return s.charAt(0) + repetirLetras(s.substring(1));
	}

	public static boolean esVocal(char a) {
		String aux = "aeiou";
		aux += aux.toUpperCase();

		return aux.indexOf(a) != -1;
	}

	public static String reemplazarCaracter(String s, char original, char nuevo) {

		if (s.isEmpty()) {
			return s;
		}

		if (s.charAt(0) == original) {
			return nuevo + reemplazarCaracter(s.substring(1), original, nuevo);
		}
		return s.charAt(0) + reemplazarCaracter(s.substring(1), original, nuevo);

	}

	public static String cambiarConsonante(String s, char r) {

		if (s.isEmpty()) {
			return s;
		}

		if (!esVocal(s.charAt(0))) {
			return r + cambiarConsonante(s.substring(1), r);
		}
		return s.charAt(0) + cambiarConsonante(s.substring(1), r);
	}
	
	// Utilizando Funcion Auxiliar
		public static String reverso(String s) {

			/*if (s.isEmpty()) {
				return s;
			}
			
			return reverso(s.substring(1)) + s.charAt(0);
			*/
			
			return reverso(s,0);
		}
		
		public static String reverso(String s, int cont) {

			if (s.isEmpty()) {
				System.out.println(cont);
				return s;
			}
			cont++;
			return reverso(s.substring(1),cont) + s.charAt(0);
		}
		
		// Utilizando Funcion Auxiliar
		public static int cantDiv(int n,int d,int h) {
			
			if(d > h ) {
				return 0;
			}
			
			return ( n%d == 0 ? 1 : 0 ) + cantDiv( n, d+1, h );
			
			
		}
		
		public static int cantDiv(int n) {
			
			return cantDiv(n, 1, n );
		}
		
		public static int cantDiv(int n,int i) {
			
			if( i > n) {
				return 0;
			}
			
			return ( n%i == 0 ? 1 : 0 ) + cantDiv( n, i+1 );
			
		}
		
		// Utilizando Funcion Auxiliar
		public static void imprimirApariciones(String s) {
			
			imprimirApariciones( s, 0, "" );
		}
		
		public static void imprimirApariciones(String s, int i, String acumulador) {
			
			if(i >= s.length()) {
				return;
			}
			
			if(acumulador.indexOf(s.charAt(i)) == -1 ) {
				System.out.println( s.charAt(i) +  " :" + cantidadDeApariciones(s, s.charAt(i)));
			}
			
			imprimirApariciones(s,i+1,acumulador + s.charAt(i));
			
		}
		
		public static int cantidadDeApariciones(String s, char c) {
			
			if(s.isEmpty()) {
				return 0;
			}
			
			
			if(s.charAt(0) == c) {
				return 1 + cantidadDeApariciones(s.substring(1),c);
			}
			
			return cantidadDeApariciones(s.substring(1),c);
			
		}
		
		// Utilizando Funcion Auxiliar y Arrays
		public static int sumarElementos(int[] elementos) {
			
			return sumarElementos(elementos, 0);
		}
		
		public static int sumarElementos(int[] elementos, int i) {
			
			if(i >= elementos.length) {
				return 0;
			}
			
			return elementos[i] + sumarElementos(elementos, i+1);
			
		}
		
		// Utilizando Funcion Auxiliar y Arrays
		public static boolean buscarElemento(int[] a, int item) {
			
			return buscarElemento(a, item, 0);
			
		}
		
		public static boolean buscarElemento(int[] a, int item, int i) {
			
			if( i >= a.length) {
				return false;
			}
			
			if(a[i] == item) {
				return true;
			}
			
			return buscarElemento(a,item,i+1);
		}
		
		public static int max(int[] a, int i, int max) {
			
			if(a[i] > max) {
				max = a[i];
			}
			
			return max(a,i+1,max);
			
		}
		
		
		
}