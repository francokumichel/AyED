package tp03.ejercicio1;

public class TestEjericicio1 {
	
	public static void main(String[] args) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(1);
		ArbolBinario<Integer> hi = new ArbolBinario<Integer>(2);
		ArbolBinario<Integer> hd = new ArbolBinario<Integer>(3);
		ArbolBinario<Integer> hi3 = new ArbolBinario<Integer>(4);
		
		hi3.agregarHijoDerecho(new ArbolBinario<Integer>(5));
		
/*
		hi.agregarHijoDerecho(new ArbolBinario<Integer>(5));
 
		hd.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));
		hd.agregarHijoDerecho(new ArbolBinario<Integer>(7));
*/		
		hi.agregarHijoIzquierdo(hi3);
		ab.agregarHijoIzquierdo(hi);
		ab.agregarHijoDerecho(hd);
		
		ArbolBinario<Integer> abVacio = new ArbolBinario<Integer>();
		
		
		
		System.out.println("Cantidad de hojas: " + ab.contarHojas());
		System.out.println("Cantidad de hojas: " + abVacio.contarHojas());
		ArbolBinario<Integer> espejo = ab.espejo();
		espejo.entreNiveles(0, 2);
		System.out.println();
		ab.entreNiveles(1, 2);
		System.out.println();
		System.out.println("Altura del arbol: " + ab.altura());
		System.out.println("Altura del arbol: " + abVacio.altura());
		
	}
}


/*

		Arbol de ejemplo:
		
		        1
		   
		   2         3

        4     5   6     7
*/