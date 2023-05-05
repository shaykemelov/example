package kz.shaykemelov.example.api.v1.pub.dto.out;

import com.fasterxml.jackson.annotation.JsonProperty;

public record CreatePostResponse(
        @JsonProperty("id")
        long id,
        @JsonProperty("author")
        String author,
        @JsonProperty("approved")
        boolean approved,
        @JsonProperty("text")
        String text
)
{
}
