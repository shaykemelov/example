package kz.shaykemelov.example.domain.services.impl;

import kz.shaykemelov.example.domain.entities.Post;
import kz.shaykemelov.example.domain.repositories.PostsRepository;
import kz.shaykemelov.example.domain.services.PostsService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostsServiceImpl implements PostsService
{
    private final PostsRepository postsRepository;

    @Override
    public Post createPost(final Post post)
    {
        return postsRepository.save(post);
    }

    @Override
    public void approvePost(final long id, boolean approve)
    {
        postsRepository.approve(id, approve);
    }
}
