package tp03.ejercicio3;

import tp02.ejercicio4.ListaEnlazadaGenerica;
import tp02.ejercicio4.ListaGenerica;
import tp03.ejercicio1.ArbolBinario;

public class ContadorArbol {
	
	private ArbolBinario<Integer> dato;
	
	public ContadorArbol(ArbolBinario<Integer> dato) {
		this.dato = dato;
	}
	
	public ListaGenerica<Integer> numerosPares(){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
//		this.numerosParesInOrden(lista, dato);
		this.numerosParesPostOrden(lista, dato);
		return lista;
	}
	
	
	public void numerosParesInOrden(ListaGenerica<Integer> lista, ArbolBinario<Integer> arbol){
		if(arbol.tieneHijoIzquierdo()) {
			this.numerosParesInOrden(lista, arbol.getHijoIzquierdo());
		}
		if(arbol.getDato() % 2 == 0) {
			lista.agregarFinal(arbol.getDato());
		}
		if(arbol.tieneHijoDerecho()) {
			this.numerosParesInOrden(lista, arbol.getHijoDerecho());
		}
	}
	
	public void numerosParesPostOrden(ListaGenerica<Integer> lista, ArbolBinario<Integer> arbol){
		if(arbol.tieneHijoIzquierdo()) {
			this.numerosParesInOrden(lista, arbol.getHijoIzquierdo());
		}
		if(arbol.tieneHijoDerecho()) {
			this.numerosParesInOrden(lista, arbol.getHijoDerecho());
		}
		if(arbol.getDato() % 2 == 0) {
			lista.agregarFinal(arbol.getDato());
		}
	}

}
