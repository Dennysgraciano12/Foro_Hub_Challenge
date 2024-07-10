package com.forohub.Foro.Hub.Challenge.domain.curso;

public record DatosActualizarCurso(
        Long id,
        String nombre,
        Categoria categoria,
        Boolean activo){
}
