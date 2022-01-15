package org.learning.springdilearning;

import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements PetService {
    @Override
    public String getBestPet() {
        return "COW";
    }
}
