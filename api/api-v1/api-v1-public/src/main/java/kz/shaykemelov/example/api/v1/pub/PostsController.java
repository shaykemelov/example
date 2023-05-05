package kz.shaykemelov.example.api.v1.pub;

import kz.shaykemelov.example.api.v1.pub.dto.in.CreatePostRequest;
import kz.shaykemelov.example.api.v1.pub.dto.out.CreatePostResponse;
import kz.shaykemelov.example.api.v1.pub.mappers.PostsMapper;
import kz.shaykemelov.example.domain.entities.Post;
import kz.shaykemelov.example.domain.services.PostsService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController("publicPostsController")
@RequestMapping(value = "/api/v1/public/posts",
                consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE
)
@RequiredArgsConstructor
public class PostsController
{
    private final PostsService postsService;

    private final PostsMapper postsMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreatePostResponse createPost(
            @RequestBody
            final CreatePostRequest createPostRequest)
    {
        final Post post = new Post();
        post.setAuthor(createPostRequest.author());
        post.setText(createPostRequest.text());

        final Post createdPost = postsService.createPost(post);
        return postsMapper.mapCreatePostResponse(createdPost);
    }
}
