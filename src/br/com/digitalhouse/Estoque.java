package br.com.digitalhouse;

public abstract class Estoque {

    //Atributos
    protected int contador;

    //Construtor
    public Estoque() {
    }

    //Getter and Setter
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public abstract void listar();

}
