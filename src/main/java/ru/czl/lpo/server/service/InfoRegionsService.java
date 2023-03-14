package ru.czl.lpo.server.service;

import ru.czl.lpo.server.entity.InfoRegions;

import java.util.List;

public interface InfoRegionsService {

    InfoRegions getByID(Integer id);
//    InfoRegions show(int id);
    void save(InfoRegions infoRegions);
//    void remove(Integer id);
    void update(int id, InfoRegions updateInforegionsid);
    void delete(int id);


    List<InfoRegions> index();
}
