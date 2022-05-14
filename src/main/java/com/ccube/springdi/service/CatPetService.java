package com.ccube.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cat")
public class CatPetService implements PetService {
    @Override
    public String getPet() {
        return "This is a Cat Service Bean";
    }
}
