package tp02.ejercicio1;

public class TestListaDeEnterosEnlazada {
	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada le = new ListaDeEnterosEnlazada();
		
		TestListaDeEnteros test = new TestListaDeEnteros();
		
		test.agregarDatosALista(le, args);
		test.imprimirListaDeEnteros(le);
	}
}
