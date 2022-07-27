package co.org.example.sofkau.util.constants;

import co.org.example.sofkau.exceptions.ExceptionHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Constants {

    private Constants() {

    }

    private static final String RUTA_PROPERTIES = "src/test/resources/properties/configuracion.properties";

    private static final Properties PROPERTIES = loadProperties();

    public static final String URL = PROPERTIES.getProperty("url");
    public static final String NAME_USER = PROPERTIES.getProperty("nameUsuario");

    public static Properties loadProperties() {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(RUTA_PROPERTIES)) {
            properties.load(fis);
        } catch (IOException e) {
            throw new ExceptionHandling("Error en la carga del documento" + e);
        }
        return properties;
    }


    public static class Usuarios {

        public static final String USUARIO = PROPERTIES.getProperty("usario");
        public static final String CLAVE = PROPERTIES.getProperty("clave");

        private Usuarios() {
        }
    }
}