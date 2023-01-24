package be.com.elton.sfgpetclinic.services;

import be.com.elton.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
