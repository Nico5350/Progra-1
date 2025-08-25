package recursion;

public class Funciones {
	
	public static int longitud(String s) {
		
		if(s.isEmpty()) {
			return 0;
		}
		
		return 1 + longitud( s.substring(1) );
	}
	
	public static void imprimirEspaciado(String s) {
		
		if(s.isEmpty()) {
			System.out.println();
			return;
		}
		
		System.out.print(s.charAt(0) + " ");
		imprimirEspaciado( s.substring(1) );
	}
	
public static void imprimirEspaciado2(String s) {
		
		if(s.length() <= 1) {
			System.out.println(s);
			return;
		}
		
		System.out.print(s.charAt(0) + "*");
		imprimirEspaciado2( s.substring(1) );
	}

	public static String reverso(String s) {
		
		if(s.isEmpty()) {
			return s;
		}
		
		return reverso(s.substring(1)) + s.charAt(0);
	}
	
	public static String combinar(String s, String t) {
		
		if(s.isEmpty() || t.isEmpty()) {
			return  s+t;
		}
		
		if( s.charAt(0) > t.charAt(0)) {
			return t.charAt(0) + combinar(s.substring(1),t.substring(1));
		}
		return s.charAt(0) + combinar(s.substring(1),t.substring(1)); 
	}
	
	 public static boolean esAbecedaria(String s) {
		 
		 if(s.length() <= 1) {
			 return true;
		 }
		 
		 if(s.charAt(0) > s.charAt(1)) {
			 return false;
		 }
		 return esAbecedaria(s.substring(1));
	 }
	 
	 public static String espejar(String s) {
		 
		 if(s.isEmpty()) {
			 return s;
		 }
		 
		 return s.charAt(0) + espejar(s.substring(1)) + s.charAt(0);
	 }
	 
	 public static String repetirLetras(String s) {
		 
		 if(s.length() <= 1){
			 return s;
		 } 
		 
		 if(esVocal(s.charAt(0)) && esVocal(s.charAt(1))) {
			 return "" + s.charAt(0) + s.charAt(0) + repetirLetras(s.substring(1)); 
		 }
		 if(!esVocal(s.charAt(0)) && !esVocal(s.charAt(1))) {
			 return "" + s.charAt(0) + s.charAt(0) + s.charAt(0) + repetirLetras(s.substring(1)); 
		 }
		 return s.charAt(0) + repetirLetras(s.substring(1));
	 }
	 
	 public static boolean esVocal(char a) {
		 String aux= "aeiou";
		 aux += aux.toUpperCase();
		 
		 return aux.indexOf(a) != -1; 
	 }
	 
	 public static String reemplazarCaracter(String s,char original ,char nuevo) {
		 
		 if(s.isEmpty()) {
			 return s;
		 }
		 
		 if(s.charAt(0) == original) {
			 return nuevo + reemplazarCaracter(s.substring(1),original,nuevo);
		 }
		 return s.charAt(0) + reemplazarCaracter(s.substring(1),original,nuevo);
		 
	 }
}