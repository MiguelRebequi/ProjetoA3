package jogo;

public class Bardo extends Personagem {
public Bardo(String nome, int vida, int mana,int dano) {
super(nome, vida, mana, dano);
}
public String toString() {
    return "Bardo: " + nome + ", Vida: " + vida + ", Mana: " + mana + ", Dano: " + dano;
}
}