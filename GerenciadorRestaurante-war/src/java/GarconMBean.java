/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.Garcon;
import ejb.GarconFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Gustavo Santana
 */
@Named(value = "garconMBean")
@RequestScoped
public class GarconMBean {

    @EJB
    private GarconFachada garconFachada;
    private Garcon garcon = new Garcon();
    private GerenciadorMesa gMesa = new GerenciadorMesa();

    public GerenciadorMesa getgMesa() {
        return gMesa;
    }

    public void setgMesa(GerenciadorMesa gMesa) {
        this.gMesa = gMesa;
    }

    /**
     * Creates a new instance of GarconMBean
     */
    public GarconMBean() {
    }
    
    public List<Garcon> getListaGarcon(){
        return garconFachada.getListaGarcon();
    }

    public Garcon getGarcon() {
        return garcon;
    }

    public void setGarcon(Garcon garcon) {
        this.garcon = garcon;
    }
    
    public void salvarGarcon(){
        garconFachada.persist(garcon);
    }
    
    
    
    
}
