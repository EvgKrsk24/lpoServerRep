package ru.czl.lpo.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.czl.lpo.server.entity.InfoDistrict;
import ru.czl.lpo.server.repository.InfoDistrictRepository;

import java.util.List;
import java.util.Optional;

@Service
public class InfoDistrictServiceImpl implements InfoDistrictService {

    @Autowired
    private InfoDistrictRepository repository;

    @Override
    public List<InfoDistrict> getAll() {
        return repository.findAll();
    }

    @Override
    public InfoDistrict getByID(Integer id){
        return repository.findById(id).orElse(null);
    }

    @Override
    public InfoDistrict saveAndUpdate(InfoDistrict infoDistrict) {
        return repository.saveAndFlush(infoDistrict);
    }

    @Override
    public void remove(Integer id) {
        repository.deleteById(id);
    }
}
