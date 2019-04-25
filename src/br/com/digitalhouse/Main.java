package br.com.digitalhouse;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Inicializa Estoque de Livros
        EstoqueLivros estoqueLivros = new EstoqueLivros();
        EstoqueColecao estoqueColecao = new EstoqueColecao();

        //Cadastro dos livros
        Livro superman = new Livro("As aventuras do Superman", "Batman", 1965, "ASD11", 30, 35.00d);
        Livro java = new Livro("Aprenda em Java em 21 dias", "Desconhecido", 2015, "CC01", 3, 90.00d);
        Livro inglesLeigos = new Livro("15 minutos para aprender ingles", "Babel", 2018, "A1", 150, 25.00d);

        estoqueLivros.cadastrarLivro(superman);
        estoqueLivros.cadastrarLivro(java);
        estoqueLivros.cadastrarLivro(inglesLeigos);

        //Exibir lista de livros cadastrados
        estoqueLivros.listar();

        //Dados informados pelo Usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("-> Escolha uma das opções abaixo:");
        System.out.println("   1 - Cadastrar livro");
        System.out.println("   2 - Consultar livro");
        System.out.println("   3 - Efetuar venda de livro");
        System.out.println("   4 - Cadastrar coleção");
        System.out.println("   5 - Consultar coleção");
        System.out.println("***");

        int retornoOpcao = 0;
        retornoOpcao = scanner.nextInt();

        Scanner scannerLivro = new Scanner(System.in);

        //Valida a opção escolhida pelo usuário
        switch (retornoOpcao) {
            case 1: //Cadastrar Livro

                System.out.println("-> Informe os dados do livro:");

                Livro novoLivro = new Livro();

                Scanner scannerTitulo = new Scanner(System.in);
                System.out.println("   Informar o Título: ");
                novoLivro.setTitulo(scannerTitulo.next());

                Scanner scannerAutor = new Scanner(System.in);
                System.out.println("   Informar o Autor: ");
                novoLivro.setAutor(scannerAutor.next());

                Scanner scannerAno = new Scanner(System.in);
                System.out.println("   Informar o Ano de Lançamento: ");
                novoLivro.setAnoLancamento(scannerAno.nextInt());

                Scanner scannerCodigoISBN = new Scanner(System.in);
                System.out.println("   Informar o Código ISBN: ");
                novoLivro.setCodigoISBN(scannerCodigoISBN.next());

                Scanner scannerQdte = new Scanner(System.in);
                System.out.println("   Informar a Quantidade: ");
                novoLivro.setQtdeEstoque(scannerQdte.nextInt());

                Scanner scannerPreco = new Scanner(System.in);
                System.out.println("   Informar o preço: ");
                novoLivro.setPreco(scannerPreco.nextDouble());

                //Cadastra o novo livro
                estoqueLivros.cadastrarLivro(novoLivro);

                break;

            case 2: //Consultar Livro

                System.out.println("-> Informe o código do livro: ");
                estoqueLivros.consultarLivro(scannerLivro.nextInt());

                break;

            case 3: //Efetuar venda

                System.out.println("-> Informe o código do livro vendido: ");
                int codigoLivro = scannerLivro.nextInt();

                System.out.println("-> Informe a quantidade de livros vendidos: ");
                int qtdVenda = scannerLivro.nextInt();

                estoqueLivros.efetuarVenda(codigoLivro, qtdVenda);

                //Exibir lista de livros cadastrados
                estoqueLivros.listar();

                break;

            case 4: //Cadastrar Coleção
                //Cadastro de coleção
                List<Livro> arrayColecaoSuperHeroi = new ArrayList<>();
                arrayColecaoSuperHeroi.add(superman);
                ColecaoLivros superHeroi = new ColecaoLivros(100.00d, "Colecao Super Herois", arrayColecaoSuperHeroi);
                estoqueColecao.cadastrarColecao(superHeroi);

                List<Livro> arrayColecaoAprendizado = new ArrayList<>();
                arrayColecaoAprendizado.add(java);
                arrayColecaoAprendizado.add(inglesLeigos);
                ColecaoLivros aprendizado = new ColecaoLivros(150.00d, "Colecao Super Herois", arrayColecaoAprendizado);
                estoqueColecao.cadastrarColecao(aprendizado);

                break;

            case 5: //Consultar Coleção

                System.out.println("-> Informe o código da coleção: ");
                estoqueColecao.consultarColecao(scannerLivro.nextInt());

                break;


            default: //Outros
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        //Exibir lista de livros cadastrados
        estoqueLivros.listar();

        //Exibir lista de coleções cadastradas
        estoqueColecao.listar();


    }



}
