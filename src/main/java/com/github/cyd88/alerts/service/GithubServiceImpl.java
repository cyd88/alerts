package com.github.cyd88.alerts.service;

import com.github.cyd88.alerts.module.GithubRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.springframework.http.HttpMethod.GET;

@RequiredArgsConstructor
@Service
@Slf4j
public class GithubServiceImpl implements GithubService {

    private final static String URL = "https://api.github.com/users/{username}/repos";
    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<GithubRepo> findByUsername(String username) {
        ParameterizedTypeReference<List<GithubRepo>> responseType = new ParameterizedTypeReference<List<GithubRepo>>() {
        };

        ResponseEntity<List<GithubRepo>> response = restTemplate
                .exchange(URL, GET, null, responseType, username);


        return response.getBody();
    }


}
