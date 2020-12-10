package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarsController {


    @GetMapping(value = "/cars")
    public String carMethod(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        CarServiceImp serviceImp = new CarServiceImp();
        List<Car> cars = serviceImp.getCars(count);
        model.addAttribute("carAttribute", cars);
        return "cars";
    }
}
