package Game_structure;

import javax.swing.JOptionPane;

public class Datos {

    public static int tab_dimension;
    public static String name;
    public static int id_unico;


    public void datosd() {

        tab_dimension = Integer.parseInt(JOptionPane.showInputDialog("Escriba el número que refiera a las dimensiones del tablero, no menor a 6 "));
    }
}
