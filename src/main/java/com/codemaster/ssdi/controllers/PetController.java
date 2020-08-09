package com.codemaster.ssdi.controllers;

import com.codemaster.ssdi.services.PetService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getPetSer() {
        return petService.getPetService();
    }
}
