package Utilidades04;

import Entidades04.Pelicula;
import java.util.Comparator;

/**
 *
 * @author NeuenMartinez
 */
public class Comparador {

    public static Comparator<Pelicula> ordenarXDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarXDuracionAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarXTituloAlf = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarXAutorAlf = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getAutor().compareTo(t1.getAutor());
        }
    };
}
