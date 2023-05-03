package testpublicacion;

/**
 *
 * @author joseph
 */
class Publicacion {

    public Autor autor;//RELACION DE ASOSIACION 
    public int anioPublicacion;

    public Publicacion() {
    }

    public Publicacion(Autor autor, int anioPublicacion) {
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    public String toString() {
        return String.format("Publicacion"
                + "\nAutor: %s"
                + "\nAnio Publicacion: %d",
                this.getAutor(), this.anioPublicacion);
    }

}

class Autor {

    public String nombre;
    public String apellido;

    public Autor() {
    }

    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String toString() {
        return String.format("%s "+
                "%s", this.nombre, this.apellido);
    }
}

public class TestPublicacion {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Jose", "Alvear");
        Publicacion publicacion1 = new Publicacion(autor1, 2000 );
        System.out.println(publicacion1);
    }

}
