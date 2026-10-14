package com.electrolineras.mapa.controller;

import com.electrolineras.mapa.service.ExternalApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapaRestController {
    private final ExternalApiService externalApiService;

    MapaRestController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }

    @GetMapping("/electrolineras")
    public Object getData(@RequestParam(name="lat", required = false) String lat, @RequestParam(name="lng", required = false) String lng) {
        return externalApiService.getExternalData(lat, lng);
    }
}