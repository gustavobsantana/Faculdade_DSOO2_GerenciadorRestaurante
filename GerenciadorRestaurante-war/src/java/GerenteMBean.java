/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.Gerente;
import ejb.GerenteFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Gustavo Santana
 */
@Named(value = "gerenteMBean")
@RequestScoped
public class GerenteMBean {

    @EJB
    private GerenteFachada gerenteFachada;

    /**
     * Creates a new instance of GerenteMBean
     */
    public GerenteMBean() {
    }
    
        public List<Gerente> getListaGerente(){
        return gerenteFachada.getListaGerente();
    }
    
}
