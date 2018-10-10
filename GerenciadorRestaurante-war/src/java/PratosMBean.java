/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.Pratos;
import ejb.PratosFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Gustavo Santana
 */
@Named(value = "pratosMBean")
@RequestScoped
public class PratosMBean {

    @EJB
    private PratosFachada pratosFachada;

    /**
     * Creates a new instance of PratosMBean
     */
    public PratosMBean() {
    }

    public List<Pratos> getListaPratos() {
        return pratosFachada.getListaPratos();
    }

}
