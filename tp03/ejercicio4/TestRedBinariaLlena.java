package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class TestRedBinariaLlena {
	
	public static void main(String[] args) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> hi = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> hd = new ArbolBinario<Integer>(3);
		hi.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
		hi.agregarHijoDerecho(new ArbolBinario<Integer>(5));
		hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(10));
		hd.agregarHijoDerecho(new ArbolBinario<Integer>(9));
		ab.agregarHijoIzquierdo(hi);
		ab.agregarHijoDerecho(hd);

		RedBinariaLlena red = new RedBinariaLlena(ab);
		ab.entreNiveles(0, 2);
		System.out.println();
		System.out.println("El retardo de reenvio máximo es de: " + red.retardoReenvio());
	}
}

/*

		Arbol de ejemplo:
		
		        1
		   
		   2         3
		
		4     5   10     9
		
*/