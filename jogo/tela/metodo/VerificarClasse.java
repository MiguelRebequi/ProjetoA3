/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo.tela.metodo;

import javax.swing.JOptionPane;

import jogo.tela.CriacaoDePersonagem;

public class VerificarClasse {

    

public <T> void verificarClasse(T classeGenerica, CriacaoDePersonagem cp) {
        String valor = classeGenerica.toString();
        if (!valor.equalsIgnoreCase("Sem classe") && !valor.equalsIgnoreCase("")) {

            switch (valor.toLowerCase()) {
                case "arqueiro":
                    // Verificar se a classe1 está como Arqueiro
                    cp.getCb_arqueiro().setVisible(true);
                    cp.getCb_arqueiro().setEnabled(true);
                    cp.getLbl_dano().setVisible(true);
                    cp.getCob_hp().setVisible(true);
                    
                    break;
                    
                case "assassino":
                    // Verificar se a classe1 está como Assassino

                    cp.getCb_assassino().setVisible(true);
                    cp.getCb_assassino().setEnabled(true);
                    cp.getLbl_dano().setVisible(true);
                    cp.getCob_hp().setVisible(true);
                    
                    break;
                case "bardo":
                    // Verificar se a classe1 está como Bardo
                    cp.getCb_bardo().setVisible(true);
                    cp.getCb_bardo().setEnabled(true);
                    cp.getLbl_dano().setVisible(true);
                    cp.getCob_hp().setVisible(true);
                    break;
                    
                case "guerreiro":
                    // Verificar se a classe1 está como Guerreiro
                    cp.getCb_guerreiro().setVisible(true);
                    cp.getCb_guerreiro().setVisible(true);
                    cp.getLbl_dano().setVisible(true);
                    cp.getCob_hp().setVisible(true);
                    break;
                case "mago":
                    // Verificar se a classe1 está como Mago
                    cp.getCb_mago().setVisible(true);
                    cp.getCb_mago().setEnabled(true);
                    cp.getLbl_dano().setVisible(true);
                    cp.getCob_hp().setVisible(true);
                    break;
                default:
                    // Caso a classe1 não corresponda a nenhuma das opções anteriores
                    JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 1 com classe inválida");
                    break;

            }
        }

    }

    public boolean verificarClasse(String classe1, String classe2, String classe3, String classe4, String classe5) {
        if (!classe1.equalsIgnoreCase("Sem classe") && !classe1.equalsIgnoreCase("")) {

            switch (classe1.toLowerCase()) {
                case "arqueiro":
                    // Verificar se a classe1 está como Arqueiro

                    boolean c1arq = true;
                    return c1arq;
                case "assassino":
                    // Verificar se a classe1 está como Assassino

                    boolean c1ass = true;
                    return c1ass;
                case "bardo":
                    // Verificar se a classe1 está como Bardo

                    break;
                case "guerreiro":
                    // Verificar se a classe1 está como Guerreiro

                    boolean c1guer = true;
                    return c1guer;
                case "mago":
                    // Verificar se a classe1 está como Mago
                    boolean c1mago = true;
                    return c1mago;
                default:
                    // Caso a classe1 não corresponda a nenhuma das opções anteriores
                    JOptionPane.showMessageDialog(null, "Erro de redimensionar vetor: Jogador 1 com classe inválida");
                    break;

            }

            // água == 0 && quente == 1
            if (classe2 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe")) {

                switch (classe2.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe1 está como Arqueiro

                        break;
                    case "assassino":
                        // Verificar se a classe1 está como Assassino

                        break;
                    case "bardo":
                        // Verificar se a classe1 está como Bardo

                        break;
                    case "guerreiro":
                        // Verificar se a classe1 está como Guerreiro

                        break;
                    case "mago":
                        // Verificar se a classe1 está como Mago

                        break;
                    default:
                        // Caso a classe1 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de verificar Classe: Jogador 2 com classe inválida");
                        break;
                }
            }

            if (classe3 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe") && !classe3.equalsIgnoreCase("Sem classe")
                    && !classe1.equalsIgnoreCase("") && !classe2.equalsIgnoreCase("") && !classe3.equalsIgnoreCase("")) {

                switch (classe3.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe1 está como Arqueiro

                        break;
                    case "assassino":
                        // Verificar se a classe1 está como Assassino

                        break;
                    case "bardo":
                        // Verificar se a classe1 está como Bardo

                        break;
                    case "guerreiro":
                        // Verificar se a classe1 está como Guerreiro

                        break;
                    case "mago":
                        // Verificar se a classe1 está como Mago

                        break;
                    default:
                        // Caso a classe1 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de verificar Classe: Jogador 2 com classe inválida");
                        break;
                }

            }

            if (classe4 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe") && !classe3.equalsIgnoreCase("Sem classe") && !classe4.equalsIgnoreCase("Sem classe")
                    && !classe1.equalsIgnoreCase("") && !classe2.equalsIgnoreCase("") && !classe3.equalsIgnoreCase("") && !classe4.equalsIgnoreCase("")) {

                switch (classe4.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe3 está como Arqueiro

                        break;
                    case "assassino":
                        // Verificar se a classe3 está como Assassino

                        break;
                    case "bardo":
                        // Verificar se a classe3 está como Bardo

                        break;
                    case "guerreiro":
                        // Verificar se a classe3 está como Guerreiro

                        break;
                    case "mago":
                        // Verificar se a classe3 está como Mago

                        break;
                    default:
                        // Caso a classe3 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de verificar Classe: Jogador 4 com classe inválida");
                        break;
                }
            }

            if (classe2 != null && classe3 != null && classe4 != null && classe5 != null && !classe1.equalsIgnoreCase("Sem classe") && !classe2.equalsIgnoreCase("Sem classe") && !classe3.equalsIgnoreCase("Sem classe") && !classe4.equalsIgnoreCase("Sem classe") && !classe5.equalsIgnoreCase("Sem classe")
                    && !classe1.equalsIgnoreCase("") && !classe2.equalsIgnoreCase("") && !classe3.equalsIgnoreCase("") && !classe4.equalsIgnoreCase("") && !classe5.equalsIgnoreCase("")) {

                switch (classe5.toLowerCase()) {
                    case "arqueiro":
                        // Verificar se a classe3 está como Arqueiro

                        break;
                    case "assassino":
                        // Verificar se a classe3 está como Assassino

                        break;
                    case "bardo":
                        // Verificar se a classe3 está como Bardo

                        break;
                    case "guerreiro":
                        // Verificar se a classe3 está como Guerreiro

                        break;
                    case "mago":
                        // Verificar se a classe3 está como Mago

                        break;
                    default:
                        // Caso a classe3 não corresponda a nenhuma das opções anteriores
                        JOptionPane.showMessageDialog(null, "Erro de verificar Classe: Jogador 5 com classe inválida");
                        break;
                }

            }

        }

        return false;
    }
}
