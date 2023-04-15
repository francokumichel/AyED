package tp02.ejercicio1;

public class TestListaDeEnteros {
	
	public void agregarDatosALista(ListaDeEnteros l, String[] argumentos) {
				
		if(argumentos.length == 0) {
			System.out.println("No se han recibido parámetros");	
		}else if (argumentos.length > 1) {
			int num = 0;
			Integer numero;
			while(num < argumentos.length) {
				numero = Integer.parseInt(argumentos[num]);
				num++;
				l.agregarFinal(numero);
			}
		}
	}
	
	public void imprimirListaDeEnteros(ListaDeEnteros l) {
		l.comenzar();
		while(!l.fin()) {
			System.out.println(l.proximo());
		}
	}
	
	public void imprimirEnSentidoInverso(ListaDeEnteros l, int puntero) {
		if(puntero <= l.tamanio()) {
			this.imprimirEnSentidoInverso(l, puntero + 1);
			System.out.println(l.elemento(puntero));
		}
	}
}
