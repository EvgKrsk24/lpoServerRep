package ru.czl.lpo.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.czl.lpo.server.entity.InfoDistrict;
import ru.czl.lpo.server.service.InfoDistrictService;

import java.util.List;
import java.util.Optional;

@RestController
public class LpoController {

    @Autowired
    private InfoDistrictService service;

//    @Autowired
//    private InfoDistrictRepository infoDistrictRepository;

    @RequestMapping(value = "/infodistricts", method = RequestMethod.GET)
    @ResponseBody
    public List<InfoDistrict> getAllInfodistricts() {
        return service.getAll();
    }

    @RequestMapping(value = "/infodistricts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public InfoDistrict getInfodistrict(@PathVariable("id") Integer infoID) {
        return service.getByID(infoID);
    }

    @RequestMapping(value = "/infodistricts", method = RequestMethod.POST)
    @ResponseBody
    public InfoDistrict saveAndUpdateInfoDistrict(@RequestBody InfoDistrict infoDistrict) {
        return service.saveAndUpdate(infoDistrict);
    }

    @RequestMapping(value = "/infodistricts/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteInfoDistrict(@PathVariable("id") Integer infoID) {
        service.remove(infoID);
    }



}
