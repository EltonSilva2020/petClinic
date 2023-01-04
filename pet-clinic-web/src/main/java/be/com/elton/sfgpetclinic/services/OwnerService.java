package be.com.elton.sfgpetclinic.services;

import br.com.elton.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
