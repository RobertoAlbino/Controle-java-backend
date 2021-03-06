package com.roberto.controle.test.controllers;

import com.roberto.controle.controllers.UsuarioController;
import com.roberto.controle.domain.entities.Usuario;

import org.junit.Before;
import org.junit.Ignore;
import org.mockito.Mock;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

public class UsuarioControllerTest {
    @Mock
    private UsuarioController usuarioController;

    private Usuario usuario;

    @Before
    public void inicializar() {
        usuario = mock(Usuario.class);
    }

    @Ignore
    public void testarSeAtualizaoDeUsuarioBloqueiaUsuarioSemIdInformado() throws Exception {
        usuarioController.atualizarUsuario(this.usuario);
    }
}
