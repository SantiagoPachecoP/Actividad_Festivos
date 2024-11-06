package api_festivos.api_festivos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Festivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int dia;
    private int mes;
    private String nombre;
    private int tipo;
    private int diasPascua;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }
    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getTipo() { return tipo; }
    public void setTipo(int tipo) { this.tipo = tipo; }
    public int getDiasPascua() { return diasPascua; }
    public void setDiasPascua(int diasPascua) { this.diasPascua = diasPascua; }
}
