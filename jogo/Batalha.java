package jogo;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package sistemadebatalha;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Batalha {
//    private static Random random = new Random();
//    private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        
//
//        CriacaoPersonagem personagens = new CriacaoPersonagem();
//        personagens.CriarPersonagem();
//        
//        int vidaMonstro1 = 100;
//        int vidaMonstro2 = 100;
//        int vidaBoss = 150;
//        boolean bossApareceu = false;
//        
//        
//        
//        int turno = 1;
//        while (personagemAtual.getPontosDeVida() > 0 && (vidaMonstro1 > 0 || vidaMonstro2 > 0 || vidaBoss > 0)) {
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
//                                    personagemAtual.atacarMonstro1(danoCausado, vidaMonstro1);
//                                    System.out.println("Você atacou o Monstro 1 e causou " + danoCausado + " de dano.");
//                                    System.out.println("Vida do Monstro 1 restante: " + vidaMonstro1);
//                                } else {
//                                    System.out.println("O Monstro 1 já foi derrotado. Escolha outro alvo.");
//                                }
//                                break;
//
//                            case 2:
//                                if (vidaMonstro2 > 0) {
//                                    personagemAtual.atacarMonstro2(danoCausado, vidaMonstro2);
//                                    System.out.println("Você atacou o Monstro 2 e causou " + danoCausado + " de dano.");
//                                    System.out.println("Vida do Monstro 2 restante: " + vidaMonstro2);
//                                } else {
//                                    System.out.println("O Monstro 2 já foi derrotado. Escolha outro alvo.");
//                                }
//                                break;
//
//                            case 3:
//                                if (vidaBoss > 0 && bossApareceu) {
//                                    personagemAtual.atacarMonstroBoss(danoCausado, vidaBoss);
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
//                    if (personagemAtual instanceof Guerreiro) {
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
//                    personagemAtual.curarVida();
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
//
//            turno++;
//        }
//
//        System.out.println("\nObrigado por jogar!");
//    }
//
//    private static CriacaoPersonagem[] criarPersonagens() {
//        CriacaoPersonagem[] personagens = new CriacaoPersonagem[5];
//        personagens[0] = new Guerreiro("Guerreiro", 100, 50, 20);
//        personagens[1] = new Arqueiro("Arqueiro", 80, 80, 20);
//        personagens[2] = new Mago("Mago", 60, 100, 20);
//        personagens[3] = new Assassino("Assassino", 70, 60, 25);
//        personagens[4] = new Bardo("Bardo", 90, 70, 10);
//        return personagens;
//    }
//}
//
//class Personagem {
//    protected String nome;
//    protected int pontosDeVida;
//    protected int mana;
//    protected int dano;
//  
//   
//
//    public Personagem(String nome, int pontosDeVida, int mana, int dano) {
//        this.nome = nome;
//        this.pontosDeVida = pontosDeVida;
//        this.mana = mana;
//        this.dano = dano;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//    public int getvidaMonstro1(int vidaMonstro1){
//        return vidaMonstro1;
//    }
//    public int getvidaMonstro2(int vidaMonstro2){
//        return vidaMonstro2;
//    }
//    public int getvidaBoss(int vidaBoss){
//        return vidaBoss;
//    }
//
//    public int getPontosDeVida() {
//        return pontosDeVida;
//    }
//
//    public int getMana() {
//        return mana;
//    }
//public void atacarMonstro2(int vida, int vidaMonstro2) {
//        vidaMonstro2 -= vida;
//        
//    }
//public void atacarMonstroBoss(int vida, int vidaMonstroBoss) {
//        vidaMonstroBoss -= vida;
//       
//    }
//
//
//
//    public void atacarMonstro1(int vida, int vidaMonstro1) {
//        vidaMonstro1 -= vida;
//    }
//    
//
//    public void serAtacado(int dano) {
//        pontosDeVida -= dano;
//    }
//
//    public void curarVida() {
//        int cura = 20;
//        if (mana >= 10) {
//            pontosDeVida += cura;
//            mana -= 10;
//            System.out.println("Você curou " + cura + " pontos de vida.");
//            System.out.println("Vida restante: " + pontosDeVida);
//            System.out.println("Mana restante: " + mana);
//        } else {
//            System.out.println("Mana insuficiente para curar vida.");
//        }
//    }
//}
//
//class Guerreiro extends CriacaoPersonagem {
//    public Guerreiro(String nome, int pontosDeVida, int mana, int dano) {
//        super(nome, pontosDeVida, mana, dano);
//    }
//
//    public void ataqueEspecial(int vidaMonstro1, int vidaMonstro2, int vidaBoss, boolean bossApareceu) {
//        if (mana >= 30) {
//            int dano = 40;
//            mana -= 30;
//
//            if (vidaMonstro1 > 0) {
//                vidaMonstro1 -= dano;
//                System.out.println("Você usou o ataque especial Berserk e causou " + dano + " de dano ao Monstro 1.");
//                System.out.println("Vida do Monstro 1 restante: " + vidaMonstro1);
//            }
//
//            if (vidaMonstro2 > 0) {
//                vidaMonstro2 -= dano;
//                System.out.println("Você usou o ataque especial Berserk e causou " + dano + " de dano ao Monstro 2.");
//                System.out.println("Vida do Monstro 2 restante: " + vidaMonstro2);
//            }
//
//            if (vidaBoss > 0 && bossApareceu) {
//                vidaBoss -= dano;
//                System.out.println("Você usou o ataque especial Berserk e causou " + dano + " de dano ao Boss.");
//                System.out.println("Vida do Boss restante: " + vidaBoss);
//            }
//
//            System.out.println("Mana restante: " + mana);
//        } else {
//            System.out.println("Mana insuficiente para usar o ataque especial.");
//        }
//    }
//}
//
//class Arqueiro extends CriacaoPersonagem {
//    public Arqueiro(String nome, int pontosDeVida, int mana, int dano) {
//        super(nome, pontosDeVida, mana, dano);
//    }
//
//    public void ataqueEspecial(int vidaMonstro1, int vidaMonstro2, int vidaBoss, boolean bossApareceu) {
//        if (mana >= 20) {
//            int dano = 30;
//            mana -= 20;
//
//            if (vidaMonstro1 > 0) {
//                vidaMonstro1 -= dano;
//                System.out.println("Você usou o ataque especial Chuva de Flechas e causou " + dano + " de dano ao Monstro 1.");
//                System.out.println("Vida do Monstro 1 restante: " + vidaMonstro1);
//            }
//
//            if (vidaMonstro2 > 0) {
//                vidaMonstro2 -= dano;
//                System.out.println("Você usou o ataque especial Chuva de Flechas e causou " + dano + " de dano ao Monstro 2.");
//                System.out.println("Vida do Monstro 2 restante: " + vidaMonstro2);
//            }
//
//            if (vidaBoss > 0 && bossApareceu) {
//                vidaBoss -= dano;
//                System.out.println("Você usou o ataque especial Chuva de Flechas e causou " + dano + " de dano ao Boss.");
//                System.out.println("Vida do Boss restante: " + vidaBoss);
//            }
//
//            System.out.println("Mana restante: " + mana);
//        } else {
//            System.out.println("Mana insuficiente para usar o ataque especial.");
//        }
//    }
//}
//
//class Mago extends CriacaoPersonagem {
//    public Mago(String nome, int pontosDeVida, int mana, int dano) {
//        super(nome, pontosDeVida, mana, dano);
//    }
//
//    public void ataqueEspecial(int vidaMonstro1, int vidaMonstro2, int vidaBoss, boolean bossApareceu) {
//        if (mana >= 50) {
//            int dano = 50;
//            mana -= 50;
//
//            if (vidaMonstro1 > 0) {
//                vidaMonstro1 -= dano;
//                System.out.println("Você usou o ataque especial Bola de Fogo e causou " + dano + " de dano ao Monstro 1.");
//                System.out.println("Vida do Monstro 1 restante: " + vidaMonstro1);
//            }
//
//            if (vidaMonstro2 > 0) {
//                vidaMonstro2 -= dano;
//                System.out.println("Você usou o ataque especial Bola de Fogo e causou " + dano + " de dano ao Monstro 2.");
//                System.out.println("Vida do Monstro 2 restante: " + vidaMonstro2);
//            }
//
//            if (vidaBoss > 0 && bossApareceu) {
//                vidaBoss -= dano;
//                System.out.println("Você usou o ataque especial Bola de Fogo e causou " + dano + " de dano ao Boss.");
//                System.out.println("Vida do Boss restante: " + vidaBoss);
//            }
//
//            System.out.println("Mana restante: " + mana);
//        } else {
//            System.out.println("Mana insuficiente para usar o ataque especial.");
//        }
//    }
//}
//
//class Assassino extends CriacaoPersonagem {
//    public Assassino(String nome, int pontosDeVida, int mana, int dano) {
//        super(nome, pontosDeVida, mana, dano);
//    }
//
//    public void ataqueEspecial(int vidaMonstro1, int vidaMonstro2, int vidaBoss, boolean bossApareceu) {
//        if (mana >= 40) {
//            int dano = 50;
//            mana -= 40;
//
//            if (vidaMonstro1 > 0) {
//                vidaMonstro1 -= dano;
//                System.out.println("Você usou o ataque especial Golpe Fatal e causou " + dano + " de dano ao Monstro 1.");
//                System.out.println("Vida do Monstro 1 restante: " + vidaMonstro1);
//            }
//
//            if (vidaMonstro2 > 0) {
//                vidaMonstro2 -= dano;
//                System.out.println("Você usou o ataque especial Golpe Fatal e causou " + dano + " de dano ao Monstro 2.");
//                System.out.println("Vida do Monstro 2 restante: " + vidaMonstro2);
//            }
//
//            if (vidaBoss > 0 && bossApareceu) {
//                vidaBoss -= dano;
//                System.out.println("Você usou o ataque especial Golpe Fatal e causou " + dano + " de dano ao Boss.");
//                System.out.println("Vida do Boss restante: " + vidaBoss);
//            }
//
//            System.out.println("Mana restante: " + mana);
//        } else {
//            System.out.println("Mana insuficiente para usar o ataque especial.");
//        }
//    }
//}
//
//class Bardo extends CriacaoPersonagem {
//    public Bardo(String nome, int pontosDeVida, int mana, int dano) {
//        super(nome, pontosDeVida, mana, dano);
//    }
//
//    public void ataqueEspecial(int vidaMonstro1, int vidaMonstro2, int vidaBoss, boolean bossApareceu) {
//        if (mana >= 30) {
//            int cura = 40;
//            mana -= 30;
//
//            if (vidaMonstro1 > 0) {
//                vidaMonstro1 += cura;
//                System.out.println("Você usou o ataque especial Canção de Cura e curou o Monstro 1 em " + cura + " pontos de vida.");
//                System.out.println("Vida do Monstro 1: " + vidaMonstro1);
//            }
//
//            if (vidaMonstro2 > 0) {
//                vidaMonstro2 += cura;
//                System.out.println("Você usou o ataque especial Canção de Cura e curou o Monstro 2 em " + cura + " pontos de vida.");
//                System.out.println("Vida do Monstro 2: " + vidaMonstro2);
//            }
//
//            if (vidaBoss > 0 && bossApareceu) {
//                vidaBoss += cura;
//                System.out.println("Você usou o ataque especial Canção de Cura e curou o Boss em " + cura + " pontos de vida.");
//                System.out.println("Vida do Boss: " + vidaBoss);
//            }
//
//            System.out.println("Mana restante: " + mana);
//        } else {
//            System.out.println("Mana insuficiente para usar o ataque especial.");
//        }
//    }
//}