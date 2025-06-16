package modelo;

import java.util.Date;

public class Produto {
    private int id;
    private String nome;
    private String categoria;
    private int quantidade;
    private int minQuantidade;
    private Date validade;
    private String observacoes;

    // Construtores, getters e setters
    public Produto() {}
    
    public Produto(String nome, String categoria, int quantidade, int minQuantidade, Date validade, String observacoes) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.minQuantidade = minQuantidade;
        this.validade = validade;
        this.observacoes = observacoes;
    }
    
    // Getters e Setters para todos os atributos
    // ...
}