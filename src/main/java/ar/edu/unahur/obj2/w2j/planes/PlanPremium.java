package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;

// TODO: planes/PlanPremium
//#19- Cambiar implementación: implements IPlan → implements PlanStrategy
// #20- Sin cambios en lógica

public class PlanPremium implements PlanStrategy {

    private Double costoPlan;

    public PlanPremium(Double costoPlan) {
        this.costoPlan = costoPlan;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        return this.costoPlan;
    }

}