package ru.czl.lpo.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.czl.lpo.server.entity.InfoRegions;
import ru.czl.lpo.server.repository.InfoRegionsRepository;

import java.util.List;

@Service
public class InfoRegionsServiceImpl implements InfoRegionsService {

    @Autowired
    private InfoRegionsRepository repository;

//    @Override
//    public List<InfoRegions> getAll() { return repository.findAll();  }

    @Override
    public List<InfoRegions> index() {
    return repository.findAll();
}

    @Override
    public InfoRegions getByID(Integer id) {
        return repository.findById(id).orElse(null);
    } //show (only id)

//    @Override
//    public InfoRegions show(int id) {
//        return null;
//       // inforegions.stream().filter(person -> person.getId() == id).findAny().orElse(null);
//    }

//    @Override
//    public InfoRegions saveAndUpdate(InfoRegions infoRegions) {return repository.saveAndFlush(infoRegions); }

    @Override
    public void save(InfoRegions infoRegions) {
        repository.saveAndFlush(infoRegions);
       // repository.save(infoRegions);

    }
//    @Override
//    public void remove(Integer id) { repository.deleteById(id);  }

    @Override
    public void update(int id, InfoRegions updateInforegionsid) {
        InfoRegions infoRegionsToBeUpdate = getByID(id);

        infoRegionsToBeUpdate.setName(updateInforegionsid.getName());
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }


}
