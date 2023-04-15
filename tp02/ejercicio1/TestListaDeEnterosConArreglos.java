package tp02.ejercicio1;

public class TestListaDeEnterosConArreglos {
	
	public static void main(String[] args) {
		ListaDeEnterosConArreglos li = new ListaDeEnterosConArreglos();
		
		TestListaDeEnteros test = new TestListaDeEnteros();
		
		test.agregarDatosALista(li, args);
		test.imprimirListaDeEnteros(li);
	}
}
