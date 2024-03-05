package com.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Filiere {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idfiliere", nullable = false)
    private int idfiliere;
    @Basic
    @Column(name = "code", nullable = false, length = 20)
    private String code;
    @Basic
    @Column(name = "libelle", nullable = false, length = 20)
    private String libelle;
    @OneToMany(mappedBy = "filiere")
    private Collection<Etudiant> etudiantsByIdfiliere;

    public int getIdfiliere() {
        return idfiliere;
    }

    public void setIdfiliere(int idfiliere) {
        this.idfiliere = idfiliere;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Collection<Etudiant> getEtudiantsByIdfiliere() {
        return etudiantsByIdfiliere;
    }

    public void setEtudiantsByIdfiliere(Collection<Etudiant> etudiantsByIdfiliere) {
        this.etudiantsByIdfiliere = etudiantsByIdfiliere;
    }
}
