package com.app.demo.vacation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VacationController {


    private final VacationService vacationService;

    @Autowired
    public VacationController(VacationService vacationService) {
        this.vacationService = vacationService;
    }

    @PostMapping("/add")
    public Vacation add(@RequestBody Vacation vacation) {
        return vacationService.add(vacation);
    }

    @GetMapping("/all")
    public List<Vacation> all() {
        return vacationService.all();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        vacationService.deleteById(id);
    }


}
