package kz.shaykemelov.example.api.v1.pri.dto.in;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ApprovePostRequest(
        @JsonProperty("approve")
        boolean approve
)
{
}
