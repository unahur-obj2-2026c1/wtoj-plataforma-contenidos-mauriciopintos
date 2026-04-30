package ar.edu.unahur.obj2.w2j.usuarios;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.contenidos.Contenido;
import ar.edu.unahur.obj2.w2j.planes.PlanStrategy;
import ar.edu.unahur.obj2.w2j.planes.PlanBasico;

// TODO: usuarios/Usuario
// #21- Cambiar tipo del atributo: IPlan → PlanStrategy
// #22- Renombrar atributo: plan → estrategia
// #23- Renombrar getters/setters: getPlan/setPlan → getEstrategia/setEstrategia
// #24- Mantener delegación: estrategia.costoPlan(this)

public class Usuario {
    private PlanStrategy estrategia = new PlanBasico(10);
    private List<Contenido> contenidos = new ArrayList<>();

    public Usuario(PlanStrategy estrategia, List<Contenido> contenidos) {
        this.estrategia = estrategia;
        this.contenidos = contenidos;
    }

    public Usuario() {
    }

    public Usuario(PlanStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public List<Contenido> getContenidos() {
        return contenidos;
    }

    public void verContenido(Contenido contenido) {
        contenidos.add(contenido);
    }

    public PlanStrategy getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(PlanStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void limpiarContenidos() {
        contenidos.clear();
    }

    public Double costoMensual() {
        return estrategia.costoPlan(this);
    }
}