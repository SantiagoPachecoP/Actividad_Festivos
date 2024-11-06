package api_festivos.api_festivos.controller;

import api_festivos.api_festivos.model.Festivo;
import api_festivos.api_festivos.service.FestivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FestivoController {

    @Autowired
    private FestivoService festivoService;

    // Endpoint para consultar si un festivo existe en la fecha indicada (día y mes)
    @GetMapping("/festivo")
    public String obtenerFestivo(@RequestParam int dia, @RequestParam int mes) {
        // Validar que el mes esté dentro del rango válido
        if (mes < 1 || mes > 12) {
            return "Fecha incorrecta";
        }

        // Validar que el día sea válido según el mes
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia < 1 || dia > 30)) {
            return "Fecha incorrecta";
        }
        if (mes == 2 && (dia < 1 || dia > 29)) {
            return "Fecha incorrecta";
        }
        if ((mes != 2) && (mes != 4 && mes != 6 && mes != 9 && mes != 11) && (dia < 1 || dia > 31)) {
            return "Fecha incorrecta";
        }

        // Consultar si existe un festivo para la fecha
        Festivo festivo = festivoService.obtenerFestivoPorFecha(dia, mes);
        
        // Si no existe el festivo, devolver "false"
        if (festivo == null) {
            return "false";
        }
        
        // Si existe el festivo, devolver "true"
        return "true";
    }
}
