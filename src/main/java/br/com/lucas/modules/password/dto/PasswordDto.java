package br.com.lucas.modules.password.dto;

import br.com.lucas.modules.password.entities.Password;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PasswordDto(
        @NotNull @NotBlank @Min(8)
        String password) {

    public Password toPassword(){
        return
                new Password(password);
    }

}
