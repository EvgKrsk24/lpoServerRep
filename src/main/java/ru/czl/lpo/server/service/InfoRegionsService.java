package ru.czl.lpo.server.service;

import ru.czl.lpo.server.entity.InfoDistrict;
import ru.czl.lpo.server.entity.InfoRegions;

import java.util.List;

public interface InfoRegionsService {
//    List<InfoRegions> getAll();
    InfoRegions getByID(Integer id);
    InfoRegions saveAndUpdate(InfoRegions infoRegions);
    void remove(Integer id);

    List<InfoRegions> findAll();
}
