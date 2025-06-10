package com.electrolineras.mapa.controller;

import com.electrolineras.mapa.service.ExternalApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapaController {
    private final ExternalApiService externalApiService;

    public MapaController(ExternalApiService externalApiService) {
        this.externalApiService = externalApiService;
    }
    //https://help.opendatasoft.com/apis/ods-explore-v2/#section/Opendatasoft-Query-Language-(ODSQL)/Where-clause
    //within_distance(coordenadas, geom'POINT(-0.10582 40.61933)', 100km)
    //https://datosabiertos.dipcas.es/api/explore/v2.1/catalog/datasets/electrolineras/records?where=within_distance(coordenadas%2C%20geom%27POINT(-0.10582%2040.61933)%27%2C%20100km)&limit=20


    @GetMapping("/electrolineras")
    public Object getData(@RequestParam(name="lat", required = false) String lat, @RequestParam(name="lng", required = false) String lng) {
        return externalApiService.getExternalData(lat, lng);
    }
}