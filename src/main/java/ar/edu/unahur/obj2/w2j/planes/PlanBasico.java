package ar.edu.unahur.obj2.w2j.planes;

// TODO: planes/PlanBasico
// #11- Pasar a heredar de PlanConLimite
// #12- Eliminar atributos propios: costoBase deja de ser de instancia
// #13- Eliminar lógica de cálculo duplicada
// #14- Implementar solo: aplicarAjuste(total) → retorna sin cambios

public class PlanBasico extends PlanConLimite {

    public PlanBasico(Integer limite) {
        super(limite);
    }

    @Override
    protected Double aplicarAjuste(Double total) {
        return total; // sin cambios
    }
}