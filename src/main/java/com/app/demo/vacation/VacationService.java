package com.app.demo.vacation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacationService {

    private final VacationRepository vacationRepository;

    @Autowired
    public VacationService(VacationRepository vacationRepository) {
        this.vacationRepository = vacationRepository;
    }

    public Vacation add(Vacation vacation){
        return vacationRepository.save(vacation);
    }

    public List<Vacation> all(){
        return vacationRepository.findAll();
    }

    public void deleteById (Long id){
        vacationRepository.deleteById(id);
    }

}
