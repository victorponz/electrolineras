package com.electrolineras.mapa.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Service
public class ExternalApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    /**
     * Hemos de comprobar el campo total_count para saber si hemos de paginar
     * mediante sucesivas llamadas api pasándole el offest correspondiente
     * Si, por ejemplo, total_count = 40, haremos 2 peticiones, la segunda con
     * un offset de 20
     * @return
     */
    public Object getExternalData(String lat, String lng) {
        //String url = "https://datosabiertos.dipcas.es/api/explore/v2.1/catalog/datasets/electrolineras/records?limit=20";  // Replace with actual URL
        String url = "https://datosabiertos.dipcas.es/api/explore/v2.1/catalog/datasets/electrolineras/records?within_distance(coordenadas,%20geom%27POINT(" + lat + "%20" + lng + ")%27,%201km)%27&limit=20";
        System.out.println(url);
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        return response.getBody(); // Jackson converts JSON to LinkedHashMap/List
    }
}
