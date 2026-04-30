package ar.edu.unahur.obj2.w2j.contenidos;

// TODO: contenidos/IDRA
// #28- Mantener Singleton
// #29- Reinterpretar: ejemplo didáctico de instancia única

public class IDRA {

    private static IDRA instance = new IDRA();
    
    // valor global compartido por todos los documentales
    private Double valor = 0.5;

    private IDRA() {
    }

    public static IDRA getInstance() {
        return instance;
    }

    // acceso global a la única instancia (Singleton)
    public Double getValor() {
        return valor;
    }

    // seteo global a la única instancia (Singleton)
    public void setValor(Double valor) {
        this.valor = valor;
    }

}