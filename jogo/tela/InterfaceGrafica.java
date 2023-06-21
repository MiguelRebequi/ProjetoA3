package jogo.tela;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import jogo.Arqueiro;
import jogo.Assassino;
import jogo.Bardo;
import jogo.Guerreiro;
import jogo.Mago;
import jogo.Personagem;
import jogo.tela.metodo.ExibirPersonagens;
import jogo.tela.metodo.ModificarPlayer;
import jogo.tela.metodo.RedimensionarVetor;

public class InterfaceGrafica extends JFrame {

    public CriacaoDePersonagem cp = new CriacaoDePersonagem();
    public InterfaceGrafica() {
        initComponents();
        lbl_boss.setVisible(false);
        lbl_vidaboss.setVisible(false);
        pb_boss.setVisible(false);
        lbl_dados.setVisible(false);
        CriacaoDePersonagem cp = new CriacaoDePersonagem();
//        RedimensionarVetor rv = new RedimensionarVetor();
//        rv.redimensionarVetor();
        JOptionPane.showMessageDialog(null, "Olá"+cp.classe1);
        habilitarImagem();
    }

    public void habilitarImagem() {
        cp.getClasse1();
//        if (cp.classe1 != null && !cp.classe1.equalsIgnoreCase("Sem classe") && !cp.classe1.equalsIgnoreCase("")) {
//            if (cp.classe1.equalsIgnoreCase("Arqueiro")) {
//                lbl_arqM.setVisible(false);
//                lbl_vidaArq.setVisible(true);
//                pb_arq.setVisible(true);
//
//                desabilitarAssassino();
//                desabilitarBardo();
//                desabilitarGuerreiro();
//            } else if (cp.classe1.equalsIgnoreCase("Assassino")) {
//                desabilitarArqueiro();
//
//                lbl_assas.setVisible(true);
//                lbl_vidaAssas.setVisible(true);
//                pb_assas.setVisible(true);
//
//                desabilitarBardo();
//                desabilitarGuerreiro();
//            } else if (cp.classe1.equalsIgnoreCase("Bardo")) {
//                desabilitarArqueiro();
//                desabilitarAssassino();
//
//                lbl_bardo.setVisible(true);
//                lbl_vidaBardo.setVisible(true);
//                pb_bardo.setVisible(true);
//                
//                desabilitarGuerreiro();
//            } else if (cp.classe1.equalsIgnoreCase("Guerreiro")) {
//                desabilitarArqueiro();
//                desabilitarAssassino();
//                desabilitarBardo();
//
//                lbl_guerr.setVisible(true);
//                lbl_vidaGuer.setVisible(true);
//                pb_guer.setVisible(true);
//
//                
//            } else if (cp.classe1.equalsIgnoreCase("Mago")) {
//                desabilitarArqueiro();
//                desabilitarAssassino();
//                desabilitarBardo();
//                desabilitarGuerreiro();
//                
//                lbl_mago.setVisible(false);
//                lbl_vidaMago.setVisible(false);
//                pb_mago.setVisible(false);
//            }
//        }
//    }
    }

    public void desabilitarArqueiro() {
        lbl_arqM.setVisible(false);
        lbl_vidaArq.setVisible(false);
        pb_arq.setVisible(false);
    }

    public void desabilitarAssassino() {
        lbl_assas.setVisible(false);
        lbl_vidaAssas.setVisible(false);
        pb_assas.setVisible(false);
    }

    public void desabilitarBardo() {
        lbl_bardo.setVisible(false);
        lbl_vidaBardo.setVisible(false);
        pb_bardo.setVisible(false);
    }

