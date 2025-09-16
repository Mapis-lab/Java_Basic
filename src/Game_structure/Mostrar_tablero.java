package Game_structure;

public class Mostrar_tablero {

    Tablero tab = new Tablero();
    public static String[][] tablero_A_mostrar;
    Verificar_jugada verificar_jugada = new Verificar_jugada(tab);

    public void mostrar_tablero() {

        tab.crear_tablero();
        tablero_A_mostrar = new String[Datos.tab_dimension][Datos.tab_dimension];

        for (int a = 0; a < tab.tablero.length; a++) {
            for (int d = 0; d < tab.tablero.length; d++) {
                tablero_A_mostrar[a][d] = "\uD83D\uDDA4" + " ";
                System.out.print(tablero_A_mostrar[a][d]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void llenar_tablero_bomba(int fila, int columna) {

        tab.crear_tablero();

        for (int a = 0; a < tab.tablero.length; a++) {
            for (int d = 0; d < tab.tablero[a].length; d++) {

                if (fila == a && columna == d) {
                    tablero_A_mostrar[a][d] = "❤\uFE0F" + " ";
                }
                System.out.print(tablero_A_mostrar[a][d]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }


    public void llenar_tablero_nobomba(int fila, int columna) {

        tab.crear_tablero();

        for (int a = 0; a < tab.tablero.length; a++) {
            for (int d = 0; d < tab.tablero[a].length; d++) {

                if ( fila == a && columna == d) {
                    tablero_A_mostrar[a][d] = "\uD83E\uDD0D" + " ";
                }
                System.out.print(tablero_A_mostrar[a][d]);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
}