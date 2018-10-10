
import ejb.Garcon;
import ejb.Mesa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo Santana
 */
class GerenciadorMesa {
    Mesa mesa = new Mesa();
    Garcon garcon = new Garcon();
    String nomeGarcon;
    int numeroMesa;
    

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Garcon getGarcon() {
        return garcon;
    }

    public void setGarcon(Garcon garcon) {
        this.garcon = garcon;
    }

    public String getNomeGarcon() {
        return nomeGarcon;
    }

    public void setNomeGarcon(String nomeGarcon) {
        this.nomeGarcon = nomeGarcon;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }
}
