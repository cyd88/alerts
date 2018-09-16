package com.github.cyd88.alerts.service;

import com.github.cyd88.alerts.module.GithubRepo;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface GithubService {

    List<GithubRepo> findByUsername(String username);

}
