package Ces2.Trabajo2.modelo;

import java.util.List;

public interface Cultivable extends Sembrar, Regar, Cosechar {

    String getNombre();

    List<Cultivo> getCultivos();


}
