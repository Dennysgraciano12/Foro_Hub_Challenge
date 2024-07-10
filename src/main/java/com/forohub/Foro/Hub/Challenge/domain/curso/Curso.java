package com.forohub.Foro.Hub.Challenge.domain.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cursos")
@Entity(name = "Curso")
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Boolean activo;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(DatosRegistroCurso datosRegistroCurso) {
        this.activo = true;
        this.nombre = datosRegistroCurso.nombre();
        this.categoria = datosRegistroCurso.categoria();
    }

    public void actualizarDatos(DatosActualizarCurso datosActualizarCurso) {

        if(datosActualizarCurso.nombre() != null){
            this.nombre = datosActualizarCurso.nombre();
        }
        if (datosActualizarCurso.categoria() != null){
            this.categoria = datosActualizarCurso.categoria();
        }
        if(datosActualizarCurso.activo() != null){
            this.activo = datosActualizarCurso.activo();
        }
    }

    public void desactivarCurso() {
        this.activo = false;
    }
}
