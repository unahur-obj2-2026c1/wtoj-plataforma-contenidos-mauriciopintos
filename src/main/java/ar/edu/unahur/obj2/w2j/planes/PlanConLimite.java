package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

public abstract class PlanConLimite implements IPlan {

    protected Integer limite;
    protected static Double costoBase = 5.0;

    public PlanConLimite(Integer limite) {
        this.limite = limite;
    }

    @Override
    public Double costoPlan(Usuario usuario) {

        Double costoExcedentes = usuario.getContenidos().stream()
                .skip(limite)
                .mapToDouble(Contenido::getCostoBase)
                .sum();

        Double total = costoBase + costoExcedentes;

        return aplicarAjuste(total);
    }

    // Template Method
    protected abstract Double aplicarAjuste(Double total);

    public static void setCostoBase(Double nuevoCosto) {
        costoBase = nuevoCosto;
    }
}
