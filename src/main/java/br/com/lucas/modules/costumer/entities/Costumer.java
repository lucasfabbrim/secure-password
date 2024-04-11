package br.com.lucas.modules.costumer.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Costumer {

    private String password;

    public Costumer(String password) {
        this.password = password;
    }

}
