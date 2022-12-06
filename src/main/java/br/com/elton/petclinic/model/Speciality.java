package br.com.elton.petclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "specialties")
public class Speciality extends AbstractModel {

    @Column(name = "description", length = 255, nullable = false)
    private String description;

}
