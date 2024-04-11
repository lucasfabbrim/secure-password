package br.com.lucas.modules.password.controller;

import br.com.lucas.modules.password.entities.Password;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class PasswordController {

    @PostMapping("/validate-password")
    public ResponseEntity<Password> getPassword(){
        return null;
    }
    
}
