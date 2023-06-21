/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo.tela.metodo;

import jogo.tela.metodo.RedimensionarVetor;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import jogo.Personagem;

/**
 *
 * @author migue
 */
public class ExibirPersonagens {

    public void exibirInformacoesGUI(Personagem[] personagens) {
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        for (Personagem personagem : personagens) {
            if (personagem != null) {
                textArea.append(personagem.getInfo() + "\n");
            }
        }

        JOptionPane.showMessageDialog(null, textArea, "Informações dos Personagens", JOptionPane.INFORMATION_MESSAGE);
    }
}
