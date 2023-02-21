package be.com.elton.sfgpetclinic.repositories;

import be.com.elton.sfgpetclinic.model.AbstractModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractRepository<T extends AbstractModel> extends JpaRepository<T, Long> {

}
