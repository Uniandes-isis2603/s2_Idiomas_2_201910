/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.idiomas.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import uk.co.jemos.podam.common.PodamExclude;

/**
 *
 * @author j.barbosaj
 */
@Entity
public class CoordinadorEntity  extends BaseEntity implements Serializable
{
     String contraseña;
    String nombre;
    
    @PodamExclude
    @ManyToMany(mappedBy = "coordinadores")
    private List<ActividadEntity> actividadesCoordinadas = new ArrayList<>();
    /**
     * Connstructor vacio de un Entity
     */
    public CoordinadorEntity()
    {
        
    }
    
    /**
     * Retorna la contraseña de un Entity
     * @return contraseña la contrseña
     */
    public String getContraseña() {
        return contraseña;
    }
    
    /**
     * Asigna una contraseña a un Entity
     * @param contraseña 
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Retorna el nombre del Entity
     * @return nombre -el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nombre al Entity
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
