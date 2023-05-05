package kz.shaykemelov.example.api.v1.pub.mappers;

import kz.shaykemelov.example.api.v1.pub.dto.out.CreatePostResponse;
import kz.shaykemelov.example.domain.entities.Post;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface PostsMapper
{
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "author", target = "author"),
            @Mapping(source = "approved", target = "approved"),
    })
    CreatePostResponse mapCreatePostResponse(Post post);
}
