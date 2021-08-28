package com.heroes.heroes.controllers;

import com.heroes.heroes.entities.HeroEntity;
import com.heroes.heroes.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class HeroController {
    private HeroService heroService;
    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }
    
    @GetMapping("/getMock")
    public ResponseEntity<List<HeroEntity>> getMockHeroes(){
        return new ResponseEntity<>(heroService.getMockHeroes(), HttpStatus.OK);
    }
}
