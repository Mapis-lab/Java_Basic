package Players;

import Game_structure.Datos;

import javax.swing.JOptionPane;

public class Jugadores {

    public void datos_del_jugador() {

        Datos dt = new Datos();
        Partidas_gp  pgp = new Partidas_gp();
        Llenar_listas llenar = new Llenar_listas();

        int op =Integer.parseInt(JOptionPane.showInputDialog("Elige una opción\n" +
            "Escribe 1 si eres un jugador ya registrado\n" +
            "Escribe 2 si eres un jugador nuevo\n"));

        switch (op) {
            case 1:

                Datos.name = JOptionPane.showInputDialog("Escribe como te registraste:");
                for (int a = 0; a <= Llenar_listas.contador_jugadores; a++) {
                    if (Llenar_listas.nombres[a].equals(Datos.name)) {
                        Llenar_listas.contador_jugadores = a;
                        break;
                    }
                }
                dt.datosd();
                pgp.partidas_pg();
                break;

            case 2:
                dt.datosd();
                llenar.llenar_datos_basicos_jn();
                pgp.partidas_pg();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida");
                break;
        }
    }
}


