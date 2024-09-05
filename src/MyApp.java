import clasesAbs.A_Directivo;
import clasesAbs.Asociado;
import clasesAbs.TJOption;

import javax.swing.*;
import java.util.Date;

public class MyApp {
        private Asociado lalaIto[];
        private byte j;

        public MyApp(byte tam) {
            lalaIto=new Asociado[tam];
            j=-1;
        }

        public boolean arrayVacio() {
            return(j==-1);
        }

        public boolean espacioArray() {
            return (j<lalaIto.length-1);
        }


        public Asociado agregarAsociado() {
            Asociado as = new Asociado();
            as.setNumeroSocio(TJOption.leerInt("Ingresa tu numero de socio"));
            as.setNombre(TJOption.leerString("Ingrese nombre de asociado"));
            as.setFechaIngreso(new Date());
            as.setNumeroTelefono(TJOption.leerInt("Ingresa tu numero de telefono"));
            return as;
        }

        public A_Directivo agregarDirectivo(){
            A_Directivo es = new A_Directivo();
            es.setNumeroSocio(TJOption.leerInt("Ingresa tu numero de socio"));
            es.setNombre(TJOption.leerString("Ingrese nombre de asociado"));
            es.setFechaIngreso(new Date());
            es.setNumeroTelefono(TJOption.leerInt("Ingresa tu numero de telefono"));
            es.setPuesto(TJOption.leerString("Ingresa tu puesto en la mesa directiva"));
            es.setCargo(TJOption.desplegaCargoDirec());
            //es.setFechaPosecion(); NO SE OCUPAR DATE
            return es;
        }

        private boolean cargoDirectivo(A_Directivo directivo) {
            boolean cargoOcupado = false;
            for (int i = 0; i <= j; i++) {
                if (lalaIto[i] != null && lalaIto[i].equals(directivo)) {
                    cargoOcupado = true;
                    break;
                }
            }
            if (cargoOcupado) {
                // Aquí puedes colocar un mensaje de alerta o hacer algo al respecto
                System.out.println("El cargo ya está ocupado por el directivo: " + directivo);
            }
            return cargoOcupado;
        }

    public void Directivo() {
        if (espacioArray()) {
            j++;
            lalaIto[j]=agregarDirectivo();
        }
    }

    public String imprimeDatosArray() {
        String cad="";
        for (byte i=0;i<=j;i++) { //j: significa el tamaño que tiene el arreglo
            cad+=i+"["+lalaIto[i].toString()+"]\n";
        }
        return cad;
    }
}
