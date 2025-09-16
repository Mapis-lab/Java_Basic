package Players;

import Game_structure.Datos;
import Game_structure.Verificar_jugada;

import javax.swing.*;

public class Llenar_listas {

//Variables globales
    public int id = 100;
    public int partidas_g, partidas_p = 0;

    public static String[] nombres = new String[10];
    public static int[] id_unico = new int[10];
    public static int[] partidas_ganadas = new int[10];
    public static int[] partidas_perdidas = new int[10];

    public static int contador_jugadores = -1;


//Es para cuando en el inicio de una partida, hay un jugador nuevo
    public void llenar_datos_basicos_jn() {

        Datos.name = JOptionPane.showInputDialog("Escribe tu nombre: ");
        contador_jugadores += 1;

        nombres[contador_jugadores] = Datos.name;
        id_unico[contador_jugadores] = id + contador_jugadores + 1;
        partidas_ganadas[contador_jugadores] = 0;
        partidas_perdidas[contador_jugadores] = 0;

    }
}