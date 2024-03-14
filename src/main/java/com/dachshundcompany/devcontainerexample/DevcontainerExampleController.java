package com.dachshundcompany.devcontainerexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevcontainerExampleController {

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo";
    }
}