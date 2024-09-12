package com.example.testeapi.configs.scheduler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

public class KeepAliveScheduler {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${https://teste-api-deploy-render.onrender.com/get-user/randomuser}")
    private String baseUrl;

    @Scheduled(fixedRate = 600_000)
    public void keepAlive() {
        try {
            String url = baseUrl + "/ping";
            String response = restTemplate.getForObject(url, String.class);
            System.out.println("Keep-Alive request successful, response " + response);
        } catch (Exception e) {
            System.err.println("Keep-alive request failed: " + e.getMessage());
        }
    }
}
