package ar.edu.frsf.isi.died.estructuras.lineales.listas;

public class NodoSimple<T> implements Nodo<T> {

	private T valor; 
	private Nodo siguiente;
	
	public NodoSimple(T valor) {
		this.valor=valor;
		this.siguiente=new NodoVacio<>();
	}
	
	@Override
	public T valor() {
		// TODO Auto-generated method stub
		return valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Nodo && ((Nodo) obj).valor().equals(this.valor);
	}

	@Override
	public Boolean esVacio() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Nodo siguiente() {
		// TODO Auto-generated method stub
		return this.siguiente;
	}

	@Override
	public void siguiente(Nodo n) {
		this.siguiente=n;
	}
	
	
}
