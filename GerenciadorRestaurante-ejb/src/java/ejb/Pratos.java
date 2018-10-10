/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Gustavo Santana
 */
@Entity
@Table(name = "PRATOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pratos.findAll", query = "SELECT p FROM Pratos p")
    , @NamedQuery(name = "Pratos.findById", query = "SELECT p FROM Pratos p WHERE p.id = :id")
    , @NamedQuery(name = "Pratos.findByNome", query = "SELECT p FROM Pratos p WHERE p.nome = :nome")
    , @NamedQuery(name = "Pratos.findByTipo", query = "SELECT p FROM Pratos p WHERE p.tipo = :tipo")
    , @NamedQuery(name = "Pratos.findByValor", query = "SELECT p FROM Pratos p WHERE p.valor = :valor")})
public class Pratos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "NOME")
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "TIPO")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR")
    private double valor;

    public Pratos() {
    }

    public Pratos(Integer id) {
        this.id = id;
    }

    public Pratos(Integer id, String nome, String tipo, double valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pratos)) {
            return false;
        }
        Pratos other = (Pratos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Pratos[ id=" + id + " ]";
    }
    
}
