package br.com.lucas.modules.costumer.records;

import br.com.lucas.modules.costumer.entities.Costumer;
import jakarta.validation.constraints.*;

public record CostumerRecord(

        @NotBlank(message = "● All fields are required.\n")
        @NotNull(message = "● The field must not be null.\n")
        @Size(min = 8, message = "The password must have at least 8 characters.\n")
        @Pattern(regexp = ".*\\d.*", message = "The password must contain at least one numeric digit.\n")
        @Pattern(regexp = ".*[a-z].*", message = "The password must contain at least one lowercase letter.\n")
        @Pattern(regexp = ".*[A-Z].*", message = "The password must contain at least one uppercase letter.\n")
        @Pattern(regexp = ".*\\W.*", message = "The password must contain at least one special character (e.g., !@#$%).\n")

        String password) {

    public Costumer convertToCostumer(){
        return new Costumer(
                this.password
        );
    }
}
