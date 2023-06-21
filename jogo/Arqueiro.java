package jogo;

public class Arqueiro extends Personagem {
public Arqueiro(String nome, int vida, int mana, int dano) {
super(nome, vida, mana, dano);
}
@Override
public String toString() {
    return "Arqueiro: " + nome + ", Vida: " + vida + ", Mana: " + mana + ", Dano: " + dano;
}

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void teste() {
        System.out.println("Olá");
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }




}