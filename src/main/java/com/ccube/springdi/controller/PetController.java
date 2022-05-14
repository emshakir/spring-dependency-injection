package com.ccube.springdi.controller;

import com.ccube.springdi.service.PetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getPetType() {
        return petService.getPet();
    }
}
