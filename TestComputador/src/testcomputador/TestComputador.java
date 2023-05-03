package testcomputador;

/**
 *
 * @author joseph
 */
class Computador {

    public String tipoProcesador;
    public UnidadDVD unidadDVD;

    public Computador() {
    }

    public Computador(String tipoProcesador, UnidadDVD unidadDVD) {
        this.tipoProcesador = tipoProcesador;
        this.unidadDVD = unidadDVD;
    }

    public String getTipoProcesador() {
        return this.tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public UnidadDVD getUnidadDVD() {
        return this.unidadDVD;
    }

    public void setUnidadDVD(UnidadDVD unidadDVD) {
        this.unidadDVD = unidadDVD;
    }

    public String toString() {
        return String.format("Computador"
                + "\nTipo procesador: %s"
                + "\nUnidad DVD: %s",
                this.tipoProcesador, this.unidadDVD);
    }

}

class UnidadDVD {

    public String marca;

    public UnidadDVD() {
    }

    public UnidadDVD(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String toString() {
        return String.format("Marca de unidad DvD: %s", this.marca);
    }

}

public class TestComputador {

    public static void main(String[] args) {
        UnidadDVD unidadDVD1 = new UnidadDVD("Toshiba");
        Computador computador1 = new Computador("intel", unidadDVD1);
        System.out.println(computador1);
    }

}
