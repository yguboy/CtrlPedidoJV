package model;

public class Cliente {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Getters e setters

    @Override
    public String toString() {
        return "Cliente [ID: " + id + ", Nome: " + nome + "]";
    }

    public String getNome() {
        return null;
    }
}
