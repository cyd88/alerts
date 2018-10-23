package com.github.cyd88.alerts.module;

import org.junit.Test;

import java.time.ZonedDateTime;
import static org.assertj.core.api.Assertions.assertThat;

public class GithubRepoTest {

    @Test
    public void isModified() {

        ZonedDateTime current = ZonedDateTime.parse("2018-10-23T13:35:20Z");
        GithubRepo githubRepo = new GithubRepo();
        ZonedDateTime updatedAt = ZonedDateTime.parse("2018-10-23T13:36:20Z");
        githubRepo.setUpdatedAt(updatedAt);

        boolean isModified = githubRepo.isModified(current);
        assertThat(isModified).isTrue();

    }
}