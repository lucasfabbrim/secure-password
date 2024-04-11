package br.com.lucas.modules.costumer.records;

import br.com.lucas.modules.costumer.entities.Costumer;
import jakarta.validation.constraints.*;

public record CostumerRecord(
        @NotBlank(message = "● É necessário que esteja preenchido os campos.\n ")
        @NotNull(message = "● É necessário que o campo preenchido não seja nulo. \n")
        @Size(min = 8, message = "A senha deve possui pelo menos 08 caracteres.")
        @Pattern(regexp = ".*[1-9]*.", message = "A senha deve conter pelo menos um dígito numérico")
        @Pattern(regexp = ".*[a-z].*", message = "A senha deve conter pelo menos uma letra minúscula.")
        @Pattern(regexp = ".*[A-z].*", message = "A senha deve conter pelo menos uma letra maiúscula.")
        @Pattern(regexp = ".*[\\W].*", message = "A senha deve conter pelo menos um caractere especial (e.g, !@#$%).")
        String password) {

    public Costumer convertToCostumer(){
        return new Costumer(
                this.password
        );
    }
}
