package kz.shaykemelov.example.domain.services;

import kz.shaykemelov.example.domain.entities.Post;

public interface PostsService
{
    Post createPost(Post post);

    void approvePost(long id, boolean approve);
}
