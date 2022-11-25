package ru.czl.lpo.server.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.czl.lpo.server.entity.InfoRegions;
import ru.czl.lpo.server.service.InfoRegionsService;

import java.util.List;

@Controller
@RequestMapping("/inforegions")
public class InfoRegionsController {

    @Autowired
    public InfoRegionsService infoRegionsService;
   // private InfoRegionsRepository infoRegionsRepository; // заменен на timeleaf??

//   private InfoRegionsService infoRegionsService;

    @GetMapping("/testregions") //http://localhost:8080/inforegions/testregions
    public String testRegions() { return "InfoRegions/test"; }

    @GetMapping()
    public String index(Model model) {
       return null;
    }

//    @RequestMapping(value = "/inforegions", method = RequestMethod.GET)
//    @ResponseBody
    @GetMapping("/allregions")
    public List<InfoRegions> getAllInforegions() {
    return infoRegionsService.findAll() ;
    } // Перевести в timeleaf


}
