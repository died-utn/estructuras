package ar.edu.frsf.isi.died.estructuras.lineales.listas;

public class NodoVacio<T> implements Nodo<T> {

	
	@Override
	public T valor() {
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof NodoVacio;
	}

	@Override
	public Boolean esVacio() {
		return true;
	}

	@Override
	public Nodo siguiente() {
		return this;
	}

	@Override
	public void siguiente(Nodo n) {
		
	}
	
	
}
