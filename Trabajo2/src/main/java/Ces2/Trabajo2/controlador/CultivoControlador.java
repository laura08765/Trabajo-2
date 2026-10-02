package Ces2.Trabajo2.controlador;

import Ces2.Trabajo2.modelo.Cultivable;
import Ces2.Trabajo2.modelo.Cultivo;
import Ces2.Trabajo2.repositorio.CultivoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;


@Controller
public class CultivoControlador {

    private CultivoRepository cultivoRepository = new CultivoRepository();

    @GetMapping("/peticion1")
    public String peticion1(Model model) {

        List<Cultivable> cultivables = cultivoRepository.getCultivables();

        String nombres = cultivables.stream()
                .map(Cultivable::getNombre)
                .collect(java.util.stream.Collectors.joining(", "));

        model.addAttribute("nombres", nombres);

        return "peticion1";
    }

    @GetMapping("/peticion2")
    public String peticion2(Model model) {

        List<Cultivable> cultivables = cultivoRepository.getCultivables();

        java.util.IntSummaryStatistics estadisticas = cultivables.stream()
                .collect(java.util.stream.Collectors.summarizingInt(
                        cultivable -> cultivable.getCultivos().size()
                ));

        model.addAttribute("conteo", estadisticas.getCount());
        model.addAttribute("suma", estadisticas.getSum());
        model.addAttribute("promedio", estadisticas.getAverage());
        model.addAttribute("min", estadisticas.getMin());
        model.addAttribute("max", estadisticas.getMax());

        return "peticion2";
    }
    @GetMapping("/peticion3")
    public String peticion3(Model model) {

        List<String> nombresCultivos = cultivoRepository.getCultivables().stream()
                .flatMap(cultivable -> cultivable.getCultivos().stream())
                .map(Cultivo::getNombre)
                .toList();

        model.addAttribute("nombresCultivos", nombresCultivos);

        return "peticion3";
    }

    @GetMapping("/peticion4")
    public String peticion4(Model model) {

        List<Cultivo> cultivos = cultivoRepository.getCultivables().stream()
                .flatMap(cultivable -> cultivable.getCultivos().stream())
                .toList();

        boolean hayHortaliza = cultivos.stream()
                .anyMatch(cultivo -> cultivo.getTipo().equals("Hortaliza"));

        boolean hayMasDe80Semillas = cultivos.stream()
                .anyMatch(cultivo -> cultivo.getCantidadSemillas() > 80);

        boolean ningunoEstaEnLaPlaya = cultivos.stream()
                .noneMatch(cultivo -> cultivo.getUbicacion().equals("Playa"));

        model.addAttribute("hayHortaliza", hayHortaliza);
        model.addAttribute("hayMasDe80Semillas", hayMasDe80Semillas);
        model.addAttribute("ningunoEstaEnLaPlaya", ningunoEstaEnLaPlaya);

        return "peticion4";
    }

    @GetMapping("/peticion5")
    public String peticion5(Model model) {

        List<Cultivo> cultivos = cultivoRepository.getCultivables().stream()
                .flatMap(cultivable -> cultivable.getCultivos().stream())
                .toList();

        Cultivo cultivoMayor = cultivos.stream()
                .max((cultivo1, cultivo2) ->
                        cultivo1.getCantidadSemillas()
                                .compareTo(cultivo2.getCantidadSemillas()))
                .orElse(null);

        model.addAttribute("cultivoMayor", cultivoMayor);

        return "peticion5";
    }
}
