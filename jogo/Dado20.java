package jogo;

import java.util.Random;
import java.util.Scanner;

public class Dado20 extends CriacaoPersonagem {

    protected int dado1 = 0;
    protected boolean sucesso = true;
    protected boolean critico = true;
    protected int teste;
    protected Scanner tc = new Scanner(System.in);
    protected Random gerador = new Random();
    protected char duplo;
    protected int pot = 1;
    protected char D4curar;
    protected int dado3;
    protected char D4;
    protected int dado2;

    public void dado20() {

        System.out.println("Deseja rolar o D20? ");
        char D20 = tc.next().toUpperCase().charAt(0);

        for (int i = 0; i < 1; i++) {
            dado1 = gerador.nextInt(1, 21);
            System.out.println("O Numero do dado foi: " + dado1);
            if (dado1 >= 8 && dado1 <= 19) {
                System.out.println("Sucesso");
                sucesso = true;
            } else if (dado1 == 1) {
                System.out.println("Deu ruim kkkkkkkkkkkkkkkkk!!!");
                sucesso = false;
            } else if (dado1 == 20) {
                System.out.println("Critico!!!!");
                sucesso = true;
                critico = true;
            } else if (dado1 <= 8 && dado1 != 1) {
                System.out.println("Putz, nao foi dessa vez kk");
                sucesso = false;
            }
        }
    }

}
