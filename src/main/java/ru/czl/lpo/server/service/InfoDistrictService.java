package ru.czl.lpo.server.service;

import ru.czl.lpo.server.entity.InfoDistrict;

import java.util.List;
import java.util.Optional;

public interface InfoDistrictService {
    List<InfoDistrict> getAll();
    InfoDistrict getByID(Integer id);
    InfoDistrict saveAndUpdate(InfoDistrict infoDistrict);
    void remove(Integer id);


}
