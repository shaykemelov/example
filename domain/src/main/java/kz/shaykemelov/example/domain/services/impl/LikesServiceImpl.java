package kz.shaykemelov.example.domain.services.impl;

import java.util.Optional;

import kz.shaykemelov.example.domain.entities.Like;
import kz.shaykemelov.example.domain.repositories.LikesRepository;
import kz.shaykemelov.example.domain.repositories.PostsRepository;
import kz.shaykemelov.example.domain.services.LikesService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LikesServiceImpl implements LikesService
{
    private final PostsRepository postsRepository;
    private final LikesRepository likesRepository;

    @Override
    public Optional<Like> likePost(final String author, final long postId)
    {
        return postsRepository.findById(postId)
                              .map(post ->
                                   {
                                       final Like like = new Like();
                                       like.setAuthor(author);
                                       like.setPost(post);

                                       return likesRepository.save(like);
                                   });
    }
}
