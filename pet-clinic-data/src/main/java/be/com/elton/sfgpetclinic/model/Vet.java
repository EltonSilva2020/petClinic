package be.com.elton.sfgpetclinic.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "speciality", referencedColumnName = "id"))
    private Set<Speciality> specialities;

    public Vet() {
        this.specialities = new HashSet<>();
    }
}
