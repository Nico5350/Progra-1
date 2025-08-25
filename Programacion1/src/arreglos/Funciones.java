package arreglos;

import java.util.Scanner;

public class Funciones {
	
	public static int[] sinRepetidos(int[] a) {
		int[] resul = new int[a.length-cantidadDeRepetidos(a)];
		int j =0;
		for(int x=0;x<a.length;x++) {
			boolean flag = false;
			for(int i=x+1;i<a.length;i++) {
				if(a[x] == a[i]) {
					flag = true;
				}
			}
			if(!flag) {
				resul[j]=a[x];
				j++;
			}
		}
		return resul;
	}
	
	public static int cantidadDeRepetidos(int[] a) {
		int cont =0;
		for(int j =0;j<a.length;j++) {
			for(int x=j+1;x<a.length;x++) {
				if(a[j] == a[x]) {
					cont++;
					break;
				}
			}
		}
		return cont;
	}
	
	public static int[] opuestos(int[] a) {
		int[] opuesto = new int[a.length];
		for(int x =0;x<a.length;x++) {
			opuesto[x] = - a[x];
		}
		return opuesto;
	}
	
	public static int[] quitar(int[] a, int i) {
		int[] nuevo = new int[a.length-1];
		//System.arraycopy(a,0,nuevo,0,i);
		//System.arraycopy(a,i+1,nuevo,i,a.length-i-1);
		/*for(int x=0;x<i;x++) {
			nuevo[x]= a[x];
		}
		for(int x=i;x<a.length;x++) {
			nuevo[x-1]= a[x];
		}*/
		int ite= 0;
		for(int x=0;x<a.length;x++) {
			if(x == i) {
				ite--;
			}
			
			nuevo[ite]= a[x];
			ite++;
		}
		
		return nuevo;
	}
	
	public static int[] agregarAtras(int[] a, int item) {
		int[] nuevo = new int[a.length+1];
		System.arraycopy(a, 0, nuevo, 0, a.length);
		/*for(int x=0;x<a.length;x++) {
			nuevo[x] = a[x];
		}*/
		nuevo[a.length] = item;
		return nuevo;
	}
	
	public static int[] reverso(int[] a) {
		int[] rever = new int[a.length];
		for(int x=0;x<rever.length;x++) {
			rever[x]= a[a.length-1-x];
		}
		return rever;
	}
	
	public static int max(int[] a) {
		int max = a[0];
		for(int x=0;x<a.length;x++) {
			if(a[x]>max) {
				max =a[x];
			}
		}
		return max;
	}
	
	
	public static double promedio(int[] a) {
		double prom = 0;
		for(int x=0;x<a.length;x++) {
			prom += a[x];
		}
		return prom/a.length;
	}
	
	public static int[] rango(int m, int n) {
		int[] resul = new int[n-m+1];
		for(int x=0;x<resul.length;x++) {
			resul[x] =  m+x;
		}
		return resul;
	}
	
	public static int[] pedirArray(int n) {
		int[] arreglo = new int[n];
		for(int i=0; i<arreglo.length;i++) {
			arreglo[i] = ingresarEntero("Ingrese la posicion " + i);
		}
		return arreglo;
	}
	
	public static double[] pedirArrayD(int n) {
		double[] arreglo = new double[n];
		for(int i=0; i<arreglo.length;i++) {
			arreglo[i] = ingresarDouble("Ingrese la posicion " + i);
		}
		return arreglo;
	}
	
	
	public static int ingresarEntero(String mensaje) {
		Scanner lector = new Scanner(System.in);
		System.out.println(mensaje);
		int a = lector.nextInt();
		return a;
	}
	
	public static double ingresarDouble(String mensaje) {
		Scanner lector = new Scanner(System.in);
		System.out.println(mensaje);
		double a = lector.nextDouble();
		return a;
	}
	
	
	public static void imprimirArray(int[] a) {
		System.out.print("[ ");
		
		for(int i =0; i< a.length-1;i++) {
			System.out.print(a[i] + ", ");
		}
		
		
		System.out.println(a[a.length-1] + " ]");
	}
	
	public static void imprimirArray(double[] a) {
		System.out.print("[ ");
		
		for(int i =0; i< a.length-1;i++) {
			System.out.print(a[i] + ", ");
		}
		
		
		System.out.println(a[a.length-1] + " ]");
	}
}
