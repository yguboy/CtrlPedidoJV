package model;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e setters

    @Override
    public String toString() {
        return "Produto [ID: " + id + ", Nome: " + nome + ", Preço: " + preco + "]";
    }
}
