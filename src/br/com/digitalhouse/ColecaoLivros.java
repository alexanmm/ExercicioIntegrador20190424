package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColecaoLivros {

    //Atributos
    private int codigoColecao;
    private double preco;
    private String descricao;
    private List<Livro> listaColecoes = new ArrayList<>();

    //Construtor
    public ColecaoLivros() {
    }

    public ColecaoLivros(double preco, String descricao, List<Livro> listaColecoes) {
        this.preco = preco;
        this.descricao = descricao;
        this.listaColecoes = listaColecoes;
    }

    //Getter and Setter
    public int getCodigoColecao() {
        return codigoColecao;
    }

    public void setCodigoColecao(int codigoColecao) {
        this.codigoColecao = codigoColecao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Livro> getListaColecoes() {
        return listaColecoes;
    }

    public void setListaColecoes(List<Livro> listaColecoes) {
        this.listaColecoes = listaColecoes;
    }

    @Override
    public String toString() {
        return "ColecaoLivros{" +
                "codigoColecao=" + codigoColecao +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", listaColecoes=" + listaColecoes +
                '}';
    }
}
