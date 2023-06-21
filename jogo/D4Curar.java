package jogo;

public class D4Curar extends Dado20 {

    

    public void D4CURAR() {
        if (pot > 0) {
            dado20();
            if (!sucesso && critico) {
                System.out.println("Que pena ;-;");
            } else if (sucesso && dado1 != 20) {
                System.out.println("Desejar rolar um D4 para curar-se: ");
                D4curar = tc.next().toUpperCase().charAt(0);
                for (int d = 0; d < 1; d++) {
                    dado3 = gerador.nextInt(1, 4);
                    System.out.println("Sua vida foi recuperada em: " + dado3);
                    System.out.println("Poções disponíveis: " + (pot - 1));
                }
            } else if (sucesso && dado1 == 20) {
                System.out.println("\nSeu movimento foi bonificado, lhe concedendo duas escolhas: ");
                System.out.println("Beber duas potions ou beber uma depois atacar? [B] beber mais potions do seu estoque [A] beber depois atacar ");
                duplo = tc.next().toUpperCase().charAt(0);
                switch (duplo) {
                    case 'B':
                        if ((pot - 2) > 0) {
                            for (int d = 0; d < 1; d++) {
                                dado3 = gerador.nextInt(1, 4);
                                teste = dado3;
                                System.out.println("Sua vida foi recuperada em: " + (dado3 * 2));
                                System.out.println("O numero sem alteracao foi: " + teste);
                                System.out.println("Poções disponíveis: " + (pot - 2));
                            }
                        } else {
                            System.out.println("Sem estoque duplo de potion para realizar esse movimento");
                            System.out.println("Logo obrigatoriamente lhe resta a escolha de beber e atacar");
                            for (int d = 0; d < 1; d++) {
                                dado3 = gerador.nextInt(1, 4);
                                System.out.println("Sua vida foi recuperada em: " + dado3);
                                System.out.println("Poções disponíveis: " + (pot - 1));
                            }
                            D4Dano d4dano = new D4Dano();
                            d4dano.d4dano();
                        }
                        break;

                    case 'A':
                        for (int d = 0; d < 1; d++) {
                            dado3 = gerador.nextInt(1, 4);
                            System.out.println("Sua vida foi recuperada em: " + dado3);
                            System.out.println("Poções disponíveis: " + (pot - 1));
                        }
                        D4Dano d4dano = new D4Dano();
                        d4dano.d4dano();
                        break;
                }

            }
        } else {
            System.out.println("Sem poções disponíveis ;-;");
        }
    }

    public int getDado3() {
        return dado3;
    }
    
}
