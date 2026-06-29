package models;

import java.util.TreeSet;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
    }
    public Contacto() {
    }

    public Set<Contacto> contruirTreeSetContacto(){
        Set<Contacto> tCSet = new TreeSet<>((c1,c2) -> {
            return c1.getNombre().comparateTo(c2.getNombre());
        });
    }

    
    
}
