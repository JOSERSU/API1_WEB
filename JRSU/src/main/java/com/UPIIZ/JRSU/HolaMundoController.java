package com.UPIIZ.JRSU;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Anotaciones - Decoraciones
@RestController
public class HolaMundoController {

    @GetMapping("/holamundo")
    public String holaMundo(){
        return "Hola Mundo con el método Get";
    }

    @GetMapping("/holamundodos")
    public String holMmundodos(){
        return "Hola Mundo Dos con el método Get";
    }
}
