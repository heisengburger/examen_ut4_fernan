package ets.examen;

/**
 * Mainb.
 */
public class Mainb {
    /**
     * La entrada de la aplicacion.
     *
     * @param args primerAnioPrimo, anioInicial
     */
    public static void main(String[] args) {
        int primerAnioPrimo = 0;
        int anioInicial = 2008;
        while (anioInicial <= 2033) {
            if (primerAnioPrimo == 0) {
                boolean isPrimo = true;
                for (int i = anioInicial - 1; i > 1; i--) {
                    if (anioInicial % i == 0) {
                        isPrimo = false;
                    }
                }
                if (isPrimo) {
                    primerAnioPrimo = anioInicial;
                }
            }
            anioInicial++;
            continue;
        }
        msg(primerAnioPrimo);
        return;
    }

    /**
     * Msg.
     *
     * @param primerAnioPrimo the primer anio primo
     */

    public static void msg(int primerAnioPrimo){
        System.out.println("El primer año primo encontrado es " + primerAnioPrimo);
        if (primerAnioPrimo % 2 != 0) {
        } else System.out.println("que es un año par");
        if (primerAnioPrimo > 2008) {
            if (primerAnioPrimo < 2033) {
                System.out.println("y está comprendido entre 2008 y 2033");
            }
        }
    }
}
