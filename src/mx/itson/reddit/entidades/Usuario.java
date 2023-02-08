/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.entidades;

import java.util.List;

/**
 *
 * @author Xylan
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;
    private String pais;
    private List<Comentario> comentarios; 
    private List<Publicacion> posts;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String password) {
        this.contrasenia = password;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Publicacion> getPosts() {
        return posts;
    }

    public void setPosts(List<Publicacion> posts) {
        this.posts = posts;
    }

}
