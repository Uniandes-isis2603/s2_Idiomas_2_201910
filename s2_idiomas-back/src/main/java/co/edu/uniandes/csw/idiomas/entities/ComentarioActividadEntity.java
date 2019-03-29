/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.idiomas.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import uk.co.jemos.podam.common.PodamExclude;

/**
 *
 * @author se.gamboa
 */
@Entity
public class ComentarioActividadEntity extends ComentarioEntity implements Serializable{
    
    
    /**
     * Atributo que representa los comentarios de la actividad.
     */
    @PodamExclude
    @ManyToOne
    private ActividadEntity actividad;
    
    /**
     * Constructor vacío de comentarioActividadEntity.
     */
    public ComentarioActividadEntity()
    {
        
    }

    /**
     * @return the actividad
     */
    public ActividadEntity getActividad() {
        return actividad;
    }

    /**
     * @param actividad the actividad to set
     */
    public void setActividad(ActividadEntity actividad) {
        this.actividad = actividad;
    }
    
    
}
