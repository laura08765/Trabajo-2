package Ces2.Trabajo2.modelo;

import java.util.List;

public class JardinBotanico implements Cultivable {

    private String nombre;
    private List<Cultivo> cultivos;

    public JardinBotanico(String nombre, List<Cultivo> cultivos) {
        this.nombre = nombre;
        this.cultivos = cultivos;
    }

    @Override
    public String sembrar(Cultivo cultivo) {
        return "El " + nombre + " siembra el cultivo "
                + cultivo.getNombre() + " de tipo " + cultivo.getTipo();
    }

    @Override
    public String regar(Cultivo cultivo) {
        return "El " + nombre + " riega el cultivo "
                + cultivo.getNombre() + " ubicado en " + cultivo.getUbicacion();
    }

    @Override
    public String cosechar(Cultivo cultivo) {
        return "El " + nombre + " cosecha el cultivo "
                + cultivo.getNombre() + " con "
                + cultivo.getCantidadSemillas() + " semillas";
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public List<Cultivo> getCultivos() {
        return cultivos;
    }
}