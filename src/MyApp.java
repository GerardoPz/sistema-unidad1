import clasesAbs.*;
import java.util.ArrayList;
import java.util.Date;

public class MyApp {
    private ArrayList<A_Directivo> directivos;
    private ArrayList<A_Natural> naturales;

    public MyApp() {
        directivos = new ArrayList<>();
        naturales = new ArrayList<>();
    }

    public static String formatearTelefono(String numero) {
        numero = numero.replaceAll("\\D+", "");

        String codigoPais = "+52";
        String parte1 = numero.substring(0, 3);  // Primeros 3 dígitos
        String parte2 = numero.substring(3, 6);  // Siguientes 3 dígitos
        String parte3 = numero.substring(6);     // Últimos 4 dígitos

        return String.format("%s %s %s %s", codigoPais, parte1, parte2, parte3);
    }


    public void agregarAsociadoDirectivo() {
        A_Directivo asociado = new A_Directivo();
        asociado.setNumeroSocio();
        asociado.setNombre(TJOption.leerString("Ingresa el nombre"));
        asociado.setFechaIngreso(new Date());
        String numeroTelefonico;
        boolean esNumeroValido = false;

        do {
            numeroTelefonico = TJOption.leerString("Ingresa un numero telefonico 10 digitos");
            if (numeroTelefonico.matches("\\d{10}")) {
                esNumeroValido = true;
            }
        } while (!esNumeroValido);

        asociado.setNumeroTelefono(formatearTelefono(numeroTelefonico));
        String cargo;

        do {
            cargo = TJOption.desplegaCargoDirec();
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
        asociado.setNumeroSocio();
        asociado.setNombre(TJOption.leerString("Ingresa el nombre"));
        asociado.setFechaIngreso(new Date());

        String numeroTelefonico;
        boolean esNumeroValido = false;

        do {
            numeroTelefonico = TJOption.leerString("Ingresa un numero telefonico 10 digitos");
            if (numeroTelefonico.matches("\\d{10}")) {
                esNumeroValido = true;
            }
        } while (!esNumeroValido);

        asociado.setNumeroTelefono(formatearTelefono(numeroTelefonico));

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