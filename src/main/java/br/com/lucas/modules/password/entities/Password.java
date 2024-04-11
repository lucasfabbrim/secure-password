package br.com.lucas.modules.password.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }
}
