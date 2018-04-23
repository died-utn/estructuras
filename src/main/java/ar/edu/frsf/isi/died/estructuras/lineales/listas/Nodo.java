package ar.edu.frsf.isi.died.estructuras.lineales.listas;

public interface Nodo<T>{

	public T valor();
	public Boolean esVacio();
	public Nodo siguiente();
	public void siguiente(Nodo n);
}
