package jogo;

public class D4Dano extends Dado20 {
    

    public void d4dano() {
        dado20();

        if (!sucesso && critico) {
            System.out.println("Que pena ;-;");
        } else if (sucesso && dado1 != 20) {
            System.out.println("\nDeseja rolar o D4? ");
            D4 = tc.next().toUpperCase().charAt(0);
            for (int d = 0; d < 1; d++) {
                dado2 = gerador.nextInt(1, 4);
                System.out.println("Seu dano foi: " + dado2);
            }
        } else if (sucesso && dado1 == 20) {
            System.out.println("\nDeseja rolar o D4? ");
            D4 = tc.next().toUpperCase().charAt(0);
            System.out.println("Acertou ele na mosca!!!");
            for (int d = 0; d < 1; d++) {
                dado2 = gerador.nextInt(1, 4);
                teste = dado2;
                System.out.println("Seu dano duplicado foi: " + (dado2 * 2));
                System.out.println("O numero sem alteracao foi: " + teste);
            }
        }
        
    }

    public int getDado2() {
        return dado2;
    }
}
