package ru.czl.lpo.server.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // Таимлиф не расспознает кириллицу
    @GetMapping("/testregions") //http://localhost:8080/inforegions/testregions
    public String testRegions() { return "InfoRegions/test"; }

    @GetMapping() //http://localhost:8080/inforegions
    public String index(Model model) {
        model.addAttribute("inforegionsall", infoRegionsService.index());
       return "InfoRegions/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("inforegionsid", infoRegionsService.getByID(id));
        return "InfoRegions/getbyid";
    }

////    @RequestMapping(value = "/inforegions", method = RequestMethod.GET)
////    @ResponseBody
//    @GetMapping("/allregions")
//    public List<InfoRegions> getAllInforegions() {
//    return infoRegionsService.index() ;
//    } // Перевести в timeleaf


}
