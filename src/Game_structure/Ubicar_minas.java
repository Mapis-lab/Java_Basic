package Game_structure;

import java.util.Random;

public class Ubicar_minas {

    Tablero tab;

    public Ubicar_minas(Tablero tablero) {
        this.tab = tablero;
    }

    public void minas_tablero() {


        tab.crear_tablero();
        Random rand = new Random();
        int fil, col;

        for (int a = 0; a < 7; a++) {
            fil = rand.nextInt(tab.tablero.length);
            col = rand.nextInt(tab.tablero.length);

            if (tab.tablero[fil][col] == 1) {
                a--;
            } else {
                tab.tablero[fil][col] = 1;
            }
        }

    }
}

