package Servicios04;

import Entidades04.Pelicula;
import Utilidades04.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class PeliculaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> ListaPelis = new ArrayList<>();
    boolean aux = true;

    public void crearPelicula() {
        do {
            System.out.println("Ingresar el nombre de la pelicula: ");
            String peli = leer.next();
            System.out.println("Ingresar el nombre del autor: ");
            String nom = leer.next();
            System.out.println("Ingresar la duracion de la pelicula: (en horas)");
            Double dur = leer.nextDouble();
            ListaPelis.add(new Pelicula(peli, nom, dur));
            System.out.println("¿Desea agregar otra Pelicula?: (pulse cualquier tecla para seguir agregando, o pulse n para terminar)");
            String eleccion = leer.next();
            if (eleccion.equalsIgnoreCase("n")) {
                aux = false;
            } else {
                aux = true;
            }
        } while (aux == true);

    }

    public void mostrarPeliculaSegun() {
        boolean rep = false;
        boolean salir = false;
        do {
            System.out.println("Menu: ");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. Mostrar en pantalla todas las películas.\n"
                    + "2. Mostrar en pantalla todas las películas con una duración mayor a 1 hora.\n"
                    + "3. Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en \n"
                    + "pantalla.\n"
                    + "4. Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en \n"
                    + "pantalla.\n"
                    + "5. Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.\n"
                    + "6. Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla. \n"
                    + "7. Salir.");

            System.out.println("Ingresar el numero de la opcion a realizar: ");
            int eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    Collections.sort(ListaPelis, Comparador.ordenarXDuracionDesc);
                    for (Pelicula aux : ListaPelis) {
                        System.out.println(aux);
                    }
                    break;
                case 4:
                    Collections.sort(ListaPelis, Comparador.ordenarXDuracionAsc);
                    for (Pelicula aux : ListaPelis) {
                        System.out.println(aux);
                    }
                    break;
                case 5:
                    Collections.sort(ListaPelis, Comparador.ordenarXTituloAlf);
                    for (Pelicula aux : ListaPelis) {
                        System.out.println(aux);
                    }
                    break;
                case 6:
                    Collections.sort(ListaPelis, Comparador.ordenarXAutorAlf);
                    for (Pelicula aux : ListaPelis) {
                        System.out.println(aux);
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
                    rep = true;
            }
        } while (rep == true || salir == false);
    }

    public void opcion1() {
        for (Pelicula aux : ListaPelis) {
            System.out.println(aux);
        }
    }

    public void opcion2() {
        boolean aux = true;
        for (int i = 0; i < ListaPelis.size(); i++) {
            Pelicula m = ListaPelis.get(i);
            if (m.getDuracion() > 1) {
                System.out.println(ListaPelis.get(i));
            } else {
                aux = false;
            }
        }
        if (aux == false) {
            System.out.println("No existe ninguna pelicula con duracion mayor a 1 hs en la lista.");
        }

    }
}
