package tp02.ejercicio4;

public class ColaGenerica <T>{
	
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void encolar(T elem) {
		this.datos.agregarFinal(elem);
	}
	
	public T desencolar() {
		T x = this.datos.elemento(1);
		this.datos.eliminarEn(1);
		return x;
	}
	
	public T tope() {
		return this.datos.elemento(1);
	}
	
	public boolean esVacia() {
		return this.datos.esVacia();
	}
	
}
