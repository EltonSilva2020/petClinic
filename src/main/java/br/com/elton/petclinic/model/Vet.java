package br.com.elton.petclinic.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends AbstractModel {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "speciality", referencedColumnName = "id"))
    private Set<Speciality> speciality;

    public Vet() {
        this.speciality = new HashSet<>();
    }
}
