/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatProtocol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Serializable{
    String id;
    String clave;
    String nombre;
    String state;

    public User(String nombre, String clave) {
        //this.id = id;
        this.clave = clave;
        this.nombre = nombre;
        this.state = "Espera";
    }

    public User(String nombre, String clave, String state) {
        //this.id = id;
        this.clave = clave;
        this.nombre = nombre;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public String getState() {return state;}

    public void setState(String state) {
        this.state = state;
    }
    //public void setId(String id) {
        //this.id = id;
    //}

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
