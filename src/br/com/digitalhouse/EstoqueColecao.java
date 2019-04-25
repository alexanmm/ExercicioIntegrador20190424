package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletionException;

public class EstoqueColecao extends Estoque{

    //Atributos
    private Map<Integer, ColecaoLivros> listaColecao = new HashMap<>();

    //Construtor
    public EstoqueColecao() {
    }

    public EstoqueColecao(Map<Integer, ColecaoLivros> listaColecao) {
        this.listaColecao = listaColecao;
    }

    //Getter and Setter
    public Map<Integer, ColecaoLivros> getListaColecao() {
        return listaColecao;
    }

    public void setListaColecao(Map<Integer, ColecaoLivros> listaColecao) {
        this.listaColecao = listaColecao;
    }

    public void cadastrarColecao(ColecaoLivros novaColecao) {

        contador++; //Prepara o próximo código

        novaColecao.setCodigoColecao(contador);
        listaColecao.put(contador, novaColecao);

        System.out.println(" . Coleção cadastrada com sucesso: código " + contador);

    }

    public ColecaoLivros consultarColecao(int codigoColecao) {

        //Verifica se a Coleção já está cadastrada
        ColecaoLivros colecaoEncontrada = listaColecao.get(codigoColecao);

        if (colecaoEncontrada == null) { //Código da Coleção não encontrada
            System.out.println("Coleção não encontrada");

        } else { //Coleção encontrada

            System.out.println(" . " + colecaoEncontrada.toString());
        }

        return colecaoEncontrada;

    }

    //Listar colecao
    @Override
    public void listar() {

        System.out.println("*** Lista de coleções cadastradas ***");

        for (Integer chave : listaColecao.keySet()) {

            ColecaoLivros colecaoLivros = listaColecao.get(chave);
            System.out.println("-> Código da Coleção: " + chave + " " + listaColecao.toString());

            for ( Livro linha: colecaoLivros.getListaColecoes()){

                System.out.println(" - Código do livro: " + linha.toString());
            }

        }

    }

}
