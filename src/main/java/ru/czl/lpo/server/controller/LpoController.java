package ru.czl.lpo.server.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.czl.lpo.server.entity.InfoDistrict;

@RestController
@RequestMapping("/lpo")
public class LpoController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public InfoDistrict getInfoDistrict() {
        return createMockInfoDistrict();
    }

    private InfoDistrict createMockInfoDistrict() {
        InfoDistrict infoDistrict= new InfoDistrict();
        infoDistrict.getId();
        infoDistrict.getName();
        return infoDistrict;
    }

}
