package com.mycompany.listas;

public class Lista<T> {
    //Primer elemento de la lista 
    private Nodo<T> cabeza;
    //Total de elementos de la lista
    private int tamanio;
    //Constructor por defecto
    public Lista(){
        cabeza = null;
        tamanio=0;
    }

    public int getTamaño() {
        return tamanio;
    }
    /*
    * Consulta si la lista esta vacia
    *@return true cuando esta vacia, falsa cuando no lo esta
    */
    public boolean esVacia(){
        if (cabeza == null) {
            return true;
        }else
            return false;
    }
    
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        }else{
           //Agregar al dinal de la lista 
            Nodo<T> aux=cabeza;
        while(aux.getSiguiente()!=null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(nuevo);
    }
    tamanio++;
    
    }
    
    public void insertar(T valor,int posicion) throws PosicionIlegalException{
        if(posicion >=0 && posicion<=tamanio){
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if (posicion == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza=nuevo;
            }
        else{   //El nodo a insertar va al final
                if(posicion==tamanio){
                    Nodo<T> aux  = cabeza;
                    while (aux.getSiguiente()!=null) {
                        aux = aux.getSiguiente(); 
                    }
                    aux.setSiguiente(nuevo);
                    
                }else{//El nodo a insertar va eb medio
                    Nodo<T> aux= cabeza;
                    for (int i = 0; i < posicion-2; i++) {
                        aux = aux.getSiguiente();
                    }
                    Nodo<T> siguiente = aux.getSiguiente();
                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(siguiente);
                }
            
        }
            tamanio++;
        }
        else{
            throw new PosicionIlegalException();
        }
    }
    
    public T getValor(int pos) throws PosicionIlegalException{
        if (pos >=0 && pos < tamanio){
            T valor;
            if(pos ==0){
                //En este caso el nodo buscado es la cabeza
                valor = cabeza.getValor();
                return valor;
            } else{
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= tamanio; i++) {
                    
                }
            }
        }
    }else{
        throw new PosicionIlegalException();
    
}
}
}
