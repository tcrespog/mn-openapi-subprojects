package mn.openapi.subprojects.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import mn.openapi.subprojects.domain.Pet

@Controller("/pet")
class PetController {


    @Get("/")
    Pet getPet() {
        Pet pet = new Pet(id: 1L, name: "Rex", age: 10)

        return pet
    }

}
