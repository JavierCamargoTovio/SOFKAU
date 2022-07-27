package co.org.example.sofkau.util.manager;

import co.org.example.sofkau.model.Usuario;
import static co.org.example.sofkau.util.constants.Constants.Usuarios.*;

public class GestionUsuarios {
    private GestionUsuarios() {
    }

    public static Usuario getUser() {
        return new Usuario(USUARIO, CLAVE);

    }

    public static Usuario getUsuarioInvalido() {
        return new Usuario(USUARIO_INVALIDO, CLAVE_INVALIDA);

    }
}
