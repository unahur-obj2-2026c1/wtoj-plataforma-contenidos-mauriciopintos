package ar.edu.unahur.obj2.w2j.planes;

public class PlanBasico extends PlanConLimite {

    public PlanBasico(Integer limite) {
        super(limite);
    }

    @Override
    protected Double aplicarAjuste(Double total) {
        return total; // sin cambios
    }
}