package sfgpetclinic.demo.services.map;

import org.springframework.stereotype.Service;
import sfgpetclinic.demo.model.Vet;
import sfgpetclinic.demo.services.CrudService;
import sfgpetclinic.demo.services.VetService;

import java.util.Set;
@Service
public class VetServiceMap extends AbstarctMapService<Vet,Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
    super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }
}
