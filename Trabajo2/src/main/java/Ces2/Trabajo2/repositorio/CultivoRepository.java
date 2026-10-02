package Ces2.Trabajo2.repositorio;


import Ces2.Trabajo2.modelo.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CultivoRepository {

    private List<Cultivable> cultivables;

    public CultivoRepository() {

        Cultivo cultivo1 = new Cultivo("Tomate", "Hortaliza", "Invernadero", 50);
        Cultivo cultivo2 = new Cultivo("Zanahoria", "Hortaliza", "Huerta", 80);
        Cultivo cultivo3 = new Cultivo("Lechuga", "Hortaliza", "Invernadero", 40);
        Cultivo cultivo4 = new Cultivo("Maíz", "Grano", "Campo", 100);
        Cultivo cultivo5 = new Cultivo("Frijol", "Leguminosa", "Campo", 70);
        Cultivo cultivo6 = new Cultivo("Fresa", "Fruta", "Jardín", 60);
        Cultivo cultivo7 = new Cultivo("Pepino", "Hortaliza", "Huerta", 90);
        Cultivo cultivo8 = new Cultivo("Papa", "Tubérculo", "Campo", 120);
        Cultivo cultivo9 = new Cultivo("Cebolla", "Hortaliza", "Huerta", 75);
        Cultivo cultivo10 = new Cultivo("Manzana", "Fruta", "Jardín", 45);

        List<Cultivo> lista0 = new ArrayList<>();

        List<Cultivo> lista1 = Arrays.asList(
                cultivo1
        );

        List<Cultivo> lista2 = Arrays.asList(
                cultivo1,
                cultivo2
        );

        List<Cultivo> lista3 = Arrays.asList(
                cultivo1,
                cultivo2,
                cultivo3
        );

        List<Cultivo> lista4 = Arrays.asList(
                cultivo1,
                cultivo2,
                cultivo3,
                cultivo4
        );

        List<Cultivo> lista5 = Arrays.asList(
                cultivo1,
                cultivo2,
                cultivo3,
                cultivo4,
                cultivo5
        );

        Cultivable agricultor1 = new Agricultor("Agricultor 1", lista0);
        Cultivable agricultor2 = new Agricultor("Agricultor 2", lista1);
        Cultivable agricultor3 = new Agricultor("Agricultor 3", lista2);
        Cultivable agricultor4 = new Agricultor("Agricultor 4", lista3);

        Cultivable hidroponia1 = new Hidroponia("Hidroponia 1", lista4);
        Cultivable hidroponia2 = new Hidroponia("Hidroponia 2", lista5);
        Cultivable hidroponia3 = new Hidroponia("Hidroponia 3", lista0);
        Cultivable hidroponia4 = new Hidroponia("Hidroponia 4", lista1);

        Cultivable jardin1 = new JardinBotanico("Jardin Botanico 1", lista2);
        Cultivable jardin2 = new JardinBotanico("Jardin Botanico 2", lista3);
        Cultivable jardin3 = new JardinBotanico("Jardin Botanico 3", lista4);
        Cultivable jardin4 = new JardinBotanico("Jardin Botanico 4", lista5);

        cultivables = Arrays.asList(
                agricultor1,
                agricultor2,
                agricultor3,
                agricultor4,
                hidroponia1,
                hidroponia2,
                hidroponia3,
                hidroponia4,
                jardin1,
                jardin2,
                jardin3,
                jardin4
        );
    }

    public List<Cultivable> getCultivables() {
        return cultivables;
    }
}