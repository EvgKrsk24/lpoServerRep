package ru.czl.lpo.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.czl.lpo.server.entity.InfoRegions;
import ru.czl.lpo.server.repository.InfoDistrictRepository;
import ru.czl.lpo.server.repository.InfoRegionsRepository;

import java.util.List;

public class InfoRegionsServiceImpl implements InfoRegionsService {

    @Autowired
    private InfoRegionsRepository repository;

    @Override
    public List<InfoRegions> getAll() {
        return repository.findAll();
    }

    @Override
    public InfoRegions getByID(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public InfoRegions saveAndUpdate(InfoRegions infoRegions) {return repository.saveAndFlush(infoRegions); }

    @Override
    public void remove(Integer id) { repository.deleteById(id);  }
}
