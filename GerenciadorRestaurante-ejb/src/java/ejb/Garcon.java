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
@Table(name = "GARCON")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Garcon.findAll", query = "SELECT g FROM Garcon g")
    , @NamedQuery(name = "Garcon.findByCpf", query = "SELECT g FROM Garcon g WHERE g.cpf = :cpf")
    , @NamedQuery(name = "Garcon.findBySenha", query = "SELECT g FROM Garcon g WHERE g.senha = :senha")
    , @NamedQuery(name = "Garcon.findByNome", query = "SELECT g FROM Garcon g WHERE g.nome = :nome")})
public class Garcon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CPF")
    private Integer cpf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "SENHA")
    private String senha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "NOME")
    private String nome;

    public Garcon() {
    }

    public Garcon(Integer cpf) {
        this.cpf = cpf;
    }

    public Garcon(Integer cpf, String senha, String nome) {
        this.cpf = cpf;
        this.senha = senha;
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Garcon)) {
            return false;
        }
        Garcon other = (Garcon) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Garcon[ cpf=" + cpf + " ]";
    }
    
}
