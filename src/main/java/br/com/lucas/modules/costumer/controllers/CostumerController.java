package br.com.lucas.modules.costumer.controllers;

import br.com.lucas.modules.costumer.records.CostumerRecord;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@RequestMapping()
public class CostumerController {

    @PostMapping("/validate-password")
    public ResponseEntity<String> createCostumer(@RequestBody @Valid CostumerRecord costumerRecord, BindingResult bindingResult) {
        if(bindingResult.hasErrors()){
            System.out.println("Validation Error: '" + costumerRecord.password() + "' is an incorrect password!");
            return ResponseEntity.badRequest().body(bindingResult
                    .getAllErrors()
                    .stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.joining("\n● ")));
        }else{

            var costumer = costumerRecord.convertToCostumer();
            System.out.println("Password approved: '" + costumerRecord.password() + "'.");
            return ResponseEntity.ok().body("Password approved! '" + costumer.getPassword() + "'.");
        }
    }
}
