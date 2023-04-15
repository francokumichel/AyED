package tp02.ejercicio1;

public class ejercicio1_6 {
	
	private ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
	
	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		if(n != 1) {
			if(n % 2 == 0) {
				n = n/2;
			}else {
				n = 3*n+1;
			}
			this.l.agregarFinal(n);
			calcularSucesion(n);
		}
		return l;
	}
	
	public static void main(String[] args) {
		ejercicio1_6 f = new ejercicio1_6();
		
		ListaDeEnterosEnlazada l = f.calcularSucesion(6);
		System.out.println("Sucesión de n: ");
		l.comenzar();
		while(!l.fin()) {
			System.out.println(l.proximo());
		}
	}
}
