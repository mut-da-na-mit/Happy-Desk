package me.birdsilver.guestbook.domain.interns.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Intern {

    // 멤버 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    // 멤버 이름
    @Column(name = "name", nullable = false)
    private String name;

    // 소개글
    @Column(name = "Introduction", nullable = false)
    private String Introduction;


}