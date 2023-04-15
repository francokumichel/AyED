package tp02.ejercicio4;

import java.util.Scanner;

public class TestBalanceo {
	
	public static boolean esBalanceado(String str) {
		ListaEnlazadaGenerica<Character> inicio = new ListaEnlazadaGenerica<Character>();
		ListaGenerica<Character> cierre = new ListaEnlazadaGenerica<Character>();
		PilaGenerica<Character> pila = new PilaGenerica<Character>();
		Character ant, act;
		
		inicio.agregarFinal('(');
		inicio.agregarFinal('[');
		inicio.agregarFinal('{');
		
		cierre.agregarFinal(')');
		cierre.agregarFinal(']');
		cierre.agregarFinal('}');

		for(int i=0; i < str.length(); i++) {
			act = str.charAt(i);
			if(inicio.incluye(act)) {
				pila.apilar(act);
			}else if ((cierre.incluye(act)) && !(pila.esVacia())) {
				ant = pila.desapilar();
				if(!((act.equals(')') && ant.equals('(')) || (act.equals(']') && ant.equals('[')) || (act.equals('}') && ant.equals('{')))){
					return false;
				}else {
					return true;
				}
			}
		}
		if(!pila.esVacia()) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese una cadena de caracteres que contenga solo alguno de estos caracteres: (,),[,],{,} ");
		String str = s.next();
		s.close();
		
		if(esBalanceado(str)) {
			System.out.println("El String esta balanceado");	
		}else {
			System.out.println("El String no esta balanceado");
		}
		
	}
}
