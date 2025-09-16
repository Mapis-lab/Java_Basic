package Players;

import Game_structure.Verificar_jugada;

public class Partidas_gp {
    //Final de la partida cuando el jugador es declarado ganador
    public void partidas_pg() {

        if (Verificar_jugada.contador == 5) {
            Llenar_listas.partidas_ganadas[Llenar_listas.contador_jugadores] += 1;
        } else {
            Llenar_listas.partidas_perdidas[Llenar_listas.contador_jugadores] += 1;
        }
    }
}
