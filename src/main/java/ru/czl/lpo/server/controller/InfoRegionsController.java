package ru.czl.lpo.server.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.czl.lpo.server.entity.InfoRegions;
import ru.czl.lpo.server.service.InfoRegionsService;

import java.util.List;

@Controller
@RequestMapping("/inforegions") // префикс(вложеннный каталог) для всех страниц ниже
public class InfoRegionsController {

    @Autowired
    public InfoRegionsService infoRegionsService;

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


    @GetMapping("/new")// 22lv
    public String newRegion(@ModelAttribute("inforegionsid") InfoRegions infoRegions) { // peremen, new InfoRegions 16:00
        return "InfoRegions/new"; }

    @PostMapping
    public String create(@ModelAttribute("inforegionsid") InfoRegions infoRegions) {
//        InfoRegionsService.save(infoRegions);
        infoRegionsService.save(infoRegions);
        return "redirect:/inforegions"; // указываем адрес а не ссылку views
    }

    @GetMapping("/{id}/edit")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("inforegionsid", infoRegionsService.getByID(id));
        return "InfoRegions/edit";
    }

//    @GetMapping("/{id}/edit")
//    public String edit(Model model, @PathVariable("id") int id) {
//        model.addAttribute("inforegion",infoRegionsService.getByID(id));
//        return "InfoRegions/edit";
//    }


    @PatchMapping("/{id}")
    public String update(@ModelAttribute("inforegionsid") InfoRegions inforegionsid, @PathVariable("id") int id) {
        infoRegionsService.update(id, inforegionsid);
        return  "redirect:/inforegions";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        infoRegionsService.delete(id);
        return "redirect:/inforegions";
    }



////    @RequestMapping(value = "/inforegions", method = RequestMethod.GET)
////    @ResponseBody
//    @GetMapping("/allregions")
//    public List<InfoRegions> getAllInforegions() {
//    return infoRegionsService.index() ;
//    } // Перевести в timeleaf


}
