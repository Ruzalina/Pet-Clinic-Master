package sfgpetclinic.demo.services.map;

import org.springframework.stereotype.Service;
import sfgpetclinic.demo.model.Pet;
import sfgpetclinic.demo.services.PetService;

import java.util.Set;
@Service
public class PetServiceMap extends AbstarctMapService<Pet,Long>implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
super.deleteById(id);
    }
}
