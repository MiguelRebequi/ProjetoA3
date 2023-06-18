package jogo.tela;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import jogo.Arqueiro;
import jogo.Assassino;
import jogo.Bardo;
import jogo.Guerreiro;
import jogo.Mago;

public class CriacaoDePersonagem extends javax.swing.JFrame {

    private String nome = "Sem nome";
    private int vida;
    private int mana;
    private int dano;
    private String classe = "Sem classe";
    private String classe1, classe2, classe3, classe4, classe5;
    private String player1, player2, player3, player4, player5;
    private int vida1, vida2, vida3, vida4, vida5;
    private int dano1, dano2, dano3, dano4, dano5;

    private Arqueiro arqueiro;
    private Assassino assassino;
    private Bardo bardo;
    private Guerreiro guerreiro;
    private Mago mago;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public CriacaoDePersonagem() {
        initComponents();
        corCriacao();
        // CRIAÇÃO DO PLAYER 1
//        if (lbl_espaco1.getText() != null && lbl_espaco2.getText().isEmpty() && lbl_espaco3.getText().isEmpty() && lbl_espaco4.getText().isEmpty() && lbl_espaco5.getText().isEmpty()) {
//            jLabel1.setForeground(Color.BLUE);
//        } // CRIAÇÃO DO PLAYER 2
//        else if (!lbl_espaco1.getText().isEmpty() && lbl_espaco2.getText().isEmpty() && lbl_espaco3.getText().isEmpty() && lbl_espaco4.getText().isEmpty() && lbl_espaco5.getText().isEmpty()) {
//            jLabel1.setForeground(Color.RED);
//            jLabel1.setText("Criação do Player 2");
//        }
//        // CRIAÇÃO DO PLAYER 3
//        if (lbl_espaco1.getText() != null && lbl_espaco2.getText() != null && lbl_espaco4 == null && lbl_espaco5 == null) {
//            jLabel1.setForeground(Color.GREEN);
//            jLabel1.setText("Criação do Player 3");
//        }
//        // CRIAÇÃO DO PLAYER 4
//        if (lbl_espaco1.getText() != null && lbl_espaco2.getText() != null && lbl_espaco3.getText() != null && lbl_espaco5 == null) {
//            jLabel1.setForeground(Color.YELLOW);
//            jLabel1.setText("Criação do Player 4");
//        }
//        // CRIAÇÃO DO PLAYER 5
//        if (lbl_espaco1.getText() != null && lbl_espaco2.getText() != null && lbl_espaco3.getText() != null && lbl_espaco4 != null && lbl_espaco5 == null) {
//            jLabel1.setForeground(Color.MAGENTA);
//            jLabel1.setText("Criação do Player 5");
//        }
    }

