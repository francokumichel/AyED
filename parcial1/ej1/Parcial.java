package parcial1.ej1;

import tp03.ejercicio1.ArbolBinario;

public class Parcial {

	private ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
	private int limite;
	
	public Parcial(ArbolBinario<Integer> ab, int limite) {
		this.ab = ab;
		this.limite = limite;
	}
	
	private int sumaDeImparesPosOrderMayorA(ArbolBinario<Integer> ab, int limite) {
		int suma = 0;
		if(ab.tieneHijoIzquierdo()) {
			suma += sumaDeImparesPosOrderMayorA(ab.getHijoIzquierdo(), limite);
		}
		if(ab.tieneHijoDerecho()) {
			suma += sumaDeImparesPosOrderMayorA(ab.getHijoDerecho(), limite);
		}
		if(((ab.getDato() % 2 == 1) && (ab.getDato() < limite))) {
			suma += ab.getDato();
		}
		return suma;
	}
	
	public int sumaDeImparesPosOrderMayorA() {
		return sumaDeImparesPosOrderMayorA(ab, limite);
	}
}
