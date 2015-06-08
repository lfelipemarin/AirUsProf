/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author dx
 */
@Entity
public class Socio extends Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "millas")
    private int millas;

    @Column(name = "pass")
    private String pass;

    /**
     * @return the millas
     */
    public int getMillas() {
        return millas;
    }

    /**
     * @param millas the millas to set
     */
    public void setMillas(int millas) {
        this.millas = millas;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

}