    public void exibir() {
        this.mana = 50;
        alocarHPeDANO();
        verificarclasse();
        //PRIMEIRA LINHA
        if (cb_arqueiro.isSelected() || cb_assassino.isSelected() || cb_bardo.isSelected() || cb_guerreiro.isSelected() || cb_mago.isSelected()) {
            if (lbl_espaco1.getText() == null || lbl_espaco1.getText().isEmpty()) {
                player1 = txt_nome.getText();
                classe1 = classe;
                vida1 = vida;
                dano1 = dano;
                player1 = player1.substring(0, 1).toUpperCase() + player1.substring(1);
                String textoFormatado = "Nome do player 1: <font color='blue'>" + player1 + "</font>  Classe: " + classe1 + "  Vida: " + vida1 + "  Mana: " + mana + "  Modificador de dano: " + dano1;
                lbl_espaco1.setText("<html>" + textoFormatado + "</html>");
            } else if (lbl_espaco2.getText().isEmpty() && !classe1.equals(classe)) {
                player2 = txt_nome.getText();
                classe2 = classe;
                vida2 = vida;
                dano2 = dano;
                player2 = player2.substring(0, 1).toUpperCase() + player2.substring(1);
                String textoFormatado = "Nome do player 2: <font color='red'>" + player2 + "</font>  Classe: " + classe2 + "  Vida: " + vida2 + "  Mana: " + mana + "  Modificador de dano: " + dano2;
                lbl_espaco2.setText("<html>" + textoFormatado + "</html>");
            } else if (!lbl_espaco2.getText().isEmpty() && lbl_espaco3.getText().isEmpty() && classe2 != null && !classe2.equals(classe)) {
                player3 = txt_nome.getText();
                classe3 = classe;
                vida3 = vida;
                dano3 = dano;
                player3 = player3.substring(0, 1).toUpperCase() + player3.substring(1);
                String textoFormatado = "Nome do player 3: <font color='green'>" + player3 + "</font>  Classe: " + classe3 + "  Vida: " + vida3 + "  Mana: " + mana + "  Modificador de dano: " + dano3;
                lbl_espaco3.setText("<html>" + textoFormatado + "</html>");
            } else {
                boolean classeRepetida = false;

                // Verificar se a classe já foi selecionada por algum jogador
                for (int i = 1; i <= 3; i++) {
                    String classeJogador = null;
                    switch (i) {
                        case 1:
                            classeJogador = classe1;
                            break;
                        case 2:
                            classeJogador = classe2;
                            break;
                        case 3:
                            classeJogador = classe3;
                            break;
                    }

                    if (classeJogador != null && classeJogador.equals(classe)) {
                        classeRepetida = true;
                        break;
                    }
                }

                // Adicionar quarto jogador se a classe não estiver repetida
                if (!classeRepetida && classe4 == null && !lbl_espaco3.getText().isEmpty()) {
                    player4 = txt_nome.getText();
                    classe4 = classe;
                    vida4 = vida;
                    dano4 = dano;
                    player4 = player4.substring(0, 1).toUpperCase() + player4.substring(1);
                    String textoFormatado = "Nome do player 4: <font color='yellow'>" + player4 + "</font>  Classe: " + classe4 + "  Vida: " + vida4 + "  Mana: " + mana + "  Modificador de dano: " + dano4;
                    lbl_espaco4.setText("<html>" + textoFormatado + "</html>");
                } else {
                    // Adicionar quinto jogador se a classe não estiver repetida
                    boolean classeRepetida5 = false;

                    for (int i = 1; i <= 4; i++) {
                        String classeJogador = null;
                        switch (i) {
                            case 1:
                                classeJogador = classe1;
                                break;
                            case 2:
                                classeJogador = classe2;
                                break;
                            case 3:
                                classeJogador = classe3;
                                break;
                            case 4:
                                classeJogador = classe4;
                                break;
                        }

                        if (classeJogador != null && classeJogador.equals(classe)) {
                            classeRepetida5 = true;
                            break;
                        }
                    }

                    if (!classeRepetida5 && classe5 == null && !lbl_espaco4.getText().isEmpty()) {
                        player5 = txt_nome.getText();
                        classe5 = classe;
                        vida5 = vida;
                        player5 = player5.substring(0, 1).toUpperCase() + player5.substring(1);
                        String textoFormatado = "Nome do player 5: <font color='purple'>" + player5 + "</font>  Classe: " + classe5 + "  Vida: " + vida5 + "  Mana: " + mana + "  Modificador de dano: " + dano5;
                        lbl_espaco5.setText("<html>" + textoFormatado + "</html>");
                    }
                }
            }
        }
        desabilitarClasse();
    }

    public void alocarHPeDANO() {
        vida = 0;
        if (cob_hp.getSelectedIndex() == 0) {
            vida = 5;
        }
        if (cob_hp.getSelectedIndex() == 1) {
            vida = 10;
        }
        if (cob_hp.getSelectedIndex() == 2) {
            vida = 15;
        }
        if (cob_hp.getSelectedIndex() == 3) {
            vida = 20;
        }
        if (cob_hp.getSelectedIndex() == 4) {
            vida = 25;
        }
        if (cob_hp.getSelectedIndex() == 5) {
            vida = 30;
        }
        if (cob_hp.getSelectedIndex() == 6) {
            vida = 35;
        }
        if (cob_hp.getSelectedIndex() == 7) {
            vida = 40;
        }
    }

    public void verificarclasse() {
        if (cb_arqueiro.isSelected()) {
            classe = "Arqueiro";

        }
        if (cb_assassino.isSelected()) {
            classe = "Assassino";

        }
        if (cb_bardo.isSelected()) {
            classe = "Bardo";

        }
        if (cb_guerreiro.isSelected()) {
            classe = "Guerreiro";

        }
        if (cb_mago.isSelected()) {
            classe = "Mago";

        }

    }

