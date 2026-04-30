package ar.edu.unahur.obj2.w2j.planes;

// TODO: planes/PlanFamiliar
// #15- Eliminar atributos duplicados: costoBase y lógica de excedentes
// #16- Pasar a heredar de PlanConLimite
// #17- Mantener solo: descuento
// #18- Implementar: aplicarAjuste(total) → aplica descuento

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