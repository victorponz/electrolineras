package com.electrolineras.mapa.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Service
public class ExternalApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    public Object getExternalData() {
        String url = "https://datosabiertos.dipcas.es/api/explore/v2.1/catalog/datasets/electrolineras/records";  // Replace with actual URL
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        return response.getBody(); // Jackson converts JSON to LinkedHashMap/List
    }
}
