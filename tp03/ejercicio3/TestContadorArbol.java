package tp03.ejercicio3;

import tp02.ejercicio4.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class TestContadorArbol {
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
		
		ContadorArbol contador = new ContadorArbol(ab);
		ListaGenerica<Integer> listaInOrden = contador.numerosPares();
		
		listaInOrden.comenzar();
		while(!listaInOrden.fin()) {
			System.out.print(listaInOrden.proximo());
		}
	}

}
