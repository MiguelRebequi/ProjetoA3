package jogo;

import javax.swing.JOptionPane;

public abstract class Personagem {

    protected String nome;
    protected int vida;
    protected int mana;
    protected int dano;

    public Personagem(String nome, int vida, int mana, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getDano() {
        return dano;
    }
    
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append("Nome: ").append(nome).append("\n");
        info.append("Vida: ").append(vida).append("\n");
        info.append("Dano: ").append(dano).append("\n");



        // Adicione outros atributos que deseja exibir
        return info.toString();
    }
}