    public void desabilitarGuerreiro() {
        lbl_guerr.setVisible(false);
        lbl_vidaGuer.setVisible(false);
        pb_guer.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_guerr = new javax.swing.JLabel();
        lbl_bardo = new javax.swing.JLabel();
        lbl_mago = new javax.swing.JLabel();
        lbl_arqM = new javax.swing.JLabel();
        lbl_assas = new javax.swing.JLabel();
        pb_arq = new javax.swing.JProgressBar();
        lbl_vidaArq = new javax.swing.JLabel();
        pb_bardo = new javax.swing.JProgressBar();
        lbl_vidaBardo = new javax.swing.JLabel();
        pb_guer = new javax.swing.JProgressBar();
        lbl_vidaGuer = new javax.swing.JLabel();
        pb_mago = new javax.swing.JProgressBar();
        lbl_vidaMago = new javax.swing.JLabel();
        bp_monstro02 = new javax.swing.JProgressBar();
        lbl_monstro02 = new javax.swing.JLabel();
        lbl_monstro03 = new javax.swing.JLabel();
        pb_monstro01 = new javax.swing.JProgressBar();
        lbl_monstro01 = new javax.swing.JLabel();
        lbl_vidaMonstro02 = new javax.swing.JLabel();
        lbl_vidamonstro02 = new javax.swing.JLabel();
        pb_assas = new javax.swing.JProgressBar();
        lbl_vidaAssas = new javax.swing.JLabel();
        pb_monstro03 = new javax.swing.JProgressBar();
        lbl_vidamonstro03 = new javax.swing.JLabel();
        lbl_boss = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_atacar = new javax.swing.JButton();
        btn_curar = new javax.swing.JButton();
        btn_ataqueEspecial = new javax.swing.JButton();
        lbl_dados = new javax.swing.JLabel();
        pb_boss = new javax.swing.JProgressBar();
        lbl_vidaboss = new javax.swing.JLabel();
        lbl_cenario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        lbl_guerr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Guerreiro.gif"))); // NOI18N
        getContentPane().add(lbl_guerr);
        lbl_guerr.setBounds(280, 390, 280, 230);

        lbl_bardo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Bardo.gif"))); // NOI18N
        getContentPane().add(lbl_bardo);
        lbl_bardo.setBounds(360, 240, 160, 170);

        lbl_mago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Maga.gif"))); // NOI18N
        getContentPane().add(lbl_mago);
        lbl_mago.setBounds(310, 620, 210, 220);

        lbl_arqM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Arqueiro.png"))); // NOI18N
        getContentPane().add(lbl_arqM);
        lbl_arqM.setBounds(290, 46, 130, 134);

        lbl_assas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Assassino.gif"))); // NOI18N
        getContentPane().add(lbl_assas);
        lbl_assas.setBounds(110, 760, 340, 290);

        pb_arq.setBackground(new java.awt.Color(0, 153, 51));
        pb_arq.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pb_arq);
        pb_arq.setBounds(270, 40, 120, 10);

        lbl_vidaArq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        lbl_vidaArq.setText("jLabel8");
        getContentPane().add(lbl_vidaArq);
        lbl_vidaArq.setBounds(230, 20, 180, 40);

