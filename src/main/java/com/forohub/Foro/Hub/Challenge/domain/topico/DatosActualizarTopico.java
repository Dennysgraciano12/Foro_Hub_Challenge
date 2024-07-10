package com.forohub.Foro.Hub.Challenge.domain.topico;

public record DatosActualizarTopico(
        Long id,
        String titulo,
        String mensaje,
        Status status,
        Long usuarioId,
        Long cursoId) {

}
