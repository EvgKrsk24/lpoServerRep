package ru.czl.lpo.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.czl.lpo.server.entity.InfoRegions;
import ru.czl.lpo.server.repository.InfoRegionsRepository;

import java.util.List;

@Controller
@RequestMapping("/inforegions")
public class InfoRegionsController {
//РАСКОМЕНТИРУЙ
    @Autowired
    private InfoRegionsRepository infoRegionsRepository;

    @GetMapping("/testregions") //http://localhost:8080/inforegions/testregions
    public String testRegions() { return "InfoRegions/test"; }

//    @RequestMapping(value = "/inforegions", method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping("/allregions")
    public List<InfoRegions> getAllInforegions() {
    return infoRegionsRepository.findAll() ;
    } // Перевести в timeliaf


}
