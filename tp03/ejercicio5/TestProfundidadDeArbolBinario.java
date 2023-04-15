package tp03.ejercicio5;

import tp03.ejercicio1.ArbolBinario;

public class TestProfundidadDeArbolBinario {
	
	public static void main(String[] args) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> hi = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> hd = new ArbolBinario<Integer>(3);
		hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
		hi.agregarHijoDerecho(new ArbolBinario<Integer>(5));
		hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));
		hd.agregarHijoDerecho(new ArbolBinario<Integer>(7));
		ab.agregarHijoIzquierdo(hi);
		ab.agregarHijoDerecho(hd);
		
		ProfundidadDeArbolBinario profundidadAb = new ProfundidadDeArbolBinario(ab);
		
		System.out.println("Suma de elementos de nivel 1: " + profundidadAb.sumaElementosProfundidad(0));
		System.out.println("Suma de elementos de nivel 2: " + profundidadAb.sumaElementosProfundidad(1));
		System.out.println("Suma de elementos de nivel 3: " + profundidadAb.sumaElementosProfundidad(2));
		
		
		

		
		
		
/*

		Arbol de ejemplo:
		
		        1
		   
		   2         3

        4     5   6     7
        
        
*/
	}
}
