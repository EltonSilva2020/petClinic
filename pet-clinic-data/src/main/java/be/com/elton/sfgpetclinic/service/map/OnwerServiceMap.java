package be.com.elton.sfgpetclinic.service.map;

import be.com.elton.sfgpetclinic.model.Owner;
import be.com.elton.sfgpetclinic.service.CrudService;

import java.util.Set;

public class OnwerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
