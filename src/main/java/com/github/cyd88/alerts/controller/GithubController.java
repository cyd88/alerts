package com.github.cyd88.alerts.controller;

import com.github.cyd88.alerts.module.GithubRepo;
import com.github.cyd88.alerts.service.GithubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GithubController {

    private GithubService service;

    @Autowired
    public GithubController(GithubService service) {
        this.service = service;
    }


    @GetMapping("/repositories/{username}")
    public ResponseEntity<List<GithubRepo>> findByUsername(@PathVariable("username") String username) {

        List<GithubRepo> response = service.findByUsername(username);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
