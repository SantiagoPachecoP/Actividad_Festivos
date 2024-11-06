package api_festivos.api_festivos.service;

import api_festivos.api_festivos.model.Festivo;
import api_festivos.api_festivos.repository.FestivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FestivoService {
    
    @Autowired
    private FestivoRepository festivoRepository;

    // Método para obtener el festivo por fecha (día y mes)
    public Festivo obtenerFestivoPorFecha(int dia, int mes) {
        return festivoRepository.findByDiaAndMes(dia, mes);
    }
}