    public void desabilitarClasse() {
        // Desabilitar a classe do Arqueiro quando já for selecionada
        if ("Arqueiro".equals(classe1)
                || "Arqueiro".equals(classe2)
                || "Arqueiro".equals(classe3)
                || "Arqueiro".equals(classe4)
                || "Arqueiro".equals(classe5)) {
            cb_arqueiro.setVisible(false);
            cb_arqueiro.setEnabled(false);
        }

// Desabilitar a classe do Assassino quando já for selecionada
        if ("Assassino".equals(classe1)
                || "Assassino".equals(classe2)
                || "Assassino".equals(classe3)
                || "Assassino".equals(classe4)
                || "Assassino".equals(classe5)) {
            cb_assassino.setVisible(false);
            cb_assassino.setEnabled(false);
        }

// Desabilitar a classe do Bardo quando já for selecionada
        if ("Bardo".equals(classe1)
                || "Bardo".equals(classe2)
                || "Bardo".equals(classe3)
                || "Bardo".equals(classe4)
                || "Bardo".equals(classe5)) {
            cb_bardo.setVisible(false);
            cb_bardo.setEnabled(false);
        }

// Desabilitar a classe do Guerreiro quando já for selecionada
        if ("Guerreiro".equals(classe1)
                || "Guerreiro".equals(classe2)
                || "Guerreiro".equals(classe3)
                || "Guerreiro".equals(classe4)
                || "Guerreiro".equals(classe5)) {
            cb_guerreiro.setVisible(false);
            cb_guerreiro.setEnabled(false);
        }

// Desabilitar a classe do Mago quando já for selecionada
        if ("Mago".equals(classe1)
                || "Mago".equals(classe2)
                || "Mago".equals(classe3)
                || "Mago".equals(classe4)
                || "Mago".equals(classe5)) {
            cb_mago.setVisible(false);
            cb_mago.setEnabled(false);
        }

    }

    public void corCriacao() {
        if (lbl_titulo.getText().equals("Criação do Player 1") && lbl_espaco1.getText().isEmpty()) {
            lbl_titulo.setForeground(Color.BLUE);
        }
        // CRIAÇÃO DO PLAYER 2
    }

