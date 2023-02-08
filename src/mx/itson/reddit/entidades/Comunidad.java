/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Xylan
 */
public class Comunidad {
   private String nombre;
   private List<Usuario> integrantes;
   private List<Publicacion> Posts;
   private String descripcion;
   private Date fechacreacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Usuario> integrantes) {
        this.integrantes = integrantes;
    }

    public List<Publicacion> getPosts() {
        return Posts;
    }

    public void setPosts(List<Publicacion> Posts) {
        this.Posts = Posts;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
   
}
