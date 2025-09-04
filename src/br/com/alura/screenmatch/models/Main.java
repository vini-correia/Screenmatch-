package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.calculos.calculadoraDeTempo;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Meu malvado favorito", 2000);

        meuFilme.setAnoDeLancamento(2002);
        meuFilme.setDuracaoEmMinutos(190);

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme em minutos: " + meuFilme.getDuracaoEmMinutos());

        System.out.println("Soma das avaliações: " + meuFilme.getsomaDasAvaliacoes());
        System.out.println("total de avaliações: " + meuFilme.gettotalDeAvaliacoes()) ;

//        System.out.println(meuFilme.somaDasAvaliacoes);
//        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie(2005, "Lost");

        minhaSerie.setNome("Lost");
        minhaSerie.setAnoDeLancamento(2000);
        minhaSerie.exibirFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEspisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        System.out.println("duração da serie: " + minhaSerie.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Poderoso chefão", 1994);
        outroFilme.setDuracaoEmMinutos(200);

        calculadoraDeTempo calculadora = new calculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro  = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio e = new Episodio();
        e.setNumero(1);
        e.setSerie(minhaSerie);
        e.setTotalDeVisualizacoes(300);
        filtro.filtrar(e);

        var filmeDoPaulo = new Filme("dogvile", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("tamanho da lista: " + listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);



    }
}