        pb_bardo.setBackground(new java.awt.Color(0, 153, 51));
        pb_bardo.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pb_bardo);
        pb_bardo.setBounds(320, 220, 120, 10);

        lbl_vidaBardo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        getContentPane().add(lbl_vidaBardo);
        lbl_vidaBardo.setBounds(280, 200, 170, 40);

        pb_guer.setBackground(new java.awt.Color(0, 153, 51));
        pb_guer.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pb_guer);
        pb_guer.setBounds(370, 440, 120, 10);

        lbl_vidaGuer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        lbl_vidaGuer.setText("jLabel10");
        getContentPane().add(lbl_vidaGuer);
        lbl_vidaGuer.setBounds(330, 420, 180, 40);

        pb_mago.setBackground(new java.awt.Color(0, 153, 51));
        pb_mago.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pb_mago);
        pb_mago.setBounds(300, 630, 120, 10);

        lbl_vidaMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        getContentPane().add(lbl_vidaMago);
        lbl_vidaMago.setBounds(260, 610, 190, 40);

        bp_monstro02.setBackground(new java.awt.Color(0, 153, 0));
        bp_monstro02.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(bp_monstro02);
        bp_monstro02.setBounds(1330, 510, 120, 10);

        lbl_monstro02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lobisomen01.png"))); // NOI18N
        getContentPane().add(lbl_monstro02);
        lbl_monstro02.setBounds(1310, 520, 160, 149);

        lbl_monstro03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lobisomen02.Png"))); // NOI18N
        getContentPane().add(lbl_monstro03);
        lbl_monstro03.setBounds(1460, 760, 180, 115);

        pb_monstro01.setBackground(new java.awt.Color(0, 153, 51));
        pb_monstro01.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(pb_monstro01);
        pb_monstro01.setBounds(1430, 300, 120, 10);

        lbl_monstro01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imgbin_summoner-sprite-pixel-art-video-game-png.png"))); // NOI18N
        getContentPane().add(lbl_monstro01);
        lbl_monstro01.setBounds(1370, 310, 200, 150);

        lbl_vidaMonstro02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        getContentPane().add(lbl_vidaMonstro02);
        lbl_vidaMonstro02.setBounds(1390, 280, 180, 40);

        lbl_vidamonstro02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        getContentPane().add(lbl_vidamonstro02);
        lbl_vidamonstro02.setBounds(1290, 490, 170, 40);

        pb_assas.setBackground(new java.awt.Color(0, 153, 51));
        pb_assas.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pb_assas);
        pb_assas.setBounds(200, 810, 120, 10);

        lbl_vidaAssas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        lbl_vidaAssas.setText("jLabel17");
        getContentPane().add(lbl_vidaAssas);
        lbl_vidaAssas.setBounds(160, 790, 180, 40);

        pb_monstro03.setBackground(new java.awt.Color(0, 153, 51));
        pb_monstro03.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(pb_monstro03);
        pb_monstro03.setBounds(1440, 740, 120, 10);

        lbl_vidamonstro03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        getContentPane().add(lbl_vidamonstro03);
        lbl_vidamonstro03.setBounds(1400, 720, 170, 40);

        lbl_boss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Boss.gif"))); // NOI18N
        getContentPane().add(lbl_boss);
        lbl_boss.setBounds(1460, 450, 210, 260);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(1030, 870, 730, 150);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(null);

        btn_atacar.setBackground(new java.awt.Color(153, 0, 0));
        btn_atacar.setForeground(new java.awt.Color(255, 255, 255));
        btn_atacar.setText("Atacar");
        btn_atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atacarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_atacar);
        btn_atacar.setBounds(30, 20, 120, 23);

        btn_curar.setBackground(new java.awt.Color(0, 153, 0));
        btn_curar.setForeground(new java.awt.Color(255, 255, 255));
        btn_curar.setText("Curar");
        jPanel2.add(btn_curar);
        btn_curar.setBounds(30, 60, 120, 23);

        btn_ataqueEspecial.setBackground(new java.awt.Color(51, 51, 255));
        btn_ataqueEspecial.setForeground(new java.awt.Color(255, 255, 255));
        btn_ataqueEspecial.setText("Ataque Especial");
        jPanel2.add(btn_ataqueEspecial);
        btn_ataqueEspecial.setBounds(30, 100, 120, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(790, 870, 230, 150);

        lbl_dados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (2).png"))); // NOI18N
        getContentPane().add(lbl_dados);
        lbl_dados.setBounds(900, 680, 103, 103);

        pb_boss.setBackground(new java.awt.Color(0, 153, 51));
        pb_boss.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(pb_boss);
        pb_boss.setBounds(1470, 450, 120, 10);

        lbl_vidaboss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pngwing.com (4)_1.png"))); // NOI18N
        getContentPane().add(lbl_vidaboss);
        lbl_vidaboss.setBounds(1430, 430, 190, 40);

        lbl_cenario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telas/cenario.png"))); // NOI18N
        getContentPane().add(lbl_cenario);
        lbl_cenario.setBounds(0, 0, 1920, 1060);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atacarActionPerformed

        JOptionPane.showMessageDialog(null, "Olá, mundo!");


    }//GEN-LAST:event_btn_atacarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bp_monstro02;
    private javax.swing.JButton btn_atacar;
    private javax.swing.JButton btn_ataqueEspecial;
    private javax.swing.JButton btn_curar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_arqM;
    private javax.swing.JLabel lbl_assas;
    private javax.swing.JLabel lbl_bardo;
    private javax.swing.JLabel lbl_boss;
    private javax.swing.JLabel lbl_cenario;
    private javax.swing.JLabel lbl_dados;
    private javax.swing.JLabel lbl_guerr;
    private javax.swing.JLabel lbl_mago;
    private javax.swing.JLabel lbl_monstro01;
    private javax.swing.JLabel lbl_monstro02;
    private javax.swing.JLabel lbl_monstro03;
    private javax.swing.JLabel lbl_vidaArq;
    private javax.swing.JLabel lbl_vidaAssas;
    private javax.swing.JLabel lbl_vidaBardo;
    private javax.swing.JLabel lbl_vidaGuer;
    private javax.swing.JLabel lbl_vidaMago;
    private javax.swing.JLabel lbl_vidaMonstro02;
    private javax.swing.JLabel lbl_vidaboss;
    private javax.swing.JLabel lbl_vidamonstro02;
    private javax.swing.JLabel lbl_vidamonstro03;
    private javax.swing.JProgressBar pb_arq;
    private javax.swing.JProgressBar pb_assas;
    private javax.swing.JProgressBar pb_bardo;
    private javax.swing.JProgressBar pb_boss;
    private javax.swing.JProgressBar pb_guer;
    private javax.swing.JProgressBar pb_mago;
    private javax.swing.JProgressBar pb_monstro01;
    private javax.swing.JProgressBar pb_monstro03;
    // End of variables declaration//GEN-END:variables
}
