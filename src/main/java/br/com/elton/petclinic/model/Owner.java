package br.com.elton.petclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "owner")
public class Owner extends AbstractModel {

    @Column(name = "address", length = 255, nullable = false)
    private String address;

    @Column(name = "city", length = 255, nullable = false)
    private String city;

    @Column(name = "telephone", length = 50, nullable = false)
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets;

    public Owner(String address, String city, String telephone) {
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = new HashSet<>();

        if (pets != null) {
            this.pets = pets;
        }
    }
}