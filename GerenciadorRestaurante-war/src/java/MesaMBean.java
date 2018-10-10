/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.GarconFachada;
import ejb.Mesa;
import ejb.MesaFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Gustavo Santana
 */
@Named(value = "mesaMBean")
@RequestScoped
public class MesaMBean {

    @EJB
    private GarconFachada garconFachada;

    @EJB
    private MesaFachada mesaFachada;
    private Mesa mesa = new Mesa();
    

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    /**
     * Creates a new instance of MesaMBean
     */
    public MesaMBean() {
    }

    public List<Mesa> getListaMesa() {
        return mesaFachada.getListaMesa();
    }
    
    public void abrirMesa(){
        mesa.setGarcon(1);
        mesaFachada.persist(mesa);
    }

}

