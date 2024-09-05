import clasesAbs.TJOption;

import javax.swing.*;

public class Main {
    // COMENTARIO PRUEBA
    static String[] opciones = {"Agregar Asociado", "Agregar asociado directivo", "Imprimir Lista Asociados Directivos", "Imprimir Lista Asociados Naturales", "SALIR"};



    static void run() {
        String opcion;
        MyApp app = new MyApp((byte)50);
        do {
            opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Sistema Unidad 1", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opcion) {
                case "Agregar Asociado":
                    app.agregarAsociado();
                    break;
                case "Agregar asociado directivo":
                    app.agregarDirectivo();
                    break;
                case "Imprimir Lista Asociados Directivos":
                    app.imprimeDatosArray();
                    break;
                case "Imprimir Lista Asociados Naturales":

                    break;
                default:
                    TJOption.imprimePantalla("Hasta luego");
            }
        } while(!opcion.equals("SALIR"));
    }

    public static void main(String[] args) {
        run();
    }
}