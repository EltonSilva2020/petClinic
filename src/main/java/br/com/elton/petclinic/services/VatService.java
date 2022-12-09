package br.com.elton.petclinic.services;

import br.com.elton.petclinic.model.Vet;

import java.util.Set;

public interface VatService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
