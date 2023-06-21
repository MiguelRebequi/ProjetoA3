package jogo;

public class Assassino extends Personagem {
    public Assassino(String nome, int vida, int mana, int dano) {
        super(nome, vida, mana, dano);
    }

    @Override
    public String toString() {
        return "Assassino: " + nome + ", Vida: " + vida + ", Mana: " + mana + ", Dano: " + dano;
    }
}
