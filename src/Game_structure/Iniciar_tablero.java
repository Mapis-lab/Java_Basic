package Game_structure;

public class Iniciar_tablero {

    Tablero tab;

    public static int contador = 0;

    public Iniciar_tablero(Tablero tablero) {
        this.tab = tablero;
    }

    public void iniciar_tablero() {

        tab.crear_tablero();

        for (int a = 0; a < tab.tablero.length; a++) {
            for (int d = 0; d < tab.tablero[a].length; d++) {

                tab.tablero[a][d] = 0;
            }
        }
    }
}
