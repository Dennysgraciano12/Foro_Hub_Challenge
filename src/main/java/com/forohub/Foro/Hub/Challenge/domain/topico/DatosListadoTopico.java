package com.forohub.Foro.Hub.Challenge.domain.topico;

import java.time.LocalDateTime;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        Status status,
        LocalDateTime date,
        String usuario_id,
        String curso_id) {

    public DatosListadoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getStatus(), topico.getFechaCreacion(), topico.getUsuario().getLogin(), topico.getCurso().getNombre());
    }
}
