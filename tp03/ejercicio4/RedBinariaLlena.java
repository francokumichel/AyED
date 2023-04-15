package tp03.ejercicio4;

import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	
	private ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
	
	public RedBinariaLlena(ArbolBinario<Integer> ab) {
		this.ab = ab;
	}
	
	public int retardoReenvio() {
		return this.retardoReenvio(ab);
	}

/*	
	public int retardoReenvio(ArbolBinario<Integer> arbol) {
		
		// No es necesario preguntar si es vacio, ya que por enunciado es un arbol lleno
		if(arbol.esVacio()) {
			return -1;
		}
		
		int cant = -1;
		
		if(arbol.esHoja()) {
			return arbol.getDato();
		}else {
			
			// No es necesario preguntar si tiene HI o HD, ya que es un arbol lleno
			if(arbol.tieneHijoIzquierdo()) {
				cant = Math.max(cant, retardoReenvio(arbol.getHijoIzquierdo()));
			}
			if(arbol.tieneHijoDerecho()) {
				cant = Math.max(cant, retardoReenvio(arbol.getHijoDerecho()));
			}
		return cant + arbol.getDato();	
	
		}
	}
*/
	
	
	 public int retardoReenvio(ArbolBinario<Integer> arbol){
	 	// Caso base 
	 	if(arbol.esHoja()){
	 		return arbol.getDato();
	 	// Acá comienza la recursión	
	 	}else{
	 		return arbol.getDato() + Math.max(retardoReenvio(arbol.getHijoIzquierdo()), retardoReenvio(arbol.getHijoDerecho()));	 	
	 	}	 		 	
	 }
	 
}
