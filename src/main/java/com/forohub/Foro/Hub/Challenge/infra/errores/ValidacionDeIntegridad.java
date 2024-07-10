package com.forohub.Foro.Hub.Challenge.infra.errores;

public class ValidacionDeIntegridad extends RuntimeException {
    public ValidacionDeIntegridad(String s){
        super(s);
    }
}

