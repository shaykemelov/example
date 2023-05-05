package kz.shaykemelov.example.domain.repositories;

import kz.shaykemelov.example.domain.entities.Post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Post, Long>
{
    @Modifying
    @Query(value = "UPDATE tbl_posts SET approved = :approve WHERE id = :id", nativeQuery = true)
    void approve(
            @Param("id")
            final long postId,
            @Param("approve")
            final boolean approve
    );
}
