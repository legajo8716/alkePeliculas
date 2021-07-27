package model;

import java.util.ArrayList;
import java.util.Date;

public class Serie extends RecursoAudioVisual {
    public Serie(String titulo, Byte[] imagen, Date fechaCreacion, Integer calificacion, ArrayList<Personaje> personajesAsociados) {
        super(titulo, imagen, fechaCreacion, calificacion, personajesAsociados);
    }
}
