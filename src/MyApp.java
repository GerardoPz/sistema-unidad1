import clasesAbs.A_Directivo;
import clasesAbs.A_Natural;
import clasesAbs.TJOption;

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
        asociado.setNombre(TJOption.leerString("Ingresa el nombre"));
        asociado.setFechaIngreso(new Date());
        asociado.setNumeroTelefono(TJOption.leerInt("Numero Telefono"));

        String cargo;
        do {
            cargo = TJOption.leerString("Cargo en la mesa directiva");
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
        int i = 0;
        do{
            asociado.setAportacion(TJOption.leerInt("Ingrese el monto de su primer aportación"));
            if(asociado.getAportacion() < 2500){
                TJOption.imprimePantalla("Su primer aportación debe ser de al menos $2500");
            }
        } while (asociado.getAportacion() < 2500);
        asociado.setCantAport(i+1);
        asociado.setFecUltimaAport(new Date());
        naturales.add(asociado);  // Agrega el asociado natural a la lista
        TJOption.imprimePantalla("Asociado natural agregado con éxito.");
    }

    public void aportacionesANaturales(){
        int numSocio = (TJOption.leerInt("Ingrese su numero de socio"));
        for(A_Natural asociado : naturales){
            if(asociado.getNumeroSocio() == numSocio){
                float nvAportacion = (TJOption.leerInt("Ingrese el monto de su aportación"));
                asociado.setAportacion(asociado.getAportacion() + nvAportacion);
                asociado.setCantAport(asociado.getCantAport() + 1);
                asociado.setFecUltimaAport(new Date());
            }
        }
        TJOption.imprimePantalla("Aportacion registrada con éxito.");
    }

    public String imprimirNatural() {
        StringBuilder sb = new StringBuilder("Listado de Asociados Naturales:\n");
        for (A_Natural natural : naturales) {
            sb.append(natural).append("\n");
        }
        return sb.toString();
    }
}
