/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo.tela.metodo;

import java.awt.Dialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jogo.Arqueiro;
import jogo.tela.metodo.RedimensionarVetor;
import jogo.Personagem;
import jogo.tela.CriacaoDePersonagem;

public class ModificarPlayer {

    public boolean ex1 = false;
    public boolean ex2 = false;
    public boolean ex3 = false;
    public boolean ex4 = false;
    public boolean ex5 = false;

    public void modificarPlayer(Personagem[] personagem, String classe1, String classe2, String classe3, String classe4, String classe5,
            String player1, String player2, String player3, String player4, String player5,
            int vida1, int vida2, int vida3, int vida4, int vida5,
            int dano1, int dano2, int dano3, int dano4, int dano5,
            int mana) {

        String[] opcoes = {"Atualizar personagem", "Excluir personagem"};

        UIManager.put("OptionPane.yesButtonText", "Atualizar Personagem");
        UIManager.put("OptionPane.noButtonText", "Excluir Personagem");

        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha == JOptionPane.YES_OPTION) {
            // Ação para o botão "Yes" (Editar personagem)
            String[] editarp = {"Editar Player 1", "Editar Player 2", "Editar Player 3", "Editar Player 4", "Editar Player 5"};
            int editar = JOptionPane.showOptionDialog(
                    null,
                    "Escolha um personagem para editar/excluir:",
                    "Editar ou Excluir",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    editarp,
                    editarp[0]);
            System.out.println("Opção selecionada: Excluir personagem");
            if (editar == JOptionPane.CLOSED_OPTION) {
                // Ação para o caso em que o usuário fecha a caixa de diálogo
                JOptionPane.getRootFrame().dispose();
            } else {
                System.out.println("Opção selecionada: Excluir personagem");
                if (editar == 0) {
                    // Editar personagem 1
                    
                } else if (editar == 1) {
                    // Editar personagem 2
                } else if (editar == 2) {
                    // Editar personagem 3
                } else if (editar == 3) {
                    // Editar personagem 4
                } else if (editar == 4) {
                    // Editar personagem 5
                } else {
                    JOptionPane.showConfirmDialog(null, "Não foi possível a modificação");
                    return;
                }
            }
        } else if (escolha == JOptionPane.NO_OPTION) {
            // Ação para o botão "No" (Excluir personagem)
            String[] excluirp = {"Excluir Player 1", "Excluir Player 2", "Excluir Player 3", "Excluir Player 4", "Excluir Player 5"};
            int excluir = JOptionPane.showOptionDialog(
                    null,
                    "Escolha um personagem para editar/excluir:",
                    "Editar ou Excluir",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    excluirp,
                    excluirp[0]);

            if (excluir == JOptionPane.CLOSED_OPTION) {
                // O usuário pressionou a opção de fechamento
                JOptionPane.getRootFrame().dispose();
                if (excluir == 0) {
                    // Excluir personagem 1
                    personagem[0] = null;
                    ex1 = true;
                    JOptionPane.showMessageDialog(null, "O personagem 1 foi excluído");
                } else if (excluir == 1) {
                    // Excluir personagem 2
                    personagem[1] = null;
                    ex2 = true;
                    JOptionPane.showMessageDialog(null, "O personagem 2 foi excluído");
                } else if (excluir == 2) {
                    // Excluir personagem 3
                    personagem[2] = null;
                    ex3 = true;
                    JOptionPane.showMessageDialog(null, "O personagem 3 foi excluído");
                } else if (excluir == 3) {
                    // Excluir personagem 4
                    personagem[3] = null;
                    ex4 = true;
                    JOptionPane.showMessageDialog(null, "O personagem 4 foi excluído");
                } else if (excluir == 4) {
                    // Excluir personagem 5
                    personagem[4] = null;
                    ex5 = true;
                    JOptionPane.showMessageDialog(null, "O personagem 5 foi excluído");
                }
                if (excluir == JOptionPane.CLOSED_OPTION) {
                    // O usuário pressionou a opção de fechamento
                    JOptionPane.getRootFrame().dispose();

                }

            } else if (escolha == JOptionPane.CLOSED_OPTION) {
                // Ação para o caso em que o usuário fecha a caixa de diálogo
                JOptionPane.getRootFrame().dispose();
            }

        }
    }

    public boolean isEx1() {
        return ex1;
    }

    public boolean isEx2() {
        return ex2;
    }

    public boolean isEx3() {
        return ex3;
    }

    public boolean isEx4() {
        return ex4;
    }

    public boolean isEx5() {
        return ex5;
    }

}
