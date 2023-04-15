package tp03.ejercicio5;

import tp02.ejercicio4.ColaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario {
	private ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
	
	
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> ab) {
		this.ab = ab;
	}


	public int sumaElementosProfundidad(int p) {
		ArbolBinario<Integer> arbol;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(this.ab);
		cola.encolar(null);
		if(this.ab.esVacio()) {
			return -1;
		}
		int nivel = 0;
		int sumaElementos = 0;
		while ((!cola.esVacia()) && (nivel <= p)) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if(nivel == p) {
					sumaElementos += arbol.getDato();
				}
				if (arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
				}
				if (arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
				}	
			}else if(!cola.esVacia()) {
				System.out.println();
				cola.encolar(null);
				// Si llegué al nivel en cuestión, ya no sigo recorriendo el arbol
				if(nivel == p) {
					return sumaElementos;
				}
				nivel++;
			}
		}
		return sumaElementos;
	}
}
