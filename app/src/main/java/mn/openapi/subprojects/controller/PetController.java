package mn.openapi.subprojects.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import mn.openapi.subprojects.domain.Pet;

@Controller("/pet")
public class PetController {


    @Get("/")
    public Pet getPet() {
        Pet pet = new Pet();
        pet.setId(1L);
        pet.setName("Rex");
        pet.setAge(10);

        return pet;
    }

}
