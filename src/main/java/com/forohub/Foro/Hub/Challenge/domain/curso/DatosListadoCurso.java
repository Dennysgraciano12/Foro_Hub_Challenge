package com.forohub.Foro.Hub.Challenge.domain.curso;

public record DatosListadoCurso(
        Long id,
        String nombre,
        Categoria categoria,
        Boolean activo) {

    public DatosListadoCurso(Curso curso){
        this(curso.getId(), curso.getNombre(), curso.getCategoria(), curso.getActivo());
    }
}
