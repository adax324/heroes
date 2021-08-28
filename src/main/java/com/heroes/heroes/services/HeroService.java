package com.heroes.heroes.services;

import com.heroes.heroes.entities.HeroEntity;
import com.heroes.heroes.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService {
    private HeroRepository heroRepo;
    @Autowired
    public HeroService(HeroRepository heroRepo) {
        this.heroRepo = heroRepo;
    }




    public List<HeroEntity> getMockHeroes(){
        return
                heroRepo.findAll();
    }
}
