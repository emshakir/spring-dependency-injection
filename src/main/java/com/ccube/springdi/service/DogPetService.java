package com.ccube.springdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dog", "default"})
public class DogPetService implements PetService {
    @Override
    public String getPet() {
        return "This is a Dog Service Bean";
    }
}
