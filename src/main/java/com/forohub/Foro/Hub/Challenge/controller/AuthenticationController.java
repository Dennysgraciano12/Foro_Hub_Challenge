package com.forohub.Foro.Hub.Challenge.controller;

import com.forohub.Foro.Hub.Challenge.domain.usuario.DatosAutentificacionUsuario;
import com.forohub.Foro.Hub.Challenge.domain.usuario.Usuario;
import com.forohub.Foro.Hub.Challenge.infra.security.DatosJWTToken;
import com.forohub.Foro.Hub.Challenge.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutentificacionUsuario datosAutentificacionUsuario){
        Authentication authentoken = new UsernamePasswordAuthenticationToken(datosAutentificacionUsuario.login(), datosAutentificacionUsuario.clave());
        authenticationManager.authenticate(authentoken);
        var usuarioAtenticado = authenticationManager.authenticate(authentoken);
        var JWTtoken = tokenService.generarToken((Usuario)usuarioAtenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }
}
