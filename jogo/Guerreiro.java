package jogo;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida, int mana, int dano) {
        super(nome, vida, mana, dano);
    }

    @Override
    public String toString() {
        return "Guerreiro: " + nome + ", Vida: " + vida + ", Mana: " + mana + ", Dano: " + dano;
    }
    
    public void ExibirHP(Personagem personagem) {
        int vida = personagem.getVida();
    }
}


// cannot find symbol
// symbol variable vida
// location class guerreiro