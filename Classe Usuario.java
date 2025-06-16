package modelo;

public class Usuario {
    private int id;
    private String nome;
    private String login;
    private String senha;
    private String tipo; // "admin" ou "usuario"

    // Construtores, getters e setters
    public Usuario() {}
    
    public Usuario(String nome, String login, String senha, String tipo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
    
    // Getters e Setters para todos os atributos
    // ...
}