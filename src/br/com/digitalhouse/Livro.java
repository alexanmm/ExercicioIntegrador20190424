package br.com.digitalhouse;

public class Livro {

    //Atributos
    private int codigoLivro;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private String codigoISBN;
    private int qtdeEstoque;
    private double preco;

    //Construtor
    public Livro() {
    }

    public Livro(String titulo, String autor, int anoLancamento, String codigoISBN, int qtdeEstoque, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codigoISBN = codigoISBN;
        this.qtdeEstoque = qtdeEstoque;
        this.preco = preco;
    }

    //Getter and Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        this.qtdeEstoque = qtdeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigoLivro=" + codigoLivro +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoLancamento=" + anoLancamento +
                ", codigoISBN='" + codigoISBN + '\'' +
                ", qtdeEstoque=" + qtdeEstoque +
                ", preco=" + preco +
                '}';
    }
}
