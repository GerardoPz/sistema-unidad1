import clasesAbs.A_Directivo;
import clasesAbs.A_Natural;
import clasesAbs.Asociado;
import clasesAbs.TJOption;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class MyApp {
    private ArrayList<A_Directivo> directivos;
    private ArrayList<A_Natural> naturales;

    public MyApp() {
        directivos = new ArrayList<>();
        naturales = new ArrayList<>();
    }

    public void agregarAsociadoDirectivo() {
        A_Directivo asociado = new A_Directivo();
        asociado.setNumeroSocio(TJOption.leerInt("Numero Socio"));
        asociado.setNombre(TJOption.leerString("Ingresa el nombre"));
        asociado.setFechaIngreso(new Date());
        asociado.setNumeroTelefono(TJOption.leerInt("Numero Telefono"));
        asociado.setTipoAsociado(TJOption.leerString("Tipo Asociado"));

        String cargo;
        do {
            cargo = TJOption.leerString("Cargo");
            if (!esCargoDisponible(cargo)) {
                TJOption.imprimePantalla("El cargo ya está ocupado. Por favor, elija otro cargo.");
            }
        } while (!esCargoDisponible(cargo));

        asociado.setCargo(cargo);
        asociado.setFechaPosecion(new Date());

        directivos.add(asociado); // Agrega el nuevo directivo a la lista
        TJOption.imprimePantalla("Asociado directivo agregado con éxito.");
    }

    public boolean esCargoDisponible(String cargo) {
        for (A_Directivo directivo : directivos) {
            if (directivo.getCargo().equalsIgnoreCase(cargo)) {
                return false;  // Cargo ya ocupado
            }
        }
        return true;
    }

    public String imprimirDirectivos() {
        StringBuilder sb = new StringBuilder("Listado de Asociados Directivos:\n");
        for (A_Directivo directivo : directivos) {
            sb.append(directivo).append("\n");
        }
        return sb.toString();
    }

    public void agregarAsociadoNatural() {
        A_Natural asociado = new A_Natural();
        asociado.setNumeroSocio(TJOption.leerInt("Numero Socio"));
        asociado.setNombre(TJOption.leerString("Ingresa el nombre"));
        asociado.setFechaIngreso(new Date());
        asociado.setNumeroTelefono(TJOption.leerInt("Numero Telefono"));
        asociado.setTipoAsociado(TJOption.leerString("Tipo Asociado"));
        asociado.setCantAport(TJOption.leerInt("Monto de Aportaciones"));
        asociado.setFecUltimaAport(new Date());

        naturales.add(asociado);  // Agrega el asociado natural a la lista
        TJOption.imprimePantalla("Asociado natural agregado con éxito.");
    }

    public String imprimirNatural() {
        StringBuilder sb = new StringBuilder("Listado de Asociados Naturales:\n");
        for (A_Natural natural : naturales) {
            sb.append(natural).append("\n");
        }
        return sb.toString();
    }
}
