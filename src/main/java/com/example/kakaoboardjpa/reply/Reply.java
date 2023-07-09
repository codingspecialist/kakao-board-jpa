package com.example.kakaoboardjpa.reply;

import com.example.kakaoboardjpa.board.Board;
import com.example.kakaoboardjpa.user.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="reply_tb")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Board board;

    @Column(nullable = false)
    private String comment;
}
