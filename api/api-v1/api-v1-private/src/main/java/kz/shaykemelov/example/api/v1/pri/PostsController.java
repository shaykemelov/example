package kz.shaykemelov.example.api.v1.pri;

import kz.shaykemelov.example.api.v1.pri.dto.in.ApprovePostRequest;
import kz.shaykemelov.example.domain.services.PostsService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController("privatePostsController")
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/private/posts",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
)
public class PostsController
{
    private final PostsService postsService;

    @PostMapping("/{post_id}/approves")
    public void approvePost(
            @PathVariable("post_id")
            final long postId,
            @RequestBody
            final ApprovePostRequest approvePostRequest
    )
    {
        postsService.approvePost(postId, approvePostRequest.approve());
    }
}
