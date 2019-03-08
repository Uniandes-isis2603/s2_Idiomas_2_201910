/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.idiomas.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author se.gamboa
 */
@Entity
public class ComentarioBlogEntity extends ComentarioEntity implements Serializable{
    

    private String titulo;
    
    /**
     * Constructor vacío de comentarioBlogEntity.
     */
    public ComentarioBlogEntity()
    {
        
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
