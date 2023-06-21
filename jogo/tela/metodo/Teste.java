package jogo.tela.metodo;

import jogo.Arqueiro;
import jogo.Assassino;
import jogo.Personagem;

public class Teste {

    public static void main(String[] args) {
        int agua = 0;
        int quente = 0;
        int quantidade = 1;
        String nome1 = "Arqueiro";
        String nome2 = "Assassino";
        Personagem[] personagem = new Personagem[quantidade];

        if (agua == 0) {
            System.out.println(quantidade);
            personagem[0] = new Arqueiro(nome1, agua, agua, agua);
        } if (agua == 0 && quente == 1) {
            quantidade = 2;
            Personagem[] novoVetor = new Personagem[quantidade];
            System.arraycopy(personagem, 0, novoVetor, 0, quantidade - 1);
            personagem = novoVetor;
//            personagem[0] = new Arqueiro(nome, agua, agua, agua);
            personagem[1] = new Assassino(nome2, agua, agua, agua);
            System.out.println("A quantidade do vetor: " + quantidade);
        } else if (agua == 2) {
            
        }

        for (Personagem p : personagem) {
            if (p != null) {
                System.out.println(p.getNome()); // Exibe o nome do personagem ou qualquer outro atributo desejado
                System.out.println(p.getDano());
            }
        }
    }
}
