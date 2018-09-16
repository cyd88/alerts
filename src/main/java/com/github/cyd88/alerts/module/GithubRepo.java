package com.github.cyd88.alerts.module;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GithubRepo {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("created_at")
    private ZonedDateTime created_at;
    @JsonProperty("updated_at")
    private ZonedDateTime updatedAt;
    @JsonProperty("language")
    private String language;

}
