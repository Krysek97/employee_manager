package com.app.demo.shifts;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shift")
public class ShiftController {

    private final ShiftService shiftService;

    public ShiftController(ShiftService shiftService) {
        this.shiftService = shiftService;
    }

    @PostMapping("/update")
    public Shift updateShift(@RequestBody Shift shift){
        return shiftService.update(shift);
    }

    @PostMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        shiftService.delete(id);
    }

}
