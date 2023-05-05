package kz.shaykemelov.example.api.v1.pub.dto.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CreatePostRequest(
        @JsonProperty("author")
        String author,
        @JsonProperty("text")
        String text
)
{
}