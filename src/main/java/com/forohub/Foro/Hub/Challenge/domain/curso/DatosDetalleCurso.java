package com.forohub.Foro.Hub.Challenge.domain.curso;

public record DatosDetalleCurso(
        Long id,
        String nombre,
        Categoria categoria,
        Boolean activo) {

    public DatosDetalleCurso(Curso curso){
        this(curso.getId(), curso.getNombre(), curso.getCategoria(), curso.getActivo());
    }
}
