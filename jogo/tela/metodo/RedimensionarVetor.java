package jogo.tela.metodo;

import javax.swing.JOptionPane;
import jogo.tela.CriacaoDePersonagem;
import jogo.Personagem;
import jogo.Arqueiro;
import jogo.Assassino;
import jogo.Bardo;
import jogo.Guerreiro;
import jogo.Mago;

public class RedimensionarVetor {

    public Personagem[] redimensionarVetor(Personagem[] personagem, String classe1, String classe2, String classe3, String classe4, String classe5,
            String player1, String player2, String player3, String player4, String player5,
            int vida1, int vida2, int vida3, int vida4, int vida5,
            int dano1, int dano2, int dano3, int dano4, int dano5,
            int mana) {
//                int agua = 0;
//        int quente = 0;
        int quantidade = 1;

        // agua == 0
        if (!classe1.equalsIgnoreCase("Sem classe") && !classe1.equalsIgnoreCase("")) {
            System.out.println(quantidade);

            switch (classe1.toLowerCase()) {
                case "arqueiro":
                    // Verificar se a classe1 está como Arqueiro
                    personagem[0] = new Arqueiro(player1, vida1, mana, dano1);
                    
                    
                    
                    break;
                case "assassino":
                    // Verificar se a classe1 está como Assassino
                    personagem[0] = new Assassino(player1, vida1, mana, dano1);
                    break;
                case "bardo":
                    // Verificar se a classe1 está como Bardo
                    personagem[0] = new Bardo(player1, vida1, mana, dano1);
                    break;
                case "guerreiro":
                    // Verificar se a classe1 está como Guerreiro
                    personagem[0] = new Guerreiro(player1, vida1, mana, dano1);
                    break;
                case "mago":
                    // Verificar se a classe1 está como Mago
                    personagem[0] = new Mago(player1, vida1, mana, dano1);
                    break;
                default:
                    // Caso a classe1 não corresponda a nenhuma das opções anteriores
                    JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 1 com classe inválida");
                    break;

            } // agua == 0 && quente == 1 
            if (classe2 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe")) {
                quantidade = 2;
                Personagem[] novoVetor = new Personagem[quantidade];
                System.arraycopy(personagem, 0, novoVetor, 0, quantidade - 1);
                personagem = novoVetor;

                switch (classe2.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe1 está como Arqueiro
                        personagem[1] = new Arqueiro(player2, vida2, mana, dano2);
                        break;
                    case "assassino":
                        // Verificar se a classe1 está como Assassino
                        personagem[1] = new Assassino(player2, vida2, mana, dano2);
                        break;
                    case "bardo":
                        // Verificar se a classe1 está como Bardo
                        personagem[1] = new Bardo(player2, vida2, mana, dano2);
                        break;
                    case "guerreiro":
                        // Verificar se a classe1 está como Guerreiro
                        personagem[1] = new Guerreiro(player2, vida2, mana, dano2);
                        break;
                    case "mago":
                        // Verificar se a classe1 está como Mago
                        personagem[1] = new Mago(player2, vida2, mana, dano2);
                        break;
                    default:
                        // Caso a classe1 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 1 com classe inválida");
                        break;
                }
                if (classe3 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe") && !classe3.equalsIgnoreCase("Sem classe")
                        && !classe1.equalsIgnoreCase("") && !classe2.equalsIgnoreCase("") && !classe3.equalsIgnoreCase("")) {
                    quantidade = 3;
                    Personagem[] novoVetor3 = new Personagem[quantidade];
                    System.arraycopy(personagem, 0, novoVetor3, 0, quantidade - 1);
                    personagem = novoVetor3;

                    switch (classe3.toLowerCase()) {
                        case "arqueiro":
                            // Verificar se a classe1 está como Arqueiro
                            personagem[2] = new Arqueiro(player3, vida2, mana, dano2);
                            break;
                        case "assassino":
                            // Verificar se a classe1 está como Assassino
                            personagem[2] = new Assassino(player3, vida2, mana, dano2);
                            break;
                        case "bardo":
                            // Verificar se a classe1 está como Bardo
                            personagem[2] = new Bardo(player3, vida2, mana, dano2);
                            break;
                        case "guerreiro":
                            // Verificar se a classe1 está como Guerreiro
                            personagem[2] = new Guerreiro(player3, vida2, mana, dano2);
                            break;
                        case "mago":
                            // Verificar se a classe1 está como Mago
                            personagem[2] = new Mago(player3, vida2, mana, dano2);
                            break;
                        default:
                            // Caso a classe1 não corresponda a nenhuma das opções anteriores
                            JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 2 com classe inválida");
                            break;
                    }

                }

            }
            if (classe4 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe") && !classe3.equalsIgnoreCase("Sem classe") && !classe4.equalsIgnoreCase("Sem classe")
                    && !classe1.equalsIgnoreCase("") && !classe2.equalsIgnoreCase("") && !classe3.equalsIgnoreCase("") && !classe4.equalsIgnoreCase("")) {
                quantidade = 4;
                Personagem[] novoVetor4 = new Personagem[quantidade];
                System.arraycopy(personagem, 0, novoVetor4, 0, quantidade-1);
                personagem = novoVetor4;

                switch (classe4.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe3 está como Arqueiro
                        personagem[3] = new Arqueiro(player4, vida4, mana, dano4);
                        break;
                    case "assassino":
                        // Verificar se a classe3 está como Assassino
                        personagem[3] = new Assassino(player4, vida4, mana, dano4);
                        break;
                    case "bardo":
                        // Verificar se a classe3 está como Bardo
                        personagem[3] = new Bardo(player4, vida4, mana, dano4);
                        break;
                    case "guerreiro":
                        // Verificar se a classe3 está como Guerreiro
                        personagem[3] = new Guerreiro(player4, vida4, mana, dano4);
                        break;
                    case "mago":
                        // Verificar se a classe3 está como Mago
                        personagem[3] = new Mago(player4, vida4, mana, dano4);
                        break;
                    default:
                        // Caso a classe3 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 4 com classe inválida");
                        break;
                }
            }
            if (classe2 != null && classe3 != null && classe4 != null && classe5 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe") && !classe3.equalsIgnoreCase("Sem classe") && !classe4.equalsIgnoreCase("Sem classe") && !classe5.equalsIgnoreCase("Sem classe")
                    && !classe1.equalsIgnoreCase("") && !classe2.equalsIgnoreCase("") && !classe3.equalsIgnoreCase("") && !classe4.equalsIgnoreCase("") && !classe5.equalsIgnoreCase("")) {
                quantidade = 5;
                Personagem[] novoVetor5 = new Personagem[quantidade];
                System.arraycopy(personagem, 0, novoVetor5, 0, quantidade-1);
                personagem = novoVetor5;

                switch (classe5.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe3 está como Arqueiro
                        personagem[4] = new Arqueiro(player5, vida5, mana, dano5);
                        break;
                    case "assassino":
                        // Verificar se a classe3 está como Assassino
                        personagem[4] = new Assassino(player5, vida5, mana, dano5);
                        break;
                    case "bardo":
                        // Verificar se a classe3 está como Bardo
                        personagem[4] = new Bardo(player5, vida5, mana, dano5);
                        break;
                    case "guerreiro":
                        // Verificar se a classe3 está como Guerreiro
                        personagem[4] = new Guerreiro(player5, vida5, mana, dano5);
                        break;
                    case "mago":
                        // Verificar se a classe3 está como Mago
                        personagem[4] = new Mago(player5, vida5, mana, dano5);
                        break;
                    default:
                        // Caso a classe3 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 4 com classe inválida");
                        break;
                }

            }

        }
        return personagem;
    }
}
