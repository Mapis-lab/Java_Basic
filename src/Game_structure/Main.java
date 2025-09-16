package Game_structure;

import Players.Jugadores;
import Players.Llenar_listas;
import Players.Partidas_gp;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        boolean play = true;

        Llenar_listas llenar = new Llenar_listas();
        Partidas_gp partidas_gp = new Partidas_gp();
        Datos dt = new Datos();
        Tablero tab = new Tablero();
        Iniciar_tablero in_tablero = new Iniciar_tablero(tab);
        Ubicar_minas ub_minas = new Ubicar_minas(tab);
        Mostrar_tablero ms_tablero = new Mostrar_tablero();
        Verificar_jugada vf_jugada = new Verificar_jugada(tab);
        Jugadores jugadores = new Jugadores();


        while (play) {

            jugadores.
                    datos_del_jugador();

            in_tablero.iniciar_tablero();
            ub_minas.minas_tablero();
            ms_tablero.mostrar_tablero();
            vf_jugada.inicializacion();

            String respuesta = JOptionPane.showInputDialog(null, "¿Quieres jugar otra partida? si/no");

            if (respuesta.equals("no")) {
                play = false;
                JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
                break;
            }
        }
        StringBuilder resumen = new StringBuilder("Resumen de jugadores:\n");

        for (int i = 0; i <= Llenar_listas.contador_jugadores; i++) {
            resumen.append("Jugador: ").append(Llenar_listas.nombres[i])
                    .append(" | ID: ").append(Llenar_listas.id_unico[i])
                    .append(" | Ganadas: ").append(Llenar_listas.partidas_ganadas[i])
                    .append(" | Perdidas: ").append(Llenar_listas.partidas_perdidas[i])
                    .append("\n");
        }

        JOptionPane.showMessageDialog(null, resumen.toString());

    }
}
