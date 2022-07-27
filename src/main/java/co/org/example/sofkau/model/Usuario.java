package co.org.example.sofkau.model;

public class Usuario {
    private String user;
    private String clave;

    public Usuario(String usuario, String clave) {
        this.user = usuario;
        this.clave = clave;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String usuario) {
        this.user = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
