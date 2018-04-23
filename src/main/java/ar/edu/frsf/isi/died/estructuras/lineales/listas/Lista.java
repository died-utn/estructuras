package ar.edu.frsf.isi.died.estructuras.lineales.listas;

public interface Lista<T> {

	public void agregar(T t);
	public void borrar(T t);
	public void actualizar(T t1,T t2);
	public void agregarEn(T t,int indice);
	public Integer tamanio();
	public Boolean pertenece(T t);
	public void imprimir();
	
}
