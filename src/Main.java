import clasesAbs.A_Directivo;
import clasesAbs.Asociado;
import clasesAbs.TJOption;

import javax.swing.*;

public class Main {
    // COMENTARIO PRUEBA
    static String[] opciones = {"Agregar asociado directivo", "Agregar asociado natural", "Imprimir Lista Asociados Directivos", "Imprimir Lista Asociados Naturales", "SALIR"};



    static void run() {
        String opcion;
        MyApp app = new MyApp();
        do {
            opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Sistema Unidad 1", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            switch (opcion) {
                case "Agregar asociado directivo":
                    app.agregarAsociadoDirectivo();
                    break;
                case "Imprimir Lista Asociados Directivos":
                    String listaDirectivos = app.imprimirDirectivos();  // Obtener la lista de directivos
                    TJOption.imprimePantalla(listaDirectivos);
                    break;
                case "Agregar asociado natural":
                    app.agregarAsociadoNatural();
                    break;
                case "Imprimir Lista Asociados Naturales":
                    String listaNaturales = app.imprimirNatural();  // Obtener la lista de naturales
                    TJOption.imprimePantalla(listaNaturales);
                    break;
                default:
                    TJOption.imprimePantalla("HASTA LUEGO");

            }
        } while(!opcion.equals("SALIR"));
    }

    public static void main(String[] args) {
       run();
    }
}