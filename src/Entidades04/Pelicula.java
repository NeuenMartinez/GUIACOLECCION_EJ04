package Entidades04;

/**
 *
 * @author NeuenMartinez
 */
public class Pelicula {

    private String titulo;
    private String autor;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String autor, Double duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo: " + titulo + ", autor: " + autor + ", duracion: " + duracion + '}';
    }
    
    
}
