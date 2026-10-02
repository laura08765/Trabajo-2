package Ces2.Trabajo2.modelo;

public class Cultivo {

    private String nombre;
    private String tipo;
    private String ubicacion;
    private Integer cantidadSemillas;

    public Cultivo(String nombre, String tipo, String ubicacion, Integer cantidadSemillas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.cantidadSemillas = cantidadSemillas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Integer getCantidadSemillas() {
        return cantidadSemillas;
    }
}