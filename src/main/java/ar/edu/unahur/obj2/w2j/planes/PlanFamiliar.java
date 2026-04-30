package ar.edu.unahur.obj2.w2j.planes;

public class PlanFamiliar extends PlanConLimite {

    private static final Double descuento = 0.15;

    public PlanFamiliar(Integer limite) {
        super(limite);
    }

    @Override
    protected Double aplicarAjuste(Double total) {
        return total * (1 - descuento);
    }
}