/*
 * @author NeuenMartinez
 */
package ColleccionesEj_04;

import Servicios04.PeliculaService;
import java.util.Scanner;

public class ColleccionesEj_04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaService ps = new PeliculaService();
        ps.crearPelicula();
        ps.mostrarPeliculaSegun();
    }

}
