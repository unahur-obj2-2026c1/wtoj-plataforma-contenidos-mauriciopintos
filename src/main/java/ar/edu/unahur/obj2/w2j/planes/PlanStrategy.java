package ar.edu.unahur.obj2.w2j.planes;

import ar.edu.unahur.obj2.w2j.usuarios.Usuario;
// TODO: IPlan → PlanStrategy
// #1- Renombrar interfaz (IPlan → PlanStrategy)
//      VSCode te ayuda a actualizar en todo el proyecto si cambias el nombre del archivo
// #2- Mantener misma firma del método (costoPlan)
// #3- Reinterpretar como Strategy explícita

public interface PlanStrategy {
    Double costoPlan(Usuario usuario);
}