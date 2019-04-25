package br.com.digitalhouse;

import java.util.HashMap;
import java.util.Map;

public class EstoqueLivros extends Estoque{

    //Atributos
    private Map<Integer, Livro> listaLivros = new HashMap<>();

    //Construtor
    public EstoqueLivros() {
    }

    public EstoqueLivros(Map<Integer, Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    //Getter and Setter
    public Map<Integer, Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(Map<Integer, Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    //Metodos
    //Cadastrar Livro
    public void cadastrarLivro(Livro novoLivro) {

        contador++; //Prepara o próximo código

        novoLivro.setCodigoLivro(contador);
        listaLivros.put(contador, novoLivro);

        System.out.println(" . Livro cadastrado com sucesso: código " + contador);

    }

    //Consultar Livro
    public Livro consultarLivro(int codigoLivro) {

        //Verifica de o livro já está cadastrado
        Livro livroEncontrado = listaLivros.get(codigoLivro);

        if (livroEncontrado == null) { //Código do livro não encontrado
            System.out.println("Livro não encontrado");

        } else { //Livro encontrado

            System.out.println(" . " + livroEncontrado.toString());
        }

        return livroEncontrado;

    }

    //Efetuar Venda
    public void efetuarVenda(int codigoLivro, int qtdVendida) {

        if (qtdVendida <= 0) { //Quantidade Inválida
            System.out.println("Quantidade inválida");

        } else { //Quantidade Ok

            Livro livroEncontrado;
            livroEncontrado = consultarLivro(codigoLivro);

            //Valida a quantidade no estoque
            if (!(livroEncontrado == null)) {
                int qtdAtual = 0;
                qtdAtual = livroEncontrado.getQtdeEstoque();

                if (qtdAtual < qtdVendida) { //Quantidade insuficiente
                    System.out.println("Estoque esgotado!");

                } else {

                    livroEncontrado.setQtdeEstoque(qtdAtual - qtdVendida);

                    try {
                        listaLivros.put(codigoLivro, livroEncontrado);

                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }

    //Listar livros
    @Override
    public void listar() {

        System.out.println("*** Lista de livros cadastrados ***");

        for (Integer chave : listaLivros.keySet()) {

            Livro livro = listaLivros.get(chave);

            System.out.println("Código: " + chave + " " + livro.toString());

        }


    }

}
