package solucionclaseleerarchivos;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class LeerArchivoExcel {

    public static void LeerArchivoExcel() {
        //Se abre el archivo
        try {
            Scanner entrada = new Scanner(new File("data/"
                    + "tabula-FWC_2018_Squadlists_4.csv"));
            int sumagoles = 0;
            int sumaaltura = 0;
            int contador = 0;
            double promediogoles = 0;
            double promedioaltura = 0;
            while (entrada.hasNext()) {
                contador = contador + 1;
                String linea = entrada.nextLine();
                ArrayList<String> informeporpartes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                int datogoles = Integer.parseInt(informeporpartes.get(11));
                int datoaltura = Integer.parseInt(informeporpartes.get(9));
                sumagoles = sumagoles + datogoles;
                sumaaltura = sumaaltura + datoaltura;
            } // fin de while
            entrada.close();
            promediogoles = sumagoles / contador;
            promedioaltura = sumaaltura / contador;
            System.out.printf("El promedio de goles es : %.2f\nEl promedio de "
                    + "altura es: %.2f\n", promediogoles, promedioaltura);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo LeerArchivoExcel
    // cierra el archivo y termina la aplicacion

} // fin de la clase LeerArchivoExcel
