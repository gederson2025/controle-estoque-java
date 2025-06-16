package modelo;

public class Produto {
    private String nome;
    private String categoria;
    private int quantidade;

    public Produto(String nome, String categoria, int quantidade) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}