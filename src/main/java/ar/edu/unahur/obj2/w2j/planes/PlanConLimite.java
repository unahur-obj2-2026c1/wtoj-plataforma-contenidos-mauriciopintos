package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

// todo: planes/PlanConLimite (NUEVA CLASE)
// #4- Crear clase abstracta
// #5- Mover atributo: limite
// #6 Convertir costoBase en: static (compartido)
// #7- Centralizar algoritmo en costoPlan: calcular excedentes (skip) Y sumar costo base
// #8- Introducir Template Method: llamada a aplicarAjuste(total)
// #9- Definir método abstracto: aplicarAjuste (hook del template)
// #10- Agregar método: setCostoBase (static)


public abstract class PlanConLimite implements PlanStrategy {

    protected Integer limite;

    // valor compartido por todos los planes con límite (pertenece a la clase, no a la instancia)
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

        // uso de atributo estático: mismo valor para todas las instancias
        Double total = costoBase + costoExcedentes;

        return aplicarAjuste(total);
    }

    // Template Method: define el algoritmo de cálculo del costo
    // y delega el ajuste final a las subclases
    protected abstract Double aplicarAjuste(Double total);

    // modifica el costo base para TODOS los planes con límite
    public static void setCostoBase(Double nuevoCosto) {
        costoBase = nuevoCosto;
    }
}
