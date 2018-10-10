/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejb.Ingrediente;
import ejb.IngredienteFachada;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Gustavo Santana
 */
@Named(value = "ingredienteMBean")
@RequestScoped
public class IngredienteMBean {

    @EJB
    private IngredienteFachada ingredienteFachada;
    private Ingrediente ingrediente = new Ingrediente();

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    /**
     * Creates a new instance of IngredienteMBean
     */
    public IngredienteMBean() {
    }

    public List<Ingrediente> getListaIngrediente() {
        return ingredienteFachada.getListaIngrediente();
    }

    public void salvarIngrediente(){
        ingredienteFachada.persist(ingrediente);
    }
}
