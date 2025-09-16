import Datos_jugadores.Llenar_listas;
import Datos_jugadores.Partidas_gp;
import Juego.Ingresar_jugadas;
import Juego.Mostrar_tablero;
import Juego.Tablero_triqui;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Llenar_listas llenar_listas = new Llenar_listas();
        Tablero_triqui tablero = new Tablero_triqui();
        Ingresar_jugadas ingresar_jugadas = new Ingresar_jugadas();
        Mostrar_tablero mostrar_tablero = new Mostrar_tablero();
        Partidas_gp partidas_gp = new Partidas_gp();

        tablero.llenar_tablero();
        mostrar_tablero.tablero_A_mostrar();

        int op =Integer.parseInt(JOptionPane.showInputDialog("Elige una opción\n" +
                "1. Para nueva pareja de jugadores.\n" +
                "2. Para otra partida de los jugadores actuales.\n"));

        switch (op) {

            case 1:
                llenar_listas.llenar_datos_basicos_jn();
                ingresar_jugadas.realizar_jugada();
                partidas_gp.partidas_pg();
                break;

            case 2:
                ingresar_jugadas.realizar_jugada();
                partidas_gp.partidas_pg();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }
    }
}

