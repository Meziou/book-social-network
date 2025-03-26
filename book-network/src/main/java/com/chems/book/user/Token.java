package com.chems.book.user;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
public class Token {
	@Id
    @GeneratedValue
    private Integer id;
    private String token;
    private  LocalDateTime creatdeAt;
    private LocalDateTime expiresAt;
    private LocalDateTime validatedAt;

    @ManyToMany
    @JoinColumn(name = "userId", nullable = false)
    private User user;

}
