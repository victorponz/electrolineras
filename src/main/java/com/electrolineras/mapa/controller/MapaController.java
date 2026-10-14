package com.electrolineras.mapa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MapaController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}