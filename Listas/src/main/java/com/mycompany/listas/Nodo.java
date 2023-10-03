package com.mycompany.listas;

 public class Nodo<T> {
    //atributo valor de tipo T.Almacena la referencia al objeto
    //que se guarda en el nodo
    private T valor;
    Nodo<T> siguiente;
    //constructor por defecto
    public Nodo() {
        valor = null;
        siguiente = null;
    }
    public T getValor() {
        return valor;
    }
    public void setValor(T valor) {
        this.valor = valor;
    }
    public Nodo<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
