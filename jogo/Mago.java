package jogo;

public class Mago extends Personagem {
public Mago(String nome, int vida, int mana, int dano) {
super(nome, vida, mana, dano);
}
@Override
public String toString() {
    return "Mago: " + nome + ", Vida: " + vida + ", Mana: " + mana + ", Dano: " + dano;
}
}