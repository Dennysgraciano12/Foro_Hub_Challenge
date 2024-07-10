package com.forohub.Foro.Hub.Challenge.domain.topico;

import com.forohub.Foro.Hub.Challenge.domain.curso.Categoria;

import java.time.LocalDateTime;

public record DatosDetalleTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Status status,
        Long usuario,
        Long curso,
        Categoria categoria) {

    public DatosDetalleTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getStatus(), topico.getUsuario().getId(), topico.getCurso().getId(), topico.getCurso().getCategoria());
    }
}
