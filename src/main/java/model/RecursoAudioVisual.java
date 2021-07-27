package model;

import java.util.ArrayList;
import java.util.Date;

public abstract class RecursoAudioVisual {

private String titulo;
private Byte[] imagen;
private Date fechaCreacion;
private Integer calificacion;
private ArrayList<Personaje> personajesAsociados;

    public RecursoAudioVisual(String titulo, Byte[] imagen, Date fechaCreacion, Integer calificacion, ArrayList<Personaje> personajesAsociados) {
        this.titulo = titulo;
        this.imagen = imagen;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
        this.personajesAsociados = personajesAsociados;
    }

    public String getTitulo() {
        return titulo;
    }
    public Byte[] getImagen() {
        return imagen;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public Integer getCalificacion() {
        return calificacion;
    }
    public ArrayList<Personaje> getPersonajesAsociados() {
        return personajesAsociados;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setImagen(Byte[] imagen) {
        this.imagen = imagen;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }
    public void setPersonajesAsociados(ArrayList<Personaje> personajesAsociados) {
        this.personajesAsociados = personajesAsociados;
    }
}
