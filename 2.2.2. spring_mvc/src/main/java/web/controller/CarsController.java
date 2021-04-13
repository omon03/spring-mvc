package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.DaoCar;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private DaoCar daoCar;

    public CarsController(DaoCar daoCar) {
        this.daoCar = daoCar;
    }

    @GetMapping
    public String cars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        System.out.println(daoCar.getListCars(count));
        model.addAttribute("cars", daoCar.getListCars(count));

        return "cars";
    }
}
