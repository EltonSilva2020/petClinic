package br.com.elton.sfgpetclinic.services;

import br.com.elton.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
