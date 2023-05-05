package kz.shaykemelov.example.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import kz.shaykemelov.example.domain.entities.internal.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_posts")
public class Post extends AbstractEntity
{
    @Column(name = "author", nullable = false, length = 32)
    private String author;

    @Column(name = "text", nullable = false, length = 128)
    private String text;

    @Column(name = "approved", nullable = false)
    private boolean approved = false;
}
