import clasesAbs.A_Directivo;
import clasesAbs.Asociado;
import clasesAbs.TJOption;

import javax.swing.*;
import java.util.Date;

public class MyApp {
    // Arreglo de Asociados Directivos y Naaturles PRUEBA
    // PRUEBA
    static Object[] asociados = new Object[10];
            /*{
            new A_Directivo(1, "Nombre 1", new Date(95, 5, 15), 123, "Asociado 1", "Puesto 1", "GGG", ""),
            new A_Directivo(2, "Nombre 2", new Date(95, 5, 15), 123, "Asociado 2", "Puesto 2", "GGG", ""),
            new A_Directivo(3, "Nombre 3", new Date(95, 5, 15), 123, "Asociado 3", "Puesto 3", "GGG", ""),
            new A_Directivo(4, "Nombre 4", new Date(95, 5, 15), 123, "Asociado 4", "Puesto 4", "GGG", ""),
            new Asociado(0, "String 1", new Date(98, 11, 2), 123, "String tipoAsociado"),
            new Asociado(0, "String 2", new Date(98, 11, 2), 123, "String tipoAsociado"),
            new Asociado(0, "String 3", new Date(98, 11, 2), 123, "String tipoAsociado"),
            new A_Directivo(3, "Nombre 4", new Date(95, 5, 15), 123, "Asociado 3", "Puesto 3", "GGG", ""),
            new A_Directivo(3, "Nombre 5", new Date(95, 5, 15), 123, "Asociado 3", "Puesto 3", "GGG", ""),
            new Asociado(0, "String 4", new Date(98, 11, 2), 123, "String tipoAsociado"),
            new Asociado(0, "String 5", new Date(98, 11, 2), 123, "String tipoAsociado"),
    };*/



    static void listadoDatosAsociadosDirectivos() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<asociados.length; i++) {
            if (asociados[i].getClass() == A_Directivo.class) {
                sb.append(asociados[i].toString()).append("\n");
            }
        }

        TJOption.imprimePantalla(sb.toString());
    }

    static void listadoAsociadosNaturales() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<asociados.length; i++) {
            if (asociados[i].getClass() == Asociado.class) {
                sb.append(asociados[i].toString()).append("\n");
            }
        }

        //TJOption.imprimePantalla(sb.toString());
        JOptionPane.showMessageDialog(null, sb.toString(), "Listado de Asociados Naturales", JOptionPane.INFORMATION_MESSAGE);
    }
}
