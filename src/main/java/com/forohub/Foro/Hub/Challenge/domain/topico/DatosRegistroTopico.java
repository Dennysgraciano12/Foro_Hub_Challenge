package com.forohub.Foro.Hub.Challenge.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank String titulo,
        @NotBlank String mensaje,
        @NotNull Long usuarioId,
        @NotNull Long cursoId) {

    public DatosRegistroTopico(String titulo, String mensaje, Long usuarioId, Long cursoId){
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.usuarioId = usuarioId;
        this.cursoId = cursoId;
    }
}