    public void instanciadorDePersonagem() {
        if (cb_arqueiro.isSelected() && txt_nome.getText().isEmpty()) {
            if (classe1.equalsIgnoreCase("Arqueiro")) {
                arqueiro = new Arqueiro(player1, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Arqueiro" + player1 + "," + vida + "," + mana + "," + dano);
            } else if (classe2.equalsIgnoreCase("Arqueiro")) {
                arqueiro = new Arqueiro(player2, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Arqueiro" + player2 + "," + vida + "," + mana + "," + dano);
            } else if (classe3.equalsIgnoreCase("Arqueiro")) {
                arqueiro = new Arqueiro(player3, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Arqueiro" + player3 + "," + vida + "," + mana + "," + dano);
            } else if (classe4.equalsIgnoreCase("Arqueiro")) {
                arqueiro = new Arqueiro(player4, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Arqueiro" + player4 + "," + vida + "," + mana + "," + dano);
            } else if (classe5.equalsIgnoreCase("Arqueiro")) {
                arqueiro = new Arqueiro(player5, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Arqueiro" + player5 + "," + vida + "," + mana + "," + dano);
            }
        }

        if (cb_assassino.isSelected() && txt_nome.getText().isEmpty()) {
            if (classe1.equalsIgnoreCase("Assassino")) {
                assassino = new Assassino(player1, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Assassino" + player1 + "," + vida + "," + mana + "," + dano);
            } else if (classe2.equalsIgnoreCase("Assassino")) {
                assassino = new Assassino(player2, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Assassino" + player2 + "," + vida + "," + mana + "," + dano);
            } else if (classe3.equalsIgnoreCase("Assassino")) {
                assassino = new Assassino(player3, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Assassino" + player3 + "," + vida + "," + mana + "," + dano);
            } else if (classe4.equalsIgnoreCase("Assassino")) {
                assassino = new Assassino(player4, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Assassino" + player4 + "," + vida + "," + mana + "," + dano);
            } else if (classe5.equalsIgnoreCase("Assassino")) {
                assassino = new Assassino(player5, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Assassino" + player5 + "," + vida + "," + mana + "," + dano);
            }
        }

        if (cb_bardo.isSelected() && txt_nome.getText().isEmpty()) {
            if (classe1.equalsIgnoreCase("Bardo")) {
                bardo = new Bardo(player1, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Bardo" + player1 + "," + vida + "," + mana + "," + dano);
            } else if (classe2.equalsIgnoreCase("Bardo")) {
                bardo = new Bardo(player2, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Bardo" + player2 + "," + vida + "," + mana + "," + dano);
            } else if (classe3.equalsIgnoreCase("Bardo")) {
                bardo = new Bardo(player3, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Bardo" + player3 + "," + vida + "," + mana + "," + dano);
            } else if (classe4.equalsIgnoreCase("Bardo")) {
                bardo = new Bardo(player4, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Bardo" + player4 + "," + vida + "," + mana + "," + dano);
            } else if (classe5.equalsIgnoreCase("Bardo")) {
                bardo = new Bardo(player5, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Bardo" + player5 + "," + vida + "," + mana + "," + dano);
            }
        }

        if (cb_guerreiro.isSelected() && txt_nome.getText().isEmpty()) {
            if (classe1.equalsIgnoreCase("Guerreiro")) {
                guerreiro = new Guerreiro(player1, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Guerreiro" + player1 + "," + vida + "," + mana + "," + dano);
            } else if (classe2.equalsIgnoreCase("Guerreiro")) {
                guerreiro = new Guerreiro(player2, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Guerreiro" + player2 + "," + vida + "," + mana + "," + dano);
            } else if (classe3.equalsIgnoreCase("Guerreiro")) {
                guerreiro = new Guerreiro(player3, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Guerreiro" + player3 + "," + vida + "," + mana + "," + dano);
            } else if (classe4.equalsIgnoreCase("Guerreiro")) {
                guerreiro = new Guerreiro(player4, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Guerreiro" + player4 + "," + vida + "," + mana + "," + dano);
            } else if (classe5.equalsIgnoreCase("Guerreiro")) {
                guerreiro = new Guerreiro(player5, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Guerreiro" + player5 + "," + vida + "," + mana + "," + dano);
            }
        }

        if (cb_mago.isSelected() && txt_nome.getText().isEmpty()) {
            if (classe1.equalsIgnoreCase("Mago")) {
                mago = new Mago(player1, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Mago" + player1 + "," + vida + "," + mana + "," + dano);
            } else if (classe2.equalsIgnoreCase("Mago")) {
                mago = new Mago(player2, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Mago" + player2 + "," + vida + "," + mana + "," + dano);
            } else if (classe3.equalsIgnoreCase("Mago")) {
                mago = new Mago(player3, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Mago" + player3 + "," + vida + "," + mana + "," + dano);
            } else if (classe4.equalsIgnoreCase("Mago")) {
                mago = new Mago(player4, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Mago" + player4 + "," + vida + "," + mana + "," + dano);
            } else if (classe5.equalsIgnoreCase("Mago")) {
                mago = new Mago(player5, vida, mana, dano);
                JOptionPane.showMessageDialog(null, "Teste:" + "new Mago" + player5 + "," + vida + "," + mana + "," + dano);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_imagem = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        cb_mago = new javax.swing.JCheckBox();
        cb_assassino = new javax.swing.JCheckBox();
        cb_bardo = new javax.swing.JCheckBox();
        cb_arqueiro = new javax.swing.JCheckBox();
        cb_guerreiro = new javax.swing.JCheckBox();
        lbl_espaco2 = new javax.swing.JLabel();
        lbl_espaco5 = new javax.swing.JLabel();
        lbl_espaco1 = new javax.swing.JLabel();
        lbl_espaco3 = new javax.swing.JLabel();
        lbl_espaco4 = new javax.swing.JLabel();
        btn_atualizar = new javax.swing.JButton();
        cob_hp = new javax.swing.JComboBox<>();
        btn_editar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        lbl_dano = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Gabriel Belmont.gif"))); // NOI18N
        lbl_imagem.setLabelFor(lbl_imagem);
        lbl_imagem.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lbl_imagem.setMaximumSize(new java.awt.Dimension(100, 100));
        lbl_imagem.setMinimumSize(new java.awt.Dimension(100, 100));
        lbl_imagem.setOpaque(true);
        lbl_imagem.setPreferredSize(new java.awt.Dimension(120, 120));
        getContentPane().add(lbl_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 220, 330));

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 150, 25));

        cb_mago.setText("Mago");
        cb_mago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_magoActionPerformed(evt);
            }
        });
        getContentPane().add(cb_mago, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, 210, -1));

        cb_assassino.setText("Assassino");
        cb_assassino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_assassinoActionPerformed(evt);
            }
        });
        getContentPane().add(cb_assassino, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 210, -1));

        cb_bardo.setText("Bardo");
        cb_bardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bardoActionPerformed(evt);
            }
        });
        getContentPane().add(cb_bardo, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 410, 210, -1));

        cb_arqueiro.setText("Arqueiro");
        cb_arqueiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_arqueiroActionPerformed(evt);
            }
        });
        getContentPane().add(cb_arqueiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 370, 210, -1));

        cb_guerreiro.setText("Guerreiro");
        cb_guerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_guerreiroActionPerformed(evt);
            }
        });
        getContentPane().add(cb_guerreiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 430, 210, -1));
        getContentPane().add(lbl_espaco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 540, 15));
        getContentPane().add(lbl_espaco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 540, 15));
        getContentPane().add(lbl_espaco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 540, 20));
        getContentPane().add(lbl_espaco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 540, 15));
        getContentPane().add(lbl_espaco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 540, 15));

        btn_atualizar.setText("Atualizar");
        btn_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 730, 140, 70));

        cob_hp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5 HP", "10 HP", "15 HP", "20 HP", "25 HP", "30 HP", "35 HP", "40 HP" }));
        cob_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cob_hpActionPerformed(evt);
            }
        });
        getContentPane().add(cob_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 500, -1, 30));

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 730, 140, 70));

        jButton1.setText("Jogar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 730, 130, 70));

        lbl_titulo.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        lbl_titulo.setText("Criação do Player 1");
        getContentPane().add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 290, 140, -1));

        lbl_dano.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbl_dano, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 540, 260, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        String nome = txt_nome.getText();
        try {
            Thread.sleep(2000); // Atraso de 2 segundos
            txt_nome.setText("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txt_nomeActionPerformed

    private void cb_magoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_magoActionPerformed
        if (cb_mago.isSelected() && !nome.isEmpty()) {
            cb_arqueiro.setSelected(false);
            cb_assassino.setSelected(false);
            cb_bardo.setSelected(false);
            cb_guerreiro.setSelected(false);

        }
    }//GEN-LAST:event_cb_magoActionPerformed

    private void btn_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarActionPerformed
        exibir();
        txt_nome.setText("");
        if (lbl_titulo.getText().equals("Criação do Player 1") && !lbl_espaco1.getText().isEmpty()) {
            lbl_titulo.setForeground(Color.RED);
            lbl_titulo.setText("Criação do Player 2");
        }
        if (lbl_titulo.getText().equals("Criação do Player 2") && !lbl_espaco2.getText().isEmpty()) {
            lbl_titulo.setForeground(Color.GREEN);
            lbl_titulo.setText("Criação do Player 3");
        }
        if (lbl_titulo.getText().equals("Criação do Player 3") && !lbl_espaco3.getText().isEmpty()) {
            lbl_titulo.setForeground(Color.YELLOW);
            lbl_titulo.setText("Criação do Player 4");
        }
        if (lbl_titulo.getText().equals("Criação do Player 4") && !lbl_espaco4.getText().isEmpty()) {
            lbl_titulo.setForeground(Color.MAGENTA);
            lbl_titulo.setText("Criação do Player 5");
        }
        if (!lbl_espaco1.getText().isEmpty() && !lbl_espaco2.getText().isEmpty() && !lbl_espaco3.getText().isEmpty() && !lbl_espaco4.getText().isEmpty() && !lbl_espaco5.getText().isEmpty()) {
            lbl_imagem.setVisible(false);
            lbl_titulo.setVisible(false);
            cob_hp.setVisible(false);
            lbl_dano.setVisible(false);

        }
        instanciadorDePersonagem();
    }//GEN-LAST:event_btn_atualizarActionPerformed

    private void cob_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cob_hpActionPerformed
        if (cob_hp.getSelectedIndex() >= 0 || cob_hp.getSelectedIndex() <= 4) {
            dano = 20;
            lbl_dano.setText("<html>Seu dano: " + dano + "<br>Obs: quanto maior a sua vida menor o seu dano</html>");
        }
        if (cob_hp.getSelectedIndex() == 5 || cob_hp.getSelectedIndex() == 6) {
            dano = 15;
            lbl_dano.setText("<html>Seu dano: " + dano + "<br>Obs: quanto maior a sua vida menor o seu dano</html>");
        }
        if (cob_hp.getSelectedIndex() == 7) {
            dano = 10;
            lbl_dano.setText("<html>Seu dano: " + dano + "<br>Obs: quanto maior a sua vida menor o seu dano</html>");
        }
    }//GEN-LAST:event_cob_hpActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        String[] opcoes = {"Editar Player 1", "Editar Player 2", "Editar Player 3", "Editar Player 4", "Editar Player 5"};

        UIManager.put("OptionPane.okButtonText", "Confirmar edição");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar edição");

        String edicaoPersonagem = (String) JOptionPane.showInputDialog(null,
                "Selecione uma dessas opções",
                "Editar os status dos players",
                JOptionPane.DEFAULT_OPTION,
                null,
                opcoes,
                DISPOSE_ON_CLOSE);

        if (edicaoPersonagem.equals("Editar Player 1")) {
            UIManager.put("OptionPane.okButtonText", "Confirmar edição do Player 1");
            JOptionPane.showConfirmDialog(null,
                    "Deu certo", "Player 1", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.DEFAULT_OPTION,
                    null);
        }

    }//GEN-LAST:event_btn_editarActionPerformed

    private void cb_arqueiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_arqueiroActionPerformed
        if (cb_arqueiro.isSelected() && !nome.isEmpty()) {
            cb_assassino.setSelected(false);
            cb_bardo.setSelected(false);
            cb_guerreiro.setSelected(false);
            cb_mago.setSelected(false);
            arqueiro = new Arqueiro(txt_nome.getText(), 1, 1, 1);
        }
    }//GEN-LAST:event_cb_arqueiroActionPerformed

    private void cb_assassinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_assassinoActionPerformed
        if (cb_assassino.isSelected() && !nome.isEmpty()) {
            cb_arqueiro.setSelected(false);
            cb_bardo.setSelected(false);
            cb_guerreiro.setSelected(false);
            cb_mago.setSelected(false);
            assassino = new Assassino(txt_nome.getText(), 1, 1, 1);
        }
    }//GEN-LAST:event_cb_assassinoActionPerformed

    private void cb_bardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bardoActionPerformed
        if (cb_bardo.isSelected() && !nome.isEmpty()) {
            cb_arqueiro.setSelected(false);
            cb_assassino.setSelected(false);
            cb_guerreiro.setSelected(false);
            cb_mago.setSelected(false);
            arqueiro = new Arqueiro(txt_nome.getText(), 1, 1, 1);
        }
    }//GEN-LAST:event_cb_bardoActionPerformed

    private void cb_guerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_guerreiroActionPerformed
        if (cb_guerreiro.isSelected() && !nome.isEmpty()) {
            cb_arqueiro.setSelected(false);
            cb_assassino.setSelected(false);
            cb_bardo.setSelected(false);
            cb_mago.setSelected(false);
            arqueiro = new Arqueiro(txt_nome.getText(), 1, 1, 1);
        }
    }//GEN-LAST:event_cb_guerreiroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriacaoDePersonagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JCheckBox cb_arqueiro;
    private javax.swing.JCheckBox cb_assassino;
    private javax.swing.JCheckBox cb_bardo;
    private javax.swing.JCheckBox cb_guerreiro;
    private javax.swing.JCheckBox cb_mago;
    private javax.swing.JComboBox<String> cob_hp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_dano;
    private javax.swing.JLabel lbl_espaco1;
    private javax.swing.JLabel lbl_espaco2;
    private javax.swing.JLabel lbl_espaco3;
    private javax.swing.JLabel lbl_espaco4;
    private javax.swing.JLabel lbl_espaco5;
    private javax.swing.JLabel lbl_imagem;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables
}
