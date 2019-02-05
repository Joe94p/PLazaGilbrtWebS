package edu.uoc.android.restservice.rest.model;
// Esta clase se creo para un mejor entendimiento y seleccion de los seguidores de los usuarios
public class Follower {


    String nombre;
    String url;

    public Follower(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }
}
