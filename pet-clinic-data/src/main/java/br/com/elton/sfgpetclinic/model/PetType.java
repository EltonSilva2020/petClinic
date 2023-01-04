package br.com.elton.sfgpetclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Types")
public class PetType extends AbstractModel {

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    public PetType(String name) {
        this.name = name;
    }
}
