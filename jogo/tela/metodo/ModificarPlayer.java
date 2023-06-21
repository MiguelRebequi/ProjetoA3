package jogo.tela.metodo;

import java.awt.Dialog;
import javax.naming.spi.NamingManager;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jogo.Arqueiro;
import jogo.tela.metodo.RedimensionarVetor;
import jogo.Personagem;
import jogo.tela.CriacaoDePersonagem;
import javax.swing.JLabel;
import javax.swing.*;

public class ModificarPlayer {

    public boolean ex1 = false;
    public boolean ex2 = false;
    public boolean ex3 = false;
    public boolean ex4 = false;
    public boolean ex5 = false;
    public VerificarClasse vc = new VerificarClasse();

    public void modificarPlayerTeste(Personagem[] personagem, CriacaoDePersonagem cp, VerificarClasse vc, String classe1, String classe2, String classe3, String classe4, String classe5,
            String player1, String player2, String player3, String player4, String player5,
            int vida1, int vida2, int vida3, int vida4, int vida5,
            int dano1, int dano2, int dano3, int dano4, int dano5,
            int mana) {
        String vazio = "";
        String[] opcoes = {"Excluir personagem"};
        
        int escolha = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção:",
                "Opções",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        
        if (escolha == 0) {
            // Ação para o botão "Excluir personagem"
            String[] excluirp = {"Excluir Player 1", "Excluir Player 2", "Excluir Player 3", "Excluir Player 4", "Excluir Player 5"};

            String excluir = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha um personagem para excluir:",
                    "Excluir Personagem",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    excluirp,
                    excluirp[0]);

            if (excluir != null) {
                // Verifica se o usuário selecionou uma opção válida
                switch (excluir) {
                    case "Excluir Player 1":
                        // Excluir personagem 1
                        vc.verificarClasse(classe1, cp);
                        personagem[0] = null;
                        cp.atualizarTextoLblEspaco1(vazio);
                        classe1 = "";
                        player1 = "";
                        vida1 = 5;
                        dano1 = 30;
                        JOptionPane.showConfirmDialog(null, "Excluir personagem 1");
                        break;
                    case "Excluir Player 2":
                        // Excluir personagem 2
                        vc.verificarClasse(classe2, cp);
                        personagem[1] = null;
                        cp.atualizarTextoLblEspaco2(vazio);
                        classe2 = "";
                        player2 = "";
                        vida2 = 5;
                        dano2 = 30;
                        JOptionPane.showConfirmDialog(null, "Excluir personagem 2");
                        break;
                    case "Excluir Player 3":
                        // Excluir personagem 3
                        vc.verificarClasse(classe3, cp);
                        personagem[2] = null;
                        cp.atualizarTextoLblEspaco2(vazio);
                        classe3 = "";
                        player3 = "";
                        vida3 = 5;
                        dano3 = 30;
                        JOptionPane.showConfirmDialog(null, "Excluir personagem 3");
                        break;
                    case "Excluir Player 4":
                        // Excluir personagem 4
                        vc.verificarClasse(classe3, cp);
                        personagem[3] = null;
                        cp.atualizarTextoLblEspaco2(vazio);
                        classe4 = "";
                        player4 = "";
                        vida4 = 5;
                        dano4 = 30;
                        JOptionPane.showConfirmDialog(null, "Excluir personagem 4");
                        break;
                    case "Excluir Player 5":
                        // Excluir personagem 5
                        vc.verificarClasse(classe5, cp);
                        personagem[4] = null;
                        cp.atualizarTextoLblEspaco2(vazio);
                        classe5 = "";
                        player5 = "";
                        vida5 = 5;
                        dano5 = 30;
                        JOptionPane.showConfirmDialog(null, "Excluir personagem 4");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                        break;
                }
            }
        } else if (escolha == JOptionPane.CLOSED_OPTION) {
            // Ação para o caso em que o usuário fecha a caixa de diálogo
            JOptionPane.getRootFrame().dispose();
        }
    }

}
