import javax.swing.*;

public class Main {
    // COMENTARIO PRUEBA
    static String[] opciones = {"Agregar clasesAbs.Asociado", "Asignar Cargo", "Registrar Pago clasesAbs.Asociado", "Imprimir Lista Asociados Directivos", "Imprimir Lista Asociados Naturales", "SALIR"};



    static void run() {
        String opcion;
        do {
            opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion", "Sistema Unidad 1", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        } while(!opcion.equals("SALIR"));
    }

    public static void main(String[] args) {
        run();
    }
}