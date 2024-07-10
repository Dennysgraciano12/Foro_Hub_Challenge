package com.forohub.Foro.Hub.Challenge.domain.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroCurso(
        @NotBlank(message = "Nombre es obligatorio")
        String nombre,
        @NotNull(message = "Categoria es obligatorio")
        Categoria categoria) {
}
