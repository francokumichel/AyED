package parcial1.ej1;

import tp03.ejercicio1.ArbolBinario;

public class TestParcial1 {
	
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
		
		Parcial parcial = new Parcial(ab, 9);
		
		System.out.println("La suma de los elementos es: " + parcial.sumaDeImparesPosOrderMayorA());
	}
	
/*

		Arbol de ejemplo:
		
		        1
		   
		   2         3
		
		4     5   6     7
	
*/
}
