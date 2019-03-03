/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.idiomas.dtos;

import java.io.Serializable;

/**
 * ChatDTO Objeto de transferencia de datos del chat. Los DTO contienen
 * las representaciones de los JSON que se transfieren entre el cliente y el
 * servidor.
 * @author g.cubillosb
 */
public class ChatDTO extends ActividadDTO implements Serializable{
    
    // -------------------------------------------------------------------
    // Atributos
    // -------------------------------------------------------------------
    
    /**
     * Atributo que indica el medio del chat
     */
    private String medio;
    
    //---------------------------------------------------------------------
    // Constructor
    // --------------------------------------------------------------------
    
    /**
     * Constructor vacio
     */
    public ChatDTO ()
    {
        super();
    }
    
    /**
     * Constructor básico que crea un chat con el medio pasado por parámetro.
     * @param pMedio El medio en el que se va a realizar el chat.
     */
    public ChatDTO(String pMedio)
    {
        medio = pMedio;
    }
    
    // --------------------------------------------------------------------
    // Métodos
    // --------------------------------------------------------------------

    /**
     * @return the medio
     */
    public String getMedio() {
        return medio;
    }

    /**
     * @param medio the medio to set
     */
    public void setMedio(String medio) {
        this.medio = medio;
    }
    
}
