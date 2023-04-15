package tp02.ejercicio4;

public class PilaGenerica<T> {

	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public void apilar(T elem) {
		datos.agregarEn(elem, 1);
	}
	
	public T desapilar() {
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
