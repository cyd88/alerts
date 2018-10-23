package com.github.cyd88.alerts.service;

import com.github.cyd88.alerts.module.GithubRepo;

import java.util.List;


public interface GithubService {

    List<GithubRepo> findByUsername(String username);

}
