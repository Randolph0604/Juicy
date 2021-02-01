package com.example.dell.juicy;

public class usuario {
    private String nombre_p;
    private String clave;

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public usuario(String nombre_p, String clave) {

        this.nombre_p = nombre_p;
        this.clave = clave;
    }
}
