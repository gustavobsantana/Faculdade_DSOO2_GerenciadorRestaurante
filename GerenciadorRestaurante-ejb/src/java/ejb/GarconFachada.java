/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Gustavo Santana
 */
@Stateless
@LocalBean
public class GarconFachada {

    @PersistenceContext(unitName = "GerenciadorRestaurante-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    public List<ejb.Garcon> getListaGarcon() {
        Query query = em.createNamedQuery("Garcon.findAll");
        return query.getResultList();
    }
    
    public Garcon getByCpf(String cpf){
        Query query = em.createNamedQuery("Garcon.findByCpf").setParameter("cpf", cpf);
        
        List<Garcon> list = query.getResultList();
        
        if(list.isEmpty()){
            return null;
        } else {
            return list.get(0);
        }
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
