package ets.examen.parte2;

import java.util.ArrayList;

/**
 * The type Main.
 */
public class Main {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Cono cono1 = new Cono();
        Cono cono2 = new Cono();
        Cono cono3 = new Cono();
        Cono cono4 = new Cono();

        ArrayList<Cono> listado = new ArrayList<>();
        listado.add(cono1);
        listado.add(cono2);
        listado.add(cono3);
        listado.add(cono4);

        for (Cono c : listado){
            c.solicitarValores();
        }

        for (Cono c : listado){
            System.out.println(c.toString());
        }
    }
}
