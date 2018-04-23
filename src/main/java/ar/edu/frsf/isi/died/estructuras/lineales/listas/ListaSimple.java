package ar.edu.frsf.isi.died.estructuras.lineales.listas;

public class ListaSimple<T> implements Lista<T>{

	private Nodo head;
	
	public ListaSimple() {
		this.head = new NodoVacio<T>();
	}
	
	@Override
	public void agregar(T t) {
		this.ultimo().siguiente(new NodoSimple(t));
	}
	
	private Nodo ultimo() {
		Nodo actual = this.head;
		while(!actual.esVacio()) {
			actual = actual.siguiente();
		}
		return actual;
	}

	@Override
	public void borrar(T t) {
		Nodo<T> buscado = new NodoSimple(t);
		Nodo<T> anterior= null;
		Nodo<T> actual = this.head;
		while(!actual.equals(buscado)) {
			anterior = actual;
			actual = actual.siguiente();
		}
		if(actual.esVacio()) return;
		else {
			anterior.siguiente(actual.siguiente());
		}
	}

	@Override
	public void actualizar(T valorBuscado, T valorNuevo) {
		Nodo nuevo = new NodoSimple(valorNuevo);
		Nodo anterior= null;
		Nodo actual = this.head;
		while(!actual.equals(nuevo)) {
			anterior = actual;
			actual = actual.siguiente();
		}
		if(actual.esVacio()) return;
		else {
			anterior.siguiente(nuevo);
		}		
	}

	@Override
	public void agregarEn(T t, int indice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer tamanio() {
		Nodo nodoAux = this.head;
		Integer cantidadNodos =0;
		while(!nodoAux.esVacio()) {
			cantidadNodos++;
			nodoAux=nodoAux.siguiente();
		}
		return cantidadNodos;
	}

	@Override
	public Boolean pertenece(T t) {
		Nodo buscado = new NodoSimple(t);
		Nodo actual = this.head;
		while(!actual.equals(buscado)) {
			actual = actual.siguiente();
		}
		return !actual.esVacio();
	}

	@Override
	public void imprimir() {
		Nodo nodoAux = this.head;
		Integer cantidadNodos =0;
		while(!nodoAux.esVacio()) {
			System.out.println("NODO["+cantidadNodos+"] : "+ nodoAux.valor());
			cantidadNodos++;
			nodoAux=nodoAux.siguiente();
		}
		
	}

}
