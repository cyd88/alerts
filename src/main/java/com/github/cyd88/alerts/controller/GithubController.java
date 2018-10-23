package com.github.cyd88.alerts.controller;

import com.github.cyd88.alerts.module.GithubRepo;
import com.github.cyd88.alerts.service.GithubService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class GithubController {

    private GithubService service;

    public GithubController(GithubService service) {
        this.service = service;
    }


    @GetMapping("/repositories/{username}")
    public List<GithubRepo> findByUsername(@PathVariable("username")  String username) {

        List<GithubRepo> githubRepos;
        githubRepos = service.findByUsername(username)
                            .stream()
                            .filter(githubRepo -> githubRepo.isModified(ZonedDateTime.now()))
                            .sorted(Comparator.comparing(GithubRepo::getName))
                            .collect(Collectors.toList());

        return githubRepos;
    }
}
