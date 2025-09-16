package Game_structure;

import javax.swing.*;

public class Verificar_jugada {

    Tablero tab;

    public Verificar_jugada(Tablero tablero) {
        this.tab = tablero;
    }

    public static int contador;
    public int fila;
    public int columna;

    public void inicializacion() {

        tab.crear_tablero();
        Mostrar_tablero ms_tablero = new Mostrar_tablero();
        contador = 0;


        boolean ent = false;



        do {
            fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de la fila"));
            columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de la columna"));

            if (fila >= tab.tablero.length && columna >= tab.tablero[0].length) {
                JOptionPane.showMessageDialog(null, "No es válido");
                break;
            }

            for (int a = 0; a < tab.tablero.length; a++) {
                for (int d = 0; d < tab.tablero[a].length; d++) {

                    if (a == fila && d == columna) {
                        if (tab.tablero[a][d] == 1) {
                            ms_tablero.llenar_tablero_bomba(fila, columna);
                            JOptionPane.showMessageDialog(null, "Hay una bomba, ¡perdiste!");
                            ent = true;
                            break;
                        } else {
                            ms_tablero.llenar_tablero_nobomba(fila, columna);
                            JOptionPane.showMessageDialog(null, "No es una bomba, ¡sigue jugando!");
                                contador += 1;
                        }
                    }

                }
                if (ent) break;
            }

            if (contador >= 5) {
                ent = true;
            }
        } while (!ent);

        if (contador >= 5) {
            JOptionPane.showMessageDialog(null, Datos.name+ ", ¡Has ganado!");
        } else  {
            JOptionPane.showMessageDialog(null, Datos.name+ ", inténtalo de nuevo");
        }
    }
}
