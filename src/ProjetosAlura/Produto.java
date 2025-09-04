package ProjetosAlura;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private double preco;
    private String nome;
    private int quantidade;

    public Produto(double preco, String nome, int quantidade) {
        this.preco = preco;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override public String toString() {
        return preco + "\t" + nome + "\t" + quantidade;
    }
}

