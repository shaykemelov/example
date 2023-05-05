package kz.shaykemelov.example.domain.entities;

import jakarta.persistence.*;

import kz.shaykemelov.example.domain.entities.internal.AbstractEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_likes")
public class Like extends AbstractEntity
{
    @Column(name = "author")
    private String author;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Post post;
}
