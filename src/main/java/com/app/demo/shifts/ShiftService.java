package com.app.demo.shifts;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftService {

    private final ShiftRepository shiftRepository;

    public ShiftService(ShiftRepository shiftRepository) {
        this.shiftRepository = shiftRepository;
    }

    public Shift update(Shift shift){
        return shiftRepository.save(shift);
    }

    public void delete(Long id){
        shiftRepository.deleteById(id);
    }

}
