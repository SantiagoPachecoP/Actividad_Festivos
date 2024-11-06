package api_festivos.api_festivos.repository;

import api_festivos.api_festivos.model.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FestivoRepository extends JpaRepository<Festivo, Long> {
    // Método para consultar festivo por día y mes
    Festivo findByDiaAndMes(int dia, int mes);
}
