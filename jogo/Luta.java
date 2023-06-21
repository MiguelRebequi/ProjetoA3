package jogo;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package sistemadebatalha;
//
//import java.util.Random;
//import java.util.Scanner;
//
///**
// *
// * @author migue
// */
//public class Luta {
//    private static Random random = new Random();
//    private static Scanner scanner = new Scanner(System.in);
//    public void batalha(Personagem[] personagem) {
//        
//                int vidaMonstro1 = 100;
//                int vidaMonstro2 = 100;
//                int vidaBoss = 150;
//                boolean bossApareceu = false;
//                int turno = 1;
//                boolean batalha = true;
//                
//                D4Curar curar = new D4Curar();
//                D4Dano dano = new D4Dano();
//                
//                
//        while (batalha) {
//        for (Personagem personagem : personagens) {
//            // ...
//        }
//            
//            
//            System.out.println("\nTurno " + turno + ":");
//            System.out.println("Escolha a sua ação:");
//            System.out.println("A. Atacar");
//            System.out.println("B. Ataque Especial");
//            System.out.println("C. Curar vida");
//            System.out.println("P. Passar o turno");
//
//            char escolha = scanner.next().charAt(0);
//
//            switch (Character.toUpperCase(escolha)) {
//                case 'A':
//                    if (vidaMonstro1 > 0 || vidaMonstro2 > 0 || (vidaBoss > 0 && bossApareceu)) {
//                        System.out.println("Escolha o monstro para atacar:");
//                        System.out.println("1. Monstro 1");
//                        System.out.println("2. Monstro 2");
//                        System.out.println("3. Boss");
//
//                        int monstroEscolhido = scanner.nextInt();
//                        int danoCausado = random.nextInt(10) + 1;
//
//                        switch (monstroEscolhido) {
//                            case 1:
//                                if (vidaMonstro1 > 0) {
//                                    D4Dano dano = new D4Dano();
//                                    vidaMonstro1 -= dano.getDado2();
//                                    System.out.println("Você atacou o Monstro 1 e causou " + danoCausado + " de dano.");
//                                    System.out.println("Vida do Monstro 1 restante: " + vidaMonstro1);
//                                } else {
//                                    System.out.println("O Monstro 1 já foi derrotado. Escolha outro alvo.");
//                                }
//                                break;
//
//                            case 2:
//                                if (vidaMonstro2 > 0) {
//                                    vidaMonstro2 -= dano.getDado2();
//                                    System.out.println("Você atacou o Monstro 2 e causou " + danoCausado + " de dano.");
//                                    System.out.println("Vida do Monstro 2 restante: " + vidaMonstro2);
//                                } else {
//                                    System.out.println("O Monstro 2 já foi derrotado. Escolha outro alvo.");
//                                }
//                                break;
//
//                            case 3:
//                                if (vidaBoss > 0 && bossApareceu) {
//                                    vidaBoss -= dano.getDado2();
//                                    System.out.println("Você atacou o Boss e causou " + danoCausado + " de dano.");
//                                    System.out.println("Vida do Boss restante: " + vidaBoss);
//                                } else {
//                                    System.out.println("O Boss ainda não apareceu. Escolha outro alvo.");
//                                }
//                                break;
//
//                            default:
//                                System.out.println("Opção inválida. Escolha outra ação.");
//                        }
//                    } else {
//                        System.out.println("Todos os monstros foram derrotados. Não há alvos disponíveis.");
//                    }
//                    break;
//
//                case 'B':
//                    if (Personagem instanceof Guerreiro) {
//                        Guerreiro guerreiro = (Guerreiro) personagemAtual;
//                        guerreiro.ataqueEspecial(vidaMonstro1, vidaMonstro2, vidaBoss, bossApareceu);
//                    } else if (personagemAtual instanceof Arqueiro) {
//                        Arqueiro arqueiro = (Arqueiro) personagemAtual;
//                        arqueiro.ataqueEspecial(vidaMonstro1, vidaMonstro2, vidaBoss, bossApareceu);
//                    } else if (personagemAtual instanceof Mago) {
//                        Mago mago = (Mago) personagemAtual;
//                        mago.ataqueEspecial(vidaMonstro1, vidaMonstro2, vidaBoss, bossApareceu);
//                    } else if (personagemAtual instanceof Assassino) {
//                        Assassino assassino = (Assassino) personagemAtual;
//                        assassino.ataqueEspecial(vidaMonstro1, vidaMonstro2, vidaBoss, bossApareceu);
//                    } else if (personagemAtual instanceof Bardo) {
//                        Bardo bardo = (Bardo) personagemAtual;
//                        bardo.ataqueEspecial(vidaMonstro1, vidaMonstro2, vidaBoss, bossApareceu);
//                    } else {
//                        System.out.println("O personagem atual não possui um ataque especial.");
//                    }
//                    break;
//
//                case 'C':
//                    curar.get
//                    break;
//
//                case 'P':
//                    System.out.println("Você passou o turno.");
//                    break;
//
//                default:
//                    System.out.println("Opção inválida. Escolha outra ação.");
//            }
//
//            if (vidaMonstro1 > 0) {
//                int danoMonstro1 = random.nextInt(10) + 1;
//                personagemAtual.serAtacado(danoMonstro1);
//                System.out.println("O Monstro 1 atacou e causou " + danoMonstro1 + " de dano.");
//                System.out.println("Vida restante: " + personagemAtual.getPontosDeVida());
//            }
//
//            if (vidaMonstro2 > 0) {
//                int danoMonstro2 = random.nextInt(10) + 1;
//                personagemAtual.serAtacado(danoMonstro2);
//                System.out.println("O Monstro 2 atacou e causou " + danoMonstro2 + " de dano.");
//                System.out.println("Vida restante: " + personagemAtual.getPontosDeVida());
//            }
//
//            if (vidaBoss > 0 && bossApareceu) {
//                int danoBoss = random.nextInt(20) + 1;
//                personagemAtual.serAtacado(danoBoss);
//                System.out.println("O Boss atacou e causou " + danoBoss + " de dano.");
//                System.out.println("Vida restante: " + personagemAtual.getPontosDeVida());
//            }
//
//            if (vidaBoss <= 0 && bossApareceu) {
//                System.out.println("Parabéns! Você derrotou o Boss!");
//                break;
//            }
//
//            if (personagemAtual.getPontosDeVida() <= 0) {
//                System.out.println("Seu personagem foi derrotado. Game Over!");
//                break;
//            }
//
//            if (vidaMonstro1 <= 0 && vidaMonstro2 <= 0 && !bossApareceu) {
//                System.out.println("Você derrotou todos os monstros! O Boss apareceu!");
//                vidaBoss = 200;
//                bossApareceu = true;
//            }
//            if (vidaMonstro1 <= 0 && vidaMonstro2 <= 0 && vidaBoss <= 0) {
//                System.out.println("A batalha acabou!!!");
//                batalha = false;
//            }
//            turno++;
//        }
//
//        System.out.println("\nObrigado por jogar!");
//    }
//}
//
