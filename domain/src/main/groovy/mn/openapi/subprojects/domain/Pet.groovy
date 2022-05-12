package mn.openapi.subprojects.domain

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.Entity
import javax.persistence.Id
import javax.validation.constraints.Size

@Entity
class Pet {

    @Id
    Long id

    @Size(max = 100)
    String name

    @JsonIgnore
    Integer age
}
