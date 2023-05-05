package kz.shaykemelov.example.domain.services;

import java.util.Optional;

import kz.shaykemelov.example.domain.entities.Like;

public interface LikesService
{
    Optional<Like> likePost(String author, long postId);
}
